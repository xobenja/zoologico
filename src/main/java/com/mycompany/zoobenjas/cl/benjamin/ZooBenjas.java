/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.zoobenjas.cl.benjamin;

import com.mycompany.zoobenjas.cl.benjamin.DAO.DAOAnimales;
import com.mycompany.zoobenjas.cl.benjamin.DAO.DAOTratamientos;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Animales;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Atenciones;
import com.mycompany.zoobenjas.cl.benjamin.DAO.DAOAtencion;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Tratamientos;
import com.mycompany.zoobenjas.cl.benjamin.DAO.DAOEmpleado;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Empleados;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class ZooBenjas {

    public static void main(String[] args) {

        prueba2();
    }

    public static void prueba1() {
        DAOAnimales.agregarAnimal(new Animales(1, "Juan", "Mono", null, null, "Jungla", 20000));
        DAOAnimales.agregarAnimal(new Animales(2, "Pepe", "Jarifa", null, null, "Amazonas", 2000000));

        DAOAnimales.listarAnimales();

    }

    public static void prueba2() {

        DAOAtencion.agregarAtenciones(new Atenciones(1, "Limpiar Habitat", "Prioridad Media"));
        DAOAtencion.agregarAtenciones(new Atenciones(2, "Revision Medica", "Prioridad Alta"));
        DAOAtencion.agregarAtenciones(new Atenciones(3, "Alimentar Animal", "Prioridad Alta"));
        DAOAtencion.agregarAtenciones(new Atenciones(4, "Reparacion de Habitat", "Prioridad Media"));
        DAOAtencion.agregarAtenciones(new Atenciones(5, "Inspeccion de Seguridad", "Prioridad Alta"));
        DAOAtencion.agregarAtenciones(new Atenciones(6, "Chequeo Dental", "Prioridad Normal"));
        DAOAtencion.agregarAtenciones(new Atenciones(7, "Control de Parasitos", "Prioridad Alta"));

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenidos al Zoologico");
            System.out.println("1. Agregar Animal");
            System.out.println("2. Listar Animales");
            System.out.println("3. Eliminar Animal");
            System.out.println("4. Atencion Animal");
            System.out.println("5. Tratamientos");
            System.out.println("6. Empleados");
            System.out.println("7. Salir");
            System.out.print("Elija una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    String[] animalesValidos = {"mono", "jirafa", "leon", "cocodrilo"};

                    System.out.println("Como se llama su animal?");
                    String nombre = scanner.nextLine();

                    String tipo;
                    boolean tipoValido = false;
                    do {
                        System.out.println("Que tipo de animal es?");
                        System.out.println("Mono");
                        System.out.println("Jirafa");
                        System.out.println("Leon");
                        System.out.println("Cocodrilo");
                        tipo = scanner.nextLine();

                        for (String animal : animalesValidos) {
                            int distancia = StringUtils.getLevenshteinDistance(tipo, animal);
                            if (distancia <= 1) { 
                                tipoValido = true;
                                tipo = animal; 
                                break;
                            }
                        }

                        if (!tipoValido) {
                            System.out.println("Error, este tipo de animal no existe en nuestra base de datos... ingrese correctamente");
                        }
                    } while (!tipoValido);

                    System.out.println("Ingrese la fecha de nacimiento");
                    String fechaNac = scanner.nextLine();

                    System.out.println("Ingrese la fecha de llegada");
                    String fechaLlega = scanner.nextLine();

                    System.out.println("Que ambiente usa tu animal?");
                    
                    
                    String[] ambientesValidos = {"jungla", "amazonas", "pantano", "antartica"};
                    String ambiente;
                    boolean ambienteValido = false;
                    do{
                        System.out.println("Jungla");
                        System.out.println("Amazonas");
                        System.out.println("Pantano");
                        System.out.println("Antartica");
                        ambiente = scanner.nextLine();
                            for (String animal : animalesValidos) {
                                int distancia = StringUtils.getLevenshteinDistance(tipo, animal);
                                if (distancia <= 1) { 
                                    ambienteValido = true;
                                    tipo = animal; 
                                    break;
                                }
                            }
                            if (!ambienteValido) {
                                System.out.println("Error, este tipo de terreno no existe en nuestra base de datos... ingrese correctamente");
                            }
                        } while (!ambienteValido);

                        System.out.println("Que valor comercial tiene?");
                        int valorCo = scanner.nextInt();
                        scanner.nextLine(); 

                        int id = DAOAnimales.lanimales.size() + 1;
                        DAOAnimales.agregarAnimal(new Animales(id, nombre, tipo, fechaNac, fechaLlega, ambiente, valorCo));

                        break;
                case 2:
                    DAOAnimales.listarAnimales();
                    break;
                case 3:
                    System.out.println("Eliga el indice del animal que desea eliminar");
                    DAOAnimales.listarAnimales();
                    int indiceA = scanner.nextInt() - 1;

                    DAOAnimales.eliminarAnimal(indiceA);

                    break;
                case 4:
                    System.out.println("Que desea realizar");
                    System.out.println("1. Ver Atenciones");
                    System.out.println("2. Agregar Atenciones");
                    System.out.println("3. Salir");
                    int opcAtenciones = scanner.nextInt();
                    switch (opcAtenciones) {
                        case 1:
                            DAOAtencion.listarAtenciones();
                            break;
                        case 2:
                            int idAtencion = DAOAtencion.latenciones.size() + 1;
                            scanner.nextLine();
                            System.out.println("Ingrese el nombre de la atencion");
                            String nombreAte = scanner.nextLine();
                            System.out.println("Ingrese el tipo de Prioridad EJ: Prioridad Normal/Media/Alta");
                            String tipoAtencion = scanner.nextLine();
                            DAOAtencion.agregarAtenciones(new Atenciones(idAtencion, nombreAte, tipoAtencion));

                            break;
                        case 3:
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 5:
                    System.out.println("Que desea realizar");
                    System.out.println("1. Tratamiento");
                    System.out.println("2. Listar Tratamientos");
                    System.out.println("3. Salir");
                    int opc = scanner.nextInt();
                    switch (opc) {
                        case 1:
                            if (DAOAnimales.lanimales.size() <= 0) {
                                System.out.println("Aún no hay animales en el zoologico");
                                break;
                            } else {
                                DAOAnimales.listarAnimales();
                            }
                            System.out.println("Eliga el indice del animal que desea realizar el tratamiento");
                            int indiceTratamiento = scanner.nextInt() - 1;
                            if (indiceTratamiento < 0 || indiceTratamiento > DAOAnimales.lanimales.size()) {
                                System.out.println("Ingrese un indice valido");
                            } else {
                                scanner.nextLine();
                                System.out.println("Ingrese la hora del tratamiento EJ: 12:00");
                                String hora = scanner.nextLine();
                                System.out.println("Ingrese la descripción del tratamiento");
                                String descripcion = scanner.nextLine();

                                DAOTratamientos.agregarTratamiento(new Tratamientos(indiceTratamiento, descripcion, hora));
                                break;
                            }
                            
                        case 2:
                            DAOTratamientos.listarTratamientos();
                            break;
                        case 3:

                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 6:
                    System.out.println("Elija una opcion");
                    System.out.println("1. Agregar Servicio Realizado");
                    System.out.println("2. Ver Empleados");
                    int opcEmpleado = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcEmpleado) {
                        case 1:

                            System.out.println("Ingrese su rut sin puntos y sin digito verificador");
                            String rut = scanner.nextLine();
                            System.out.println("Ingrese su nombre");
                            String nombreEm = scanner.nextLine();
                            System.out.println("Ingrese su Apellido Paterno");
                            String aP = scanner.nextLine();
                            System.out.println("Ingrese su Apellido Materno");
                            String aM = scanner.nextLine();
                            System.out.println("Ingrese la fecha en que realiza su servicio");
                            String fecha = scanner.nextLine();
                            System.out.println("Ingrese la hora en que realiza su servicio");
                            String hora = scanner.nextLine();
                            System.out.println("Ingrese una descripcion de lo que realizo en su servicio");
                            String descripcionSer = scanner.nextLine();

                            DAOEmpleado.agregarEmpleado(new Empleados(rut, nombreEm, aP, aM, fecha, hora, descripcionSer));

                            break;
                        case 2:
                            DAOEmpleado.listarEmpleado();
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
            }
        } while (opcion != 7);
    }

}
