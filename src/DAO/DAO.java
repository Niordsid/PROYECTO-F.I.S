/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import capa_datos.ConectarBD;
import capa_logica.Administrador;
import capa_logica.Documento;
import capa_logica.Estudiante;
import capa_presentacion.ModificarEstudiante;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class DAO {

    Estudiante Est = new Estudiante();
    Documento Doc = new Documento();
    Administrador Adm = new Administrador();

    public String AccesoEstudiante(String usuario, String Clave) {
        String cadena = "SELECT K_IDESTUDIANTE, K_CLAVESTUDIANTE FROM ESTUDIANTE WHERE (K_IDESTUDIANTE='" + usuario + "') and (K_CLAVESTUDIANTE='" + Clave + "')";
        ModificarEstudiante RE = new ModificarEstudiante();
        RE.mod(usuario);
        RE.setVisible(true);

        return cadena;
    }

    public String AccesoAdmin(String usuario, String Clave) {
        String cadena = "SELECT K_IDADMIN, K_IDCLAVEADMIN FROM ADMINISTRADOR WHERE (K_IDADMIN='" + usuario + "') and (K_IDCLAVEADMIN='" + Clave + "')";
        ModificarEstudiante RE = new ModificarEstudiante();
        RE.setVisible(true);
        return cadena;
    }

    public String registrarEstudiante() {

        String cadena = "insert INTO estudiante VALUES('" + Est.getId_estudiante() + "','" + Est.getId_contraseña() + "','" + Est.getNombre_estudiante() + "','" + Est.getApellido_estudiante() + "','" + Est.getDireccion_correo_e() + "','" + Est.getProyecto_curricular() + "','" + Est.getFacultad() + "','" + Est.getValor_matricula() + "')";
        return cadena;
    }

    public String modificarEstudiante(String codigo, String clave, String nombre, String apellido, String correo, String proyecto, String facultad, String valorm) {

        String cadena = "UPDATE ESTUDIANTE SET K_CLAVESTUDIANTE='" + clave + "', N_NOMBRESTUDIANTE='" + nombre + "', N_APELLIDOESTUDIANTE='" + apellido + "', D_CORREO='" + correo + "',D_PROYECTOCURRICULAR='" + proyecto + "',D_FACULTAD='" + facultad + "',D_VALORMATRICULA='" + valorm + "' WHERE K_IDESTUDIANTE='" + codigo + "' ";
        return cadena;
    }

    public String elegirEstudiante() {
        String cadena = "select FROM ESTUDIANTE WHERE (K_IDESTUDIANTE ='" + Est.getId_estudiante() + "')";
        return cadena;

    }

    public String eliminacionEstudiante() {
        String cadena = "delete FROM ESTUDIANTE WHERE (K_IDESTUDIANTE ='" + Est.getId_estudiante() + "')";
        return cadena;

    }

    public String eliminarTodos() {
        String cadena = "delete FROM ESTUDIANTE";
        return cadena;
    }

    public String consultarTodos() {
        String cadena = "select * FROM ESTUDIANTE";
        return cadena;
    }

    public String consultarEstudiante() {
        String cadena = "select * FROM ESTUDIANTE WHERE (N_NOMBRESTUDIANTE='" + Est.getNombre_estudiante() + "')";
        return cadena;
    }

    public String registrarDocumento() {
        String cadena = "insert INTO documento VALUES('" + Doc.getId_estudiante() + "','" + Doc.getId_documento() + "','" + Doc.getNombre_documento() + "','" + Doc.getRuta() + "')";
        return cadena;
    }

    public String registrarAdmin() {
        String cadena = "insert INTO administrador VALUES('" + Adm.getId_admin() + "','" + Adm.getId_contraseñaadmin() + "','" + Adm.getNombre_admin() + "','" + Adm.getApellido_admin() + "')";
        return cadena;
    }

    public String modificarAdmin() {
        String cadena = "UPDATE administrador set " + Adm.getModifiStr() + " = '" + Adm.getModifi() + "' WHERE (K_IDADMIN ='" + Adm.getId_admin() + "')";
        return cadena;
    }

    public String elegirAdmin() {
        String cadena = "select FROM administrador WHERE (K_IDADMIN ='" + Adm.getId_admin() + "')";
        return cadena;

    }

    public String eliminacionAdmin() {
        String cadena = "delete FROM administrador WHERE (K_IDADMIN='" + Adm.getId_admin() + "')";
        return cadena;

    }

    public String eliminarTodosAdm() {
        String cadena = "delete FROM administrador";
        return cadena;
    }

    public String consultarTodosAdm() {
        String cadena = "select * FROM administrador";
        return cadena;
    }

    public String consultarAdmin() {
        String cadena = "select * FROM administrador WHERE (N_NOMBREADMIN='" + Adm.getNombre_admin() + "')";
        return cadena;
    }

    //Funcion Para poder consultar si la contraseña ingresada se encuentra en la base de datos
    public String ConsultarContraseña() {
        String cadena = "select K_IDCLAVEADMIN FROM administrador WHERE (K_IDCLAVEADMIN='" + Adm.getId_contraseñaadmin() + "')";
        return cadena;
    }
}
