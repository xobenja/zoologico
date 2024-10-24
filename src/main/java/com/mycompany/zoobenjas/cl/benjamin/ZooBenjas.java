/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zoobenjas.cl.benjamin;

import com.mycompany.zoobenjas.cl.benjamin.DAO.DAOAnimales;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Animales;

/**
 *
 * @author benja
 */
public class ZooBenjas {

    public static void main(String[] args) {
        prueba1();
    }
    
    public static void prueba1(){
        DAOAnimales.agregarAnimal(new Animales(1, "Juan", "Mono", null, null, "Jungla", 20000));
        DAOAnimales.agregarAnimal(new Animales(2,"Pepe","Jarifa", null, null, "Amazonas", 2000000));
        
        DAOAnimales.listarAnimales();
                
        
    }
}
