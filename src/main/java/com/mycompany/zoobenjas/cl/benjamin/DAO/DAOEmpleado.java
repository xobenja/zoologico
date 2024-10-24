/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoobenjas.cl.benjamin.DAO;

import static com.mycompany.zoobenjas.cl.benjamin.DAO.DAOAnimales.lanimales;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Animales;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Empleados;
import java.util.ArrayList;

/**
 *
 * @author benja
 */
public class DAOEmpleado {
    public static ArrayList <Empleados> lempleados = new ArrayList<Empleados>();
  
    public static void agregarEmpleado(Empleados empleados){
    lempleados.add(empleados);
    }
    

    public static void listarEmpleado() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        for (int i = 0; i < lempleados.size(); i++) {
            Empleados empleados = lempleados.get(i);
            System.out.print((i+1) + ": "); 
            empleados.imprimir();
    }
}
}
