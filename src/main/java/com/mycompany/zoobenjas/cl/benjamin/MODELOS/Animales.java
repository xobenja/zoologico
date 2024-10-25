/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoobenjas.cl.benjamin.MODELOS;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author benja
 */
public abstract class Animales {

    private int idAnimal;
    private String nombre;
    private double peso;
    private LocalDate fechaNacimiento;
    private LocalDate fechaLlegada;
    private String clasificacionAmbiente; // Aéreo, Terrestre, Acuático
    private double valorComercial;

    public Animales(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Animales(int idAnimal, String nombre, double peso, LocalDate fechaNacimiento, LocalDate fechaLlegada, String clasificacionAmbiente, double valorComercial) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaLlegada = fechaLlegada;
        this.clasificacionAmbiente = clasificacionAmbiente;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getClasificacionAmbiente() {
        return clasificacionAmbiente;
    }

    public void setClasificacionAmbiente(String clasificacionAmbiente) {
        this.clasificacionAmbiente = clasificacionAmbiente;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

   

    @Override
    public String toString() {
        return "Animales{" + "idAnimal=" + idAnimal + ", nombre=" + nombre + ", peso=" + peso + ", fechaNacimiento=" + fechaNacimiento + ", fechaLlegada=" + fechaLlegada + ", clasificacionAmbiente=" + clasificacionAmbiente + ", valorComercial=" + valorComercial + '}';
    }
    
    public void imprimir(){
        System.out.println(this.toString());
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + idAnimal + " | Nombre: " + nombre + " | Peso: " + peso + " kg | Nacimiento: " + fechaNacimiento + " | Llegada: " + fechaLlegada);
        System.out.println("Clasificación: " + clasificacionAmbiente + " | Valor comercial: $" + valorComercial);
    }
}
