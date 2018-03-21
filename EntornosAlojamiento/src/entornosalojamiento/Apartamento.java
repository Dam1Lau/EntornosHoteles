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
    private double tarifaDiaPlaza;

    public Apartamento() {
        this(5, true, "TestNombreAp", new Direccion(), 5);
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

    public double calcularTarifa(int dias) {
        return dias * this.tarifaDiaPlaza * this.numPlazas;
    }

    @Override
    public String toString() {
        if (limpieza) {
            return "Apartamento con " + numPlazas + " plazas, y servicio de limpieza incluido" + super.toString();
        } else {
            return "Apartamento con " + numPlazas + " plazas y sin servicio de limpieza." + super.toString();
        }
    }

}
