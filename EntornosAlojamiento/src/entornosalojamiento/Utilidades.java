/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornosalojamiento;

import java.util.Scanner;

/**
 * Esta clase es solo para pedir datos en consola al usuario simplemente. Y se
 * llaman a estos metodos static donde se necesiten :D
 *
 * @author dam1
 */
public class Utilidades {


    public static String pedirNombre() {
        String nombre;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el nombre del alojamiento:");
        return nombre = lector.nextLine();
    }

    public static String pedirProvincia() {
        String nombre;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca la provincia:");
        return nombre = lector.nextLine();
    }

    public static double pedirValoracion() {
        double valor;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca la valoración:");

        valor = lector.nextDouble();
        return valor;
    }

    public static int pedirCategoria() {
        int category;
        System.out.println("Introduce la categoría del hotel (1 a 5 Estrellas)");
        Scanner lector = new Scanner(System.in);
        do {
            category = lector.nextInt();
            if (category < 1 || category > 5) {
                System.out.println("Lo siento, la categoria solo puede ser de 1 a 5 estrellas. Introduce otra vez la categoria.");
            }
        } while (category < 1 || category > 5);

        return 1;
    }

    public static int pedirPlazas() {
        int plazas;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca en numero de plazas:");
        return plazas = lector.nextInt();
    }

    public static int pedirDias() {
        int dias;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el número de días:");
        return dias = lector.nextInt();
    }

    public static Direccion crearDireccion() {
        Direccion dir;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca los datos para crear una nueva dirección: ");
        System.out.println("Calle:");
        String calle = lector.nextLine();
        System.out.println("Código Postal: ");
        int cp = lector.nextInt();
        System.out.println("Provincia:");
        String prov = lector.nextLine();
        lector.next();
        System.out.println("Comunidad:");
        String com = lector.nextLine();
        lector.next();
        return dir = new Direccion(calle, cp, prov, com);
    }

    public static Alojamiento crearAlojamiento() {
        Scanner lector = new Scanner(System.in);
        Alojamiento aloja = null;
        int opcion;
        System.out.println("Creación de alojamiento. \n Pulse 1 Si quiere crear un hotel. \n Pulse 2 si quiere crear un apartamento. ");

        opcion = lector.nextInt();

        if (opcion == 1) {
            int categoria = pedirCategoria();
            System.out.println("Introduzca los servicios del hotel:");
            StringBuilder servicios = new StringBuilder(lector.nextLine());
            lector.next();
            String nombre = pedirNombre();
            Direccion dir = crearDireccion();
            double valor = pedirValoracion();
            System.out.println("Introduzca la tarifa del hotel:");
            double tarifa = lector.nextDouble();
            aloja = new Hotel(categoria, servicios, nombre, dir, valor, tarifa);
        } else {
            String resp;
            boolean hayLimpieza;
            int plazas = pedirPlazas();
            System.out.println("¿Hay servicio de limpieza? (si/no)");
            resp = lector.nextLine();
            if (resp.equalsIgnoreCase("si")) {
                hayLimpieza = true;
            } else {
                hayLimpieza = false;
            }
            lector.next();
            String nom = pedirNombre();
            Direccion dire = crearDireccion();
            double media = pedirValoracion();
            aloja = new Apartamento(plazas, hayLimpieza, nom, dire, media);
        }
        return aloja;
    }
}
