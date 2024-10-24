/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoobenjas.cl.benjamin.MODELOS;

/**
 *
 * @author benja
 */
public class Atenciones {
    private int idAtencion;
    private String nombreAtencion;
    private String TipoAtencion;

    public Atenciones(int idAtencion) {
        this.idAtencion = idAtencion;
    }

    public Atenciones(int idAtencion, String nombreAtencion, String TipoAtencion) {
        this.idAtencion = idAtencion;
        this.nombreAtencion = nombreAtencion;
        this.TipoAtencion = TipoAtencion;
    }

    public int getIdAtencion() {
        return idAtencion;
    }

    public void setIdAtencion(int idAtencion) {
        this.idAtencion = idAtencion;
    }

    public String getNombreAtencion() {
        return nombreAtencion;
    }

    public void setNombreAtencion(String nombreAtencion) {
        this.nombreAtencion = nombreAtencion;
    }

    public String getTipoAtencion() {
        return TipoAtencion;
    }

    public void setTipoAtencion(String TipoAtencion) {
        this.TipoAtencion = TipoAtencion;
    }

    @Override
    public String toString() {
        return "Atenciones{" + "idAtencion=" + idAtencion + ", nombreAtencion=" + nombreAtencion + ", TipoAtencion=" + TipoAtencion + '}';
    }

    
    

    public void imprimir(){
        System.out.println(this.toString());
    }
    
}
