/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_datos;

/**
 *
 * Clase que contiene los métdos para conectarse a la base de datos de
 * PostgreSQL
 */
import capa_logica.Documento;
import capa_presentacion.ConsultarEstudiantes;
import capa_presentacion.ModificarEstudiante;
import java.awt.Image;
import java.io.*;
import java.sql.*;
import java.util.Iterator;
import javax.imageio.*;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;

public class ConectarBD {
    //declaracion de atributos

    private Connection dbConecta;
    private String CadenaSql;
    private ResultSet rs;
    private Statement statement = null;

    //el constructor de la clase crea la conexion con la base de datos
    public ConectarBD(String pNombreServidor, String pNumeroPuerto, String pNombreBD, String pUsuario, String pPassword) {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            String cone = "jdbc:postgresql://" + pNombreServidor + ":" + pNumeroPuerto + "/" + pNombreBD;
            dbConecta = DriverManager.getConnection(cone, pUsuario, pPassword);
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    public void SetCadena(String cadena) {
        CadenaSql = cadena;
    }

    /**
     * //ejecutar transacciones (insertar, actualizar, eliminar)
     *
     */
    public String EjecutarSql() {
        String rta = "";
        try {
            Statement stmt = dbConecta.createStatement();
            rta += stmt.executeUpdate(CadenaSql);
            dbConecta.close();

        } catch (SQLException ex) {
            rta = ex.getMessage();
        }
        return rta;
    }

    /**
     * //ejecutar consultas
     */
    public ResultSet Consultar() {
        ResultSet tabla = null;
        try {
            Statement stmt = dbConecta.createStatement();
            tabla = stmt.executeQuery(CadenaSql);
            //dbConecta.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tabla;
    }

    public ResultSet GetResultado(String Sql) {
        this.rs = null;
        try {
            Statement stamento = this.dbConecta.createStatement();
            rs = stamento.executeQuery(Sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "------------" + ex.getMessage());

        }

        return rs;
    }
    /*
     * metodo que guarda una imagen JPG en la base de datos input: ID :
     * identificador unico para el registro, osea primary key name: nombre de la
     * imagen para reconocerlo mas adelante ruta: direccion absoluta de la
     * imagen JPG
     */

    public boolean guardarImagen(String idestud, String iddoc, String name, String ruta) {
        FileInputStream fis = null;
        try {
            File file = new File(ruta);
            fis = new FileInputStream(file);
            PreparedStatement pstm = dbConecta.prepareStatement("INSERT into " + " DOCUMENTO(K_IDESTUDIANTE,K_IDDOCUMENTO, N_NOMBREDOCUMENTO, D_ARCHIVO) " + " VALUES(?,?,?,?)");
            pstm.setString(1, idestud);
            pstm.setString(2, iddoc);
            pstm.setString(3, name);
            pstm.setBinaryStream(4, fis, (int) file.length());
            pstm.execute();
            pstm.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }
    /*
     * Metodo que convierte una cadena de bytes en una imagen JPG input: bytes:
     * array que contiene los binarios de la imagen Output: la foto JPG en
     * formato IMAGE
     */

    private Image ConvertirImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator readers = ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader reader = (ImageReader) readers.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        return reader.read(0, param);
    }

    /*
     * Metodo que extrae los registros de la tabla IMAGEN de la base de datos
     * crea instancia nueva de la clase imagen.java y añade los datos agrega
     * estos datos a un DefaultListModel output: dml: Es un DefaultListModel que
     * contiene instancia de la clase imagen.java
     */
    public DefaultListModel Lista_Imagenes() {
        DefaultListModel dml = new DefaultListModel();
        try {
            statement = dbConecta.createStatement();
            rs = statement.executeQuery("SELECT id,nombre,archivo FROM imagen ");
            while (rs.next()) {  //se crea un objeto CITA y se le van agregando los datos
                Documento img = new Documento();
                img.setId_estudiante(rs.getString("K_IDESTUDIANTE"));
                img.setId_documento(rs.getString("K_IDDOCUMENTO"));
                img.setNombre_documento(rs.getString("N_NOMBREDOCUMENTO"));
                try { //antes de agregar el campo imagen, realiza la conversion de bytes a JPG
                    img.setD_archivo(ConvertirImagen(rs.getBytes("D_ARCHIVO")));
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
                //por ultimo añade el objeto imagen:img al DefaultListModel
                dml.addElement(img);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return dml;
    }

    /**
     * //cierra la base de datos; se utiliza con el metodo consultar, despues
     * de realizar la consulta
     */
    public void cerrarBase() {
        try {
            dbConecta.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
