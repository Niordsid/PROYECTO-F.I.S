/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_logica;

import java.sql.ResultSet;

/**
 *
 * @author AndreStereo
 */
public class Administrador {

    private String id_admin;
    private String id_contraseñaadmin;
    private String nombre_admin;
    private String apellido_admin;
    private String Modifi;
    private String ModifiStr;
    private static ResultSet tablaConsulta;

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

    public String getApellido_admin() {
        return apellido_admin;
    }

    public void setApellido_admin(String apellido_admin) {
        this.apellido_admin = apellido_admin;
    }

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public String getId_contraseñaadmin() {
        return id_contraseñaadmin;
    }

    public void setId_contraseñaadmin(String id_contraseñaadmin) {
        this.id_contraseñaadmin = id_contraseñaadmin;
    }

    public String getNombre_admin() {
        return nombre_admin;
    }

    public void setNombre_admin(String nombre_admin) {
        this.nombre_admin = nombre_admin;
    }

    public static ResultSet getTablaConsulta() {
        return tablaConsulta;
    }

    public static void setTablaConsulta(ResultSet tablaConsulta) {
        Administrador.tablaConsulta = tablaConsulta;
    }
}
