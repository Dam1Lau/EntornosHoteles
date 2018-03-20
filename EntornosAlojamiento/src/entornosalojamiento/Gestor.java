/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornosalojamiento;

import java.util.Scanner;

public class Gestor {

    private Alojamiento[] alojamientos;  //podria ponerse como final para que la doreccion de ram no cambie

    public Gestor() {
        alojamientos = new Alojamiento[10];
    }

    public Alojamiento[] getAlojamientos() {
        return alojamientos;
    }

//    public void setAlojamientos(Alojamiento[] alojamientos) {
//        this.alojamientos = alojamientos;
//    }   Para que no nos dejen a null los alojamientos, quitaremos el set.
    public void anadirAlojamiento(Alojamiento alojamiento) {
        for (int i = 0; i < alojamientos.length; i++) {
            if (alojamientos[i] == null) {
                alojamientos[i] = alojamiento;
            } else {
                System.out.println("No se ha podido añadir el alojamiento. No hay espacio.");
            }
        }

    }

    public void consultaAlojamientos(String provincia, double vmedia) {
        for (int i = 0; i < alojamientos.length; i++) {
            if (alojamientos[i] != null
                    && alojamientos[i].getDireccion().getProvincia().compareToIgnoreCase(provincia) == 0
                    && alojamientos[i].getValoracionMedia() > vmedia) {
                System.out.println(alojamientos[i].toString());
            }
        }
    }

    public void actualizarCategoria(String nombre, int categoria) {
        boolean salir = false;
        for (int i = 0; i < alojamientos.length && salir == false; i++) {
        
            if (alojamientos[i] != null
                    && alojamientos[i].getClass().getSimpleName().equalsIgnoreCase("Hotel")
                    && alojamientos[i].getNombre().equalsIgnoreCase(nombre)) {
                ((Hotel) alojamientos[i]).setCategoria(categoria);
                salir = true;
            }
        }
    }

    public void listarApartamentos(int plazas) {
        for (int i = 0; i < alojamientos.length; i++) {
            if (alojamientos[i] != null
                    && alojamientos[i].getClass().getSimpleName().equalsIgnoreCase("Apartamento")
                    && ((Apartamento) alojamientos[i]).getNumPlazas() >= plazas) {
                System.out.println(alojamientos[i].toString());
            }
        }
    }

    public void eliminarAlojamientos(String provincia) {
        char respuesta;
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < alojamientos.length; i++) {
            if (alojamientos[i] != null
                    && alojamientos[i].getDireccion().getProvincia().equalsIgnoreCase(provincia)) {
                System.out.println("¿Está seguro de que desea elimiar " + alojamientos[i].getNombre() + " (s/n)");
                do {
                    respuesta = lector.nextLine().toLowerCase().charAt(0);
                    if (respuesta == 's') {
                        alojamientos[i] = null;
                    } else if (respuesta == 'n') {
                        System.out.println("");
                    }

                } while (respuesta != 's' && respuesta != 'n');

            }
        }

    }
    
    public double facturacionTotal(int dias){
        double pelas = 0;
        for (int i = 0; i < alojamientos.length; i++) {
            if (alojamientos[i] != null
                    )
            pelas += alojamientos[i].calcularTarifa(dias);
            
        }
        return pelas;
    }
}
