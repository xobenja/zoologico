/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoobenjas.cl.benjamin.DAO;

import static com.mycompany.zoobenjas.cl.benjamin.DAO.DAOAnimales.lanimales;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Animales;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Atenciones;
import java.util.ArrayList;

/**
 *
 * @author benja
 */
public class DAOAtencion {

    public static ArrayList<Atenciones> latenciones = new ArrayList<Atenciones>();

    public static void agregarAtenciones(Atenciones atenciones) {
        latenciones.add(atenciones);
    }

    public static void listarAtenciones() {
        for (int i = 0; i < latenciones.size(); i++) {
            Atenciones atenciones = latenciones.get(i);
            System.out.print((i + 1) + ": ");
            atenciones.imprimir();
        }
    }
    
}
