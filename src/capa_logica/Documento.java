/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_logica;

import java.awt.Image;
import java.sql.ResultSet;

/**
 *
 * @author AndreStereo
 */
public class Documento {

    private String id_estudiante;
    private String id_documento;
    private String nombre_documento;
    private String ruta;
    private Image d_archivo;
    private String Modifi;
    private String ModifiStr;
    private static ResultSet tablaConsulta;

    public Image getD_archivo() {
        return d_archivo;
    }

    public void setD_archivo(Image d_archivo) {
        this.d_archivo = d_archivo;
    }

    public String getModifi() {
        return Modifi;
    }

    public void setModifi(String Modifi) {
        this.Modifi = Modifi;
    }

    public String getModifiStr() {
        return ModifiStr;
    }

    public void setModifiStr(String ModifiStr) {
        this.ModifiStr = ModifiStr;
    }

    public String getId_documento() {
        return id_documento;
    }

    public void setId_documento(String id_documento) {
        this.id_documento = id_documento;
    }

    public String getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(String id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombre_documento() {
        return nombre_documento;
    }

    public void setNombre_documento(String nombre_documento) {
        this.nombre_documento = nombre_documento;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public static ResultSet getTablaConsulta() {
        return tablaConsulta;
    }

    public static void setTablaConsulta(ResultSet tablaConsulta) {
        Documento.tablaConsulta = tablaConsulta;
    }

}
