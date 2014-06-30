/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_presentacion;

import capa_datos.ConectarBD;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AndreStereo
 */
public class ConsultarEstudiantes extends javax.swing.JFrame {

    ConectarBD Pg = new ConectarBD("localhost", "5432", "ApoyoAlimentario", "postgres", "bmx92103057509");
    private DefaultListModel modListaImagen = new DefaultListModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultartodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        consultarcodigo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        consultartodos.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        consultartodos.setText("CONSULTAR");
        consultartodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultartodosActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRES", "APELLIDOS", "CORREO", "PROYECTO CURRICULAR", "FAULTAD", "VALOR MATRICULA"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jTextField1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("CONSULTAR POR CODIGO:");

        consultarcodigo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        consultarcodigo.setText("CONSULTAR");
        consultarcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarcodigoActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capa_presentacion/recursos/header_home_page3.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(486, 486, 486)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(779, 779, 779)
                                .addComponent(consultartodos))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultarcodigo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(consultarcodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(consultartodos)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ConsultarEstudiantes() {
        initComponents();
    }

//Se conecta a la base de datos y obtiene registros
    private void actualizar_lista() {
        this.modListaImagen.clear();
        this.modListaImagen = Pg.Lista_Imagenes();
        // this.Lista_Imagenes.setModel(modListaImagen);
    }

    private void consultartodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultartodosActionPerformed
        ConectarBD con = new ConectarBD("localhost", "5432", "ApoyoAlimentario", "postgres", "bmx92103057509");
        ResultSet GetResultado = con.GetResultado("select * from estudiante");
        actualizarTabla(Tabla, GetResultado);
        con.cerrarBase();

    }//GEN-LAST:event_consultartodosActionPerformed

    private void consultarcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarcodigoActionPerformed
        ConectarBD con = new ConectarBD("localhost", "5432", "ApoyoAlimentario", "postgres", "bmx92103057509");
        String codigoestudiante = consultarcodigo.getText();
        ResultSet GetResultado = con.GetResultado("select * from estudiante where (K_IDESTUDIANTE='" + codigoestudiante + " ')");
        actualizarTabla(Tabla, GetResultado);
        con.cerrarBase();
    }//GEN-LAST:event_consultarcodigoActionPerformed

    public static void actualizarTabla(JTable jtabla, ResultSet rs) {
        DefaultTableModel modelo = new DefaultTableModel();
        jtabla.setModel(modelo);
        try {
            modelo.addColumn("CODIGO");
            modelo.addColumn("NOMBRES");
            modelo.addColumn("APELLIDOS");
            modelo.addColumn("CORREO");
            modelo.addColumn("PROYECTO CURRICULAR");
            modelo.addColumn("FACULTAD");
            modelo.addColumn("VALOR MATRICULA");
            while (rs.next()) {
                Object[] ob = new Object[8];
                ob[0] = (rs.getString("k_idestudiante"));
                ob[1] = (rs.getString("n_nombrestudiante"));
                ob[2] = (rs.getString("n_apellidoestudiante"));
                ob[3] = (rs.getString("d_correo"));
                ob[4] = (rs.getString("d_proyectocurricular"));
                ob[5] = (rs.getString("d_facultad"));
                ob[6] = (rs.getString("d_valormatricula"));
                modelo.addRow(ob);
                ob = null;
            }
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ConsultarEstudiantes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton consultarcodigo;
    private javax.swing.JButton consultartodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
