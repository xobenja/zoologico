/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoobenjas.cl.benjamin.MODELOS.Aereos;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Animales;
import java.time.LocalDate;
/**
 *
 * @author benja
 */
public class Pelicano extends Animales {
    public Pelicano(int idAnimal, String nombre, double peso, LocalDate fechaNacimiento, LocalDate fechaLlegada, double valorComercial) {
        super(idAnimal, nombre, peso, fechaNacimiento, fechaLlegada, "Aereo", valorComercial);
    }
    
}
  
