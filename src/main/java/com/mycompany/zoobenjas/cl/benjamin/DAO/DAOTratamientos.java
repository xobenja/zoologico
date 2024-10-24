/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoobenjas.cl.benjamin.DAO;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Tratamientos;
import java.util.ArrayList;

/**
 *
 * @author benja
 */
public class DAOTratamientos {

    public static ArrayList <Tratamientos> ltratamientos = new ArrayList<Tratamientos>();
    
    public static void agregarTratamiento(Tratamientos tratamientos){
    ltratamientos.add(tratamientos);
    }
    
    public static void listarTratamientos() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        for (int i = 0; i < ltratamientos.size(); i++) {
            Tratamientos tratamientos = ltratamientos.get(i);
            System.out.print((i+1) + ": "); 
            tratamientos.imprimir();
    }
    }
    
    
    
    
}
