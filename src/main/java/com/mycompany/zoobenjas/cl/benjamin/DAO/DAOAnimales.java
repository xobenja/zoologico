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
            System.out.print((i+1) + ": "); // Imprime el índice
            animal.imprimir(); // Imprime la información del animal
    }
    }
    
    
    /*public static void eliminarAnimal(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int j = lanimales.size() - 1; j > 0; j--) {
            Animales animales = lanimales.get(j);
            if (animales.getIdMascota()== id ) {
                lanimales.remove(j);
            }

        }
    } */
    public static void eliminarAnimal(int indice) {
        if (indice >= 0 && indice < lanimales.size()) {
            lanimales.remove(indice);
            System.out.println("Animal eliminado correctamente.");
    } else {
        System.out.println("Índice no válido. No se pudo eliminar el animal.");
    }
}
}
