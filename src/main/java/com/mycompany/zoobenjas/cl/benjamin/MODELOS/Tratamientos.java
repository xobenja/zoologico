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
    
    
    private int idAnimal;
    private String descripcion;
    private String horaTratamiento;

    public Tratamientos(int idTratamiento) {
        this.idAnimal = idAnimal;
    }


    public Tratamientos(int idAnimal, String descripcion, String hora) {
        this.idAnimal = idAnimal;
        this.descripcion = descripcion;
        this.horaTratamiento = horaTratamiento;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getidAnimal() {
        return idAnimal;
    }

    public void setidAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHoraTratamiento() {
        return horaTratamiento;
    }

    public void setHoraTratamiento(String horaTratamiento) {
        this.horaTratamiento = horaTratamiento;
    }

    
    @Override
    public String toString() {
        return "Tratamientos{" + "idAnimal=" + idAnimal + "descripcion=" + descripcion + ", fecha=" + horaTratamiento + '}';
    }
    
    public void imprimir(){
        System.out.println(this.toString());
    }
    
    
}
