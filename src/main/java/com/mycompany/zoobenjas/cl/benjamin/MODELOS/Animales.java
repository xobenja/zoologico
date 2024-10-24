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
    private String tipoAnimal;  
    private String fechaNacimiento;
    private String fechaLlegada;
    private String ambiente;  
    private double valorComercial;

    public Animales(int idAnimal) {
        this.idAnimal = idAnimal;
    }



    
    public Animales(int idAnimal, String nombre, String tipoAnimal, String fechaNacimiento, String fechaLlegada, String ambiente, double valorComercial) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaLlegada = fechaLlegada;
        this.ambiente = ambiente;
        this.valorComercial = valorComercial;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
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
        return "Animales{" + "idAnimal=" + idAnimal + ", nombre=" + nombre + ", tipoAnimal=" + tipoAnimal + ", fechaNacimiento=" + fechaNacimiento + ", fechaLlegada=" + fechaLlegada + ", ambiente=" + ambiente + ", valorComercial=" + valorComercial + '}';
    }

   
    
    public void imprimir(){
        System.out.println(this.toString());
    }
}
