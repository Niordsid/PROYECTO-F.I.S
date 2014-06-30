/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_presentacion;

import capa_datos.ConectarBD;
import static capa_presentacion.ConsultarEstudiantes.actualizarTabla;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudiantes
 */
public class ConsultarEstudiante_Estud extends javax.swing.JFrame {

    ConectarBD Pg = new ConectarBD("localhost", "5432", "ApoyoAlimentario", "postgres", "bmx92103057509");
    private DefaultListModel modListaImagen = new DefaultListModel();

    public ConsultarEstudiante_Estud() {
        initComponents();
    }

    private void actualizar_lista() {
        this.modListaImagen.clear();
        this.modListaImagen = Pg.Lista_Imagenes();
        // this.Lista_Imagenes.setModel(modListaImagen);
    }

    public static void actualizarTabla(JTable jtabla, ResultSet rs) {
        DefaultTableModel modelo = new DefaultTableModel();
        jtabla.setModel(modelo);
        try {
            modelo.addColumn("CODIGO");
            modelo.addColumn("NOMBRES");
            modelo.addColumn("APELLIDOS");
            modelo.addColumn("PROYECTO CURRICULAR");
            modelo.addColumn("FACULTAD");
            
            while (rs.next()) {
                Object[] ob = new Object[6];
                ob[0] = (rs.getString("k_idestudiante"));
                ob[1] = (rs.getString("n_nombrestudiante"));
                ob[2] = (rs.getString("n_apellidoestudiante"));
                ob[3] = (rs.getString("d_proyectocurricular"));
                ob[4] = (rs.getString("d_facultad"));
                
                modelo.addRow(ob);
                ob = null;
            }
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        consultarxcodigo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        consultartodos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 582));

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRES", "APELLIDOS", "PROYECTO CURRICULAR", "FAULTAD"
            }
        ));
        jScrollPane1.setViewportView(Tabla2);

        consultarxcodigo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        consultarxcodigo.setText("CONSULTAR");
        consultarxcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarxcodigoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("CONSULTAR POR CODIGO:");

        jTextField1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        consultartodos.setText("CONSULTAR TODOS");
        consultartodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultartodosActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capa_presentacion/recursos/header_home_page3.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultarxcodigo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(consultartodos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(consultarxcodigo))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(consultartodos)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarxcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarxcodigoActionPerformed
        ConectarBD con = new ConectarBD("localhost", "5432", "ApoyoAlimentario", "postgres", "bmx92103057509");
        String codigoestudiante = consultarxcodigo.getText();
        ResultSet GetResultado = con.GetResultado("select * from estudiante where (K_IDESTUDIANTE='" + codigoestudiante + " ')");
        actualizarTabla(Tabla2, GetResultado);
        con.cerrarBase();
    }//GEN-LAST:event_consultarxcodigoActionPerformed

    private void consultartodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultartodosActionPerformed
        ConectarBD con = new ConectarBD("localhost", "5432", "ApoyoAlimentario", "postgres", "bmx92103057509");
        ResultSet GetResultado = con.GetResultado("select * from estudiante");
        actualizarTabla(Tabla2, GetResultado);
        con.cerrarBase();
    }//GEN-LAST:event_consultartodosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarEstudiante_Estud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarEstudiante_Estud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarEstudiante_Estud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarEstudiante_Estud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarEstudiante_Estud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla2;
    private javax.swing.JButton consultartodos;
    private javax.swing.JButton consultarxcodigo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
