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
    private int idAnimal;
    private String nombre;
    private String tipoMascota;  
    private String fechaNacimiento;
    private String fechaLlegada;
    private String ambiente;  
    private double valorComercial;

    public Animales(int idMascota) {
        this.idAnimal = idMascota;
    }

    
    public Animales(int idMascota, String nombre, String tipoMascota, String fechaNacimiento, String fechaLlegada, String ambiente, double valorComercial) {
        this.idAnimal = idMascota;
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaLlegada = fechaLlegada;
        this.ambiente = ambiente;
        this.valorComercial = valorComercial;
    }

    public int getIdMascota() {
        return idAnimal;
    }

    public void setIdMascota(int idMascota) {
        this.idAnimal = idMascota;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
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
        return "Animales{" + "idMascota=" + idAnimal + ", nombre=" + nombre + ", tipoMascota=" + tipoMascota + ", fechaNacimiento=" + fechaNacimiento + ", fechaLlegada=" + fechaLlegada + ", ambiente=" + ambiente + ", valorComercial=" + valorComercial + '}';
    }
    
    public void imprimir(){
        System.out.println(this.toString());
    }
}
