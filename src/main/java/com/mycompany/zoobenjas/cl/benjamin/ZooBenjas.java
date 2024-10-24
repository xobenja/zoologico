/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zoobenjas.cl.benjamin;

import com.mycompany.zoobenjas.cl.benjamin.DAO.DAOAnimales;
import com.mycompany.zoobenjas.cl.benjamin.DAO.DAOTratamientos;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Animales;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Tratamientos;
import java.util.Scanner;


public class ZooBenjas {

    public static void main(String[] args) {

        prueba2();
    }
    
    public static void prueba1(){
        DAOAnimales.agregarAnimal(new Animales(1, "Juan", "Mono", null, null, "Jungla", 20000));
        DAOAnimales.agregarAnimal(new Animales(2,"Pepe","Jarifa", null, null, "Amazonas", 2000000));
        
        DAOAnimales.listarAnimales();
                
        
    }
    
    public static void prueba2(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenidos al Zoologico");
            System.out.println("1. Agregar Animal");
            System.out.println("2. Listar Animales");
            System.out.println("3. Eliminar Animal");
            System.out.println("4. Tratamientos");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
          
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Como se llama su animal?");
                    String nombre = scanner.nextLine();
         
                    
                    System.out.println("Que tipo de animal es?");
                    System.out.println("Mono");
                    System.out.println("Jirafa");
                    System.out.println("Leon");
                    System.out.println("Cocodrilo");
                    String tipo = scanner.nextLine();
                    
                    System.out.println("Ingrese la fecha de nacimiento");
                    String fechaNac = scanner.nextLine();
                    
                    System.out.println("Ingrese la fecha de llegada");
                    String fechaLlega = scanner.nextLine();
                    
                    System.out.println("Que ambiente usa tu animal?");
                    System.out.println("Jungla");
                    System.out.println("Amazonas");
                    System.out.println("Pantano");
                    System.out.println("Antartica");
                    String ambiente = scanner.nextLine();
                    
                    System.out.println("Que valor comercial tiene?");
                    int valorCo = scanner.nextInt();
                    
                    int id = DAOAnimales.lanimales.size() + 1;
                    DAOAnimales.agregarAnimal(new Animales(id, nombre, tipo, fechaNac, fechaLlega, ambiente, valorCo));
                    
                    break;
                case 2:
                    DAOAnimales.listarAnimales();
                    break;
                case 3:
                    System.out.println("Eliga el indice del animal que desea eliminar");
                    DAOAnimales.listarAnimales();
                    int indiceA = scanner.nextInt() - 1 ;
         
                    DAOAnimales.eliminarAnimal(indiceA);
                   
                    break;

                case 4:
                    System.out.println("Que desea realizar");
                    System.out.println("1. Tratamiento");
                    System.out.println("2. Listar Tratamientos");
                    System.out.println("3. Salir");
                    int opc = scanner.nextInt();
                    switch (opc) {
                        case 1:
                            if (DAOAnimales.lanimales.size()<=0){
                                System.out.println("Aún no hay animales en el zoologico");
                                break;
                            }else
                                DAOAnimales.listarAnimales();
                                System.out.println("Eliga el indice del animal que desea realizar el tratamiento");
                                int indiceTratamiento = scanner.nextInt() - 1;
                                if (indiceTratamiento < 0 || indiceTratamiento > DAOAnimales.lanimales.size()){
                                    System.out.println("Ingrese un indice valido");
                                }else{
                                    System.out.println("Ingrese la hora del tratamiento EJ: 12:00");
                                    String hora = scanner.nextLine();
                                    System.out.println("Ingrese la descripción del tratamiento");
                                    String descripcion = scanner.nextLine();
                                    
                                    DAOTratamientos.agregarTratamiento(new Tratamientos(1, null, hora ,descripcion));
                                }
                                    
                                
                            
                            break;
                        case 2:
                             DAOTratamientos.listarTratamientos();
                            break;
                        case 3:
                            
                            break;
                        default:
                            throw new AssertionError();
                    }
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
