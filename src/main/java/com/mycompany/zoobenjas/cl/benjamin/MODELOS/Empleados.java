/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoobenjas.cl.benjamin.MODELOS;

/**
 *
 * @author benja
 */
public class Empleados {
    private int Rut;
    private String nombre;
    private String apemat;
    private String apepat;
    private String fecha;
    private String Hora;
    private String DescripcionRealizado;

    public Empleados(int Rut) {
        this.Rut = Rut;
    }

    public Empleados(int Rut, String nombre, String apemat, String apepat, String fecha, String Hora, String DescripcionRealizado) {
        this.Rut = Rut;
        this.nombre = nombre;
        this.apemat = apemat;
        this.apepat = apepat;
        this.fecha = fecha;
        this.Hora = Hora;
        this.DescripcionRealizado = DescripcionRealizado;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getDescripcionRealizado() {
        return DescripcionRealizado;
    }

    public void setDescripcionRealizado(String DescripcionRealizado) {
        this.DescripcionRealizado = DescripcionRealizado;
    }

    @Override
    public String toString() {
        return "Empleados{" + "Rut=" + Rut + ", nombre=" + nombre + ", apemat=" + apemat + ", apepat=" + apepat + ", fecha=" + fecha + ", Hora=" + Hora + ", DescripcionRealizado=" + DescripcionRealizado + '}';
    }
  
    public void imprimir(){
        System.out.println(this.toString());
    }
}


   