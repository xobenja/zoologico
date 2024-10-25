/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoobenjas.cl.benjamin.MODELOS.Acuaticos;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Animales;
import java.util.Date;
/**
 *
 * @author benja
 */
public class Foca extends Animales{

    public Foca(int idAnimal, String nombre, double peso, Date fechaNacimiento, Date fechaLlegada, double valorComercial) {
        super(idAnimal, nombre, peso, fechaNacimiento, fechaLlegada, "Acuático", valorComercial);

    }
}
