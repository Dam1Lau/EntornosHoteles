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
public class Hotel extends Alojamiento {
private int categoria;
private StringBuilder servicios;

    public Hotel() {
    }

    public Hotel(int categoria, StringBuilder servicios, String nombre, Direccion direccion, double valoracionMedia) {
        super(nombre, direccion, valoracionMedia);
        this.categoria = categoria;
        this.servicios = servicios;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public StringBuilder getServicios() {
        return servicios;
    }

    public void setServicios(StringBuilder servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "Hotel de categoria " + categoria + " estrellas con los siguientes servicios: " + servicios;
    }


}
