/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoobenjas.cl.benjamin.MODELOS;

/**
 *
 * @author benja
 */
public class Tratamientos {
    
    
    private int idTratamiento;
    private String nombreTratamiento;
    private String descripcion;
    private String fecha;

    public Tratamientos(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public Tratamientos(int idTratamiento, String nombreTratamiento, String descripcion, String fecha) {
        this.idTratamiento = idTratamiento;
        this.nombreTratamiento = nombreTratamiento;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    
    
    
    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getNombreTratamiento() {
        return nombreTratamiento;
    }

    public void setNombreTratamiento(String nombreTratamiento) {
        this.nombreTratamiento = nombreTratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tratamientos{" + "idTratamiento=" + idTratamiento + ", nombreTratamiento=" + nombreTratamiento + ", descripcion=" + descripcion + ", fecha=" + fecha + '}';
    }
    
    public void imprimir(){
        System.out.println(this.toString());
    }
    
    
}
