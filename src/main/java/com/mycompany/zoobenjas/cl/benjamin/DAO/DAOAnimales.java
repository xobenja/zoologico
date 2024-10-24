/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoobenjas.cl.benjamin.DAO;

import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Animales;
import java.util.ArrayList;

/**
 *
 * @author benja
 */
public class DAOAnimales {
    
    public static ArrayList <Animales> lanimales = new ArrayList<Animales>();
    
    public static void agregarAnimal(Animales animal){
    lanimales.add(animal);
    }
    

    public static void listarAnimales() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        for (int i = 0; i < lanimales.size(); i++) {
            Animales animal = lanimales.get(i);
            System.out.print((i+1) + ": "); 
            animal.imprimir();
    }
    }
    
    
    public static void eliminarAnimal(int indice) {
        if (indice >= 0 && indice < lanimales.size()) {
            lanimales.remove(indice);
            System.out.println("Animal eliminado correctamente");
    } else {
        System.out.println("No se pudo eliminar el animal");
    }
}
}
