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
    private double tarifaDia;

    public Hotel() {
        this(4, new StringBuilder("Servicios: Top kek"), "TestHotel", new Direccion(), 6.2, 5);
    }

    public Hotel(int categoria, StringBuilder servicios, String nombre, Direccion direccion, double valoracionMedia, double tarifa) {
        super(nombre, direccion, valoracionMedia);
        this.categoria = categoria;
        this.servicios = servicios;
        this.tarifaDia = tarifa;
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

    /**
     * La diferencia del set y este es que añado a los servicios uno nuevo con
     * append.
     *
     * @param servicionuevo
     */
    public void updateServicios(String servicionuevo) {
        servicios.append(servicionuevo);
    }

    @Override
    public double calcularTarifa(int dias) {
        return dias * this.tarifaDia;
    }

    @Override
    public String toString() {
        return "Hotel de categoria " + categoria + " estrellas con los siguientes servicios: " + servicios;
    }

}
