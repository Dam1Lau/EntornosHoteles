/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornosalojamiento;

import java.util.Scanner;

public class Gestor {

    private Alojamiento[] alojamientos;

    public Gestor() {
    }

    public Alojamiento[] getAlojamientos() {
        return alojamientos;
    }

    public void setAlojamientos(Alojamiento[] alojamientos) {
        this.alojamientos = alojamientos;
    }

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
            if (alojamientos[i].getDireccion().getProvincia().compareToIgnoreCase(provincia) == 0
                    && alojamientos[i].getValoracionMedia() > vmedia) {
                System.out.println(alojamientos[i].toString());
            }
        }
    }

    public void actualizarCategoria(String nombre, int categoria) {
        for (int i = 0; i < alojamientos.length; i++) {
            if (alojamientos[i].getNombre().compareToIgnoreCase(nombre) == 0
                    && alojamientos[i].getClass().getSimpleName().compareTo("Hotel") == 0) {
                ((Hotel) alojamientos[i]).setCategoria(categoria);
                i = alojamientos.length;
            }
        }
    }

    public void listarApartamentos(int plazas) {
        for (int i = 0; i < alojamientos.length; i++) {
            if (alojamientos[i].getClass().getSimpleName().equalsIgnoreCase("Apartamento")
                    && ((Apartamento) alojamientos[i]).getNumPlazas() >= plazas) {
                System.out.println(alojamientos[i]);
            }
        }
    }

    public void eliminarAlojamientos(String provincia) {
        char respuesta;
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < alojamientos.length; i++) {
            if (alojamientos[i].getDireccion().getProvincia().equalsIgnoreCase(provincia)) {
                System.out.println("¿Está seguro de que desea elimiar " + alojamientos[i].getNombre() + " (s/n)");
                do {                    
                   respuesta = lector.nextLine().toLowerCase().charAt(0);
                   if(respuesta == 's'){
                       alojamientos[i] = null;
                   }else if (respuesta == 'n'){
                       System.out.println("");
                   }
                    
                } while (respuesta !='s' && respuesta!='n');
                
               
            }
        }

    }
}
