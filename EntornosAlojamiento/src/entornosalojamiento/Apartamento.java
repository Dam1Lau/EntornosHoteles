/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornosalojamiento;

/**
 *
 * @author Laura
 */
public class Apartamento extends Alojamiento {

    private int numPlazas;
    private boolean limpieza;

    public Apartamento() {
    }

    public Apartamento(int numPlazas, boolean limpieza, String nombre, Direccion direccion, double valoracionMedia) {
        super(nombre, direccion, valoracionMedia);
        this.numPlazas = numPlazas;
        this.limpieza = limpieza;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    @Override
    public String toString() {
        if (limpieza) {
            return "Apartamento con" + numPlazas + " plazas, y servicio de limpieza incluido";
        } else {
            return "Apartamento con" + numPlazas + " plazas y sin servicio de limpieza.";
        }
    }

}
