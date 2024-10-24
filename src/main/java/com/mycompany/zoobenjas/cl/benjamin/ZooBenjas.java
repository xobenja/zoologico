/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zoobenjas.cl.benjamin;

import com.mycompany.zoobenjas.cl.benjamin.DAO.DAOAnimales;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Animales;
import java.util.Scanner;


public class ZooBenjas {

    public static void main(String[] args) {
        prueba1();
        prueba2();
    }
    
    public static void prueba1(){
        DAOAnimales.agregarAnimal(new Animales(1, "Juan", "Mono", null, null, "Jungla", 20000));
        DAOAnimales.agregarAnimal(new Animales(2,"Pepe","Jarifa", null, null, "Amazonas", 2000000));
        
        DAOAnimales.listarAnimales();
                
        
    }
    
    public static void prueba2(){
        Zoologico zoo = new Zoologico();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenidos al Zoologico");
            System.out.println("1. Agregar Animal");
            System.out.println("2. Listar Animales");
            System.out.println("3. ...");
            System.out.println("4. ...");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
          
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
            }
        } while (opcion != 5);
    }
    
    
    
}
