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

//    public static Alojamiento crearAlojamiento() {
//        Alojamiento aloja;
//        int opcion;
//        Scanner lector = new Scanner(System.in);
//        System.out.println("---Introduzca los datos del nuevo alojamiento---");
//        System.out.println("¿Qué tipo es? 1. Hotel   2. Apartamento");
//        do {
//            opcion = lector.nextInt();
//        } while (opcion != 1 || opcion != 2);
//        if (opcion == 1) {
//            System.out.println("Introduce el nombre del hotel:");
//            StringBuilder servicios;
//            String nombre;
//            double tarifa, vmedia;
//            int categoria;
//            aloja = new Hotel();
//        } else {
//
//        }
//        return aloja;
//    }

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
        System.out.println("Introduzca la valoración del hotel:");
        do {
            valor = lector.nextDouble();
        } while (!lector.hasNextDouble());

        return valor;
    }

    public static int pedirCategoria() {
        return 1;
    }
}
