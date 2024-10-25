/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.zoobenjas.cl.benjamin;

import java.time.LocalDate;
import com.mycompany.zoobenjas.cl.benjamin.DAO.DAOAnimales;
import com.mycompany.zoobenjas.cl.benjamin.DAO.DAOTratamientos;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Animales;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Atenciones;
import com.mycompany.zoobenjas.cl.benjamin.DAO.DAOAtencion;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Tratamientos;
import com.mycompany.zoobenjas.cl.benjamin.DAO.DAOEmpleado;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Empleados;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Terrestres.Jirafa;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Terrestres.Mono;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Acuaticos.Ballena;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Acuaticos.Delfin;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Acuaticos.Foca;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Acuaticos.Pinguino;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Aereos.Alcon;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Aereos.Condor;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Aereos.Loro;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Aereos.Pelicano;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Terrestres.Flamenco;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Terrestres.Hipopotamo;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Terrestres.Leon;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Terrestres.Panda;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Terrestres.Pantera;
import com.mycompany.zoobenjas.cl.benjamin.MODELOS.Terrestres.Pavo_Real;
import java.time.Month;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class ZooBenjas {

    public static void main(String[] args) {

        prueba1();
    }

    public static void prueba1() {
        
        //Tratamiendo para animales
        DAOTratamientos.agregarTratamiento(new Tratamientos(1, "Vacunacion contra fiebre amarilla", "09:00"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(2, "Chequeo de salud general", "10:00"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(3, "Control dental", "11:00"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(4, "Desparasitante", "12:00"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(5, "Examen de piel", "13:00"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(6, "Revision de alimentacion", "14:00"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(7, "Control de plumas", "15:00"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(8, "Chequeo de alas", "16:00"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(9, "Revision de patas", "17:00"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(10, "Vacunacion contra gripe aviar", "08:30"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(11, "Chequeo de salud", "09:30"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(12, "Control de peso", "10:30"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(13, "Revision de dientes", "11:30"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(14, "Control de dieta", "12:30"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(15, "Desparasitante", "13:30"));
        DAOTratamientos.agregarTratamiento(new Tratamientos(16, "Revision de plumaje", "14:30"));

        //Empleados por default
        DAOEmpleado.agregarEmpleado(new Empleados("2020202", "Pedrito", "Parra", "Cayo", "2024-10-01", "08:00", "Mantenimiento de habitat"));
        DAOEmpleado.agregarEmpleado(new Empleados("2134567", "Maria", "Gonzalez", "Rios", "2024-10-01", "09:00", "Revision medica de animales"));
        DAOEmpleado.agregarEmpleado(new Empleados("3245678", "Carlos", "Jimenez", "Montes", "2024-10-01", "10:00", "Supervision de seguridad"));
        DAOEmpleado.agregarEmpleado(new Empleados("4356789", "Ana", "Lopez", "Campos", "2024-10-01", "11:00", "Alimentacion de mamiferos"));
        DAOEmpleado.agregarEmpleado(new Empleados("5467890", "Pedro", "Sanchez", "Valle", "2024-10-01", "12:00", "Inspeccion de habitat"));
        DAOEmpleado.agregarEmpleado(new Empleados("6578901", "Marta", "Diaz", "Sierra", "2024-10-01", "13:00", "Limpieza general del recinto"));
        DAOEmpleado.agregarEmpleado(new Empleados("7689012", "Lucia", "Fernandez", "Costa", "2024-10-01", "14:00", "Control de dietas"));
        
        //Atenciones de los animales
        DAOAtencion.agregarAtenciones(new Atenciones(1, "Limpiar Habitat", "Prioridad Media"));
        DAOAtencion.agregarAtenciones(new Atenciones(2, "Revision Medica", "Prioridad Alta"));
        DAOAtencion.agregarAtenciones(new Atenciones(3, "Alimentar Animal", "Prioridad Alta"));
        DAOAtencion.agregarAtenciones(new Atenciones(4, "Reparacion de Habitat", "Prioridad Media"));
        DAOAtencion.agregarAtenciones(new Atenciones(5, "Inspeccion de Seguridad", "Prioridad Alta"));
        DAOAtencion.agregarAtenciones(new Atenciones(6, "Chequeo Dental", "Prioridad Normal"));
        DAOAtencion.agregarAtenciones(new Atenciones(7, "Control de Parasitos", "Prioridad Alta"));

        //Animales por default
        DAOAnimales.agregarAnimal(new Mono(1, "Pepito", 50, LocalDate.of(2000, Month.DECEMBER, 1), LocalDate.of(2005, Month.MARCH, 1), 13213213));
        DAOAnimales.agregarAnimal(new Jirafa(2, "Penelope", 50, LocalDate.of(2016, Month.JUNE, 10), LocalDate.of(2019, Month.NOVEMBER, 20), 13213213));
        DAOAnimales.agregarAnimal(new Ballena(3, "Willy", 5000, LocalDate.of(2005, Month.MAY, 20), LocalDate.of(2015, Month.JUNE, 25), 5550000));
        DAOAnimales.agregarAnimal(new Delfin(4, "Flipper", 300, LocalDate.of(2008, Month.JULY, 10), LocalDate.of(2019, Month.AUGUST, 5), 450000));
        DAOAnimales.agregarAnimal(new Foca(5, "Sammy", 120, LocalDate.of(2011, Month.SEPTEMBER, 15), LocalDate.of(2020, Month.OCTOBER, 20), 200000));
        DAOAnimales.agregarAnimal(new Pinguino(6, "Pingu", 25, LocalDate.of(2014, Month.NOVEMBER, 30), LocalDate.of(2023, Month.JANUARY, 10), 100000));

        DAOAnimales.agregarAnimal(new Alcon(7, "Halcon", 40, LocalDate.of(2012, Month.APRIL, 5), LocalDate.of(2019, Month.DECEMBER, 15), 987654));
        DAOAnimales.agregarAnimal(new Condor(8, "Andes", 15, LocalDate.of(2009, Month.AUGUST, 20), LocalDate.of(2017, Month.JULY, 30), 1234567));
        DAOAnimales.agregarAnimal(new Loro(9, "Parlanchin", 10, LocalDate.of(2013, Month.MARCH, 12), LocalDate.of(2021, Month.FEBRUARY, 22), 987123));
        DAOAnimales.agregarAnimal(new Pelicano(10, "BigBeak", 30, LocalDate.of(2010, Month.OCTOBER, 5), LocalDate.of(2018, Month.APRIL, 19), 654321));

        DAOAnimales.agregarAnimal(new Flamenco(11, "Rosita", 35, LocalDate.of(2008, Month.JANUARY, 18), LocalDate.of(2015, Month.JUNE, 30), 789654));
        DAOAnimales.agregarAnimal(new Hipopotamo(12, "Hippo", 3000, LocalDate.of(2006, Month.MAY, 22), LocalDate.of(2014, Month.AUGUST, 12), 4567890));
        DAOAnimales.agregarAnimal(new Leon(13, "Simba", 250, LocalDate.of(2011, Month.DECEMBER, 14), LocalDate.of(2020, Month.OCTOBER, 18), 369258));
        DAOAnimales.agregarAnimal(new Pantera(14, "Bagheera", 190, LocalDate.of(2009, Month.SEPTEMBER, 17), LocalDate.of(2018, Month.MAY, 24), 654789));
        DAOAnimales.agregarAnimal(new Panda(15, "Bao", 120, LocalDate.of(2013, Month.APRIL, 10), LocalDate.of(2022, Month.MARCH, 9), 123789));
        DAOAnimales.agregarAnimal(new Pavo_Real(16, "Plumas", 10, LocalDate.of(2014, Month.NOVEMBER, 25), LocalDate.of(2020, Month.JULY, 5), 147258));

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
                        System.out.println("Que tipo de animal es?(Escribalo)");
                        System.out.println("1. Terrenal");
                        System.out.println("2. Jirafa");
                        System.out.println("3. Leon");
                        System.out.println("4. Cocodrilo");
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

                    System.out.println("Que ambiente usa tu animal?(Escribalo)");

                    String[] ambientesValidos = {"jungla", "amazonas", "pantano", "antartica"};
                    String ambiente;
                    boolean ambienteValido = false;
                    do {
                        System.out.println("1. Jungla");
                        System.out.println("2. Amazonas");
                        System.out.println("3. Pantano");
                        System.out.println("4. Antartica");
                        ambiente = scanner.nextLine();
                        for (String ambientee : ambientesValidos) {
                            int distancia = StringUtils.getLevenshteinDistance(ambiente, ambientee);
                            if (distancia <= 1) {
                                ambienteValido = true;
                                ambiente = ambientee;
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
                    //DAOAnimales.agregarAnimal(new Animales(id, nombre, tipo, fechaNac, fechaLlega, ambiente, valorCo));

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
                                System.out.println("Aun no hay animales en el zoologico");
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
                    System.out.println("3. Salir");
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
                        case 3:
                            break;
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
