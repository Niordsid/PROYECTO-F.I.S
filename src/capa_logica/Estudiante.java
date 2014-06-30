/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_logica;

import java.sql.ResultSet;

/**
 *
 * @author Equipo4
 */
public class Estudiante {

    private String id_estudiante;
    private String id_contraseña;
    private String nombre_estudiante;
    private String apellido_estudiante;
    private String proyecto_curricular;
    private String direccion_correo_e;
    private String valor_matricula;
    private String facultad;
    private String Modifi;
    private String ModifiStr;
    private static ResultSet tablaConsulta;

  
    public String getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(String id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getId_contraseña() {
        return id_contraseña;
    }

    public void setId_contraseña(String id_contraseña) {
        this.id_contraseña = id_contraseña;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public String getApellido_estudiante() {
        return apellido_estudiante;
    }

    public void setApellido_estudiante(String apellido_estudiante) {
        this.apellido_estudiante = apellido_estudiante;
    }

    public String getProyecto_curricular() {
        return proyecto_curricular;
    }

    public void setProyecto_curricular(String proyecto_curricular) {
        this.proyecto_curricular = proyecto_curricular;
    }

    public String getDireccion_correo_e() {
        return direccion_correo_e;
    }

    public void setDireccion_correo_e(String direccion_correo_e) {
        this.direccion_correo_e = direccion_correo_e;
    }

    public String getValor_matricula() {
        return valor_matricula;
    }

    public void setValor_matricula(String valor_matricula) {
        this.valor_matricula = valor_matricula;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
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

    public static ResultSet getTablaConsulta() {
        return tablaConsulta;
    }

    public static void setTablaConsulta(ResultSet tablaConsulta) {
        Estudiante.tablaConsulta = tablaConsulta;
    }

}
