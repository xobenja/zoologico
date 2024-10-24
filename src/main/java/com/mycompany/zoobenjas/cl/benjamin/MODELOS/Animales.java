/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoobenjas.cl.benjamin.MODELOS;

import java.util.Date;

/**
 *
 * @author benja
 */
public class Animales {
    private int idMascota;
    private String nombre;
    private String tipoMascota;  
    private Date fechaNacimiento;
    private Date fechaLlegada;
    private String ambiente;  
    private double valorComercial;

    public Animales(int idMascota) {
        this.idMascota = idMascota;
    }

    
    public Animales(int idMascota, String nombre, String tipoMascota, Date fechaNacimiento, Date fechaLlegada, String ambiente, double valorComercial) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaLlegada = fechaLlegada;
        this.ambiente = ambiente;
        this.valorComercial = valorComercial;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    @Override
    public String toString() {
        return "Animales{" + "idMascota=" + idMascota + ", nombre=" + nombre + ", tipoMascota=" + tipoMascota + ", fechaNacimiento=" + fechaNacimiento + ", fechaLlegada=" + fechaLlegada + ", ambiente=" + ambiente + ", valorComercial=" + valorComercial + '}';
    }
    
    public void imprimir(){
        System.out.println(this.toString());
    }
}
