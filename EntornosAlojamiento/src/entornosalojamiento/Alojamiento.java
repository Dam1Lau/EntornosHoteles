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
public abstract class Alojamiento {
    private String nombre;
    private Direccion direccion;
    private double valoracionMedia;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, Direccion direccion, double valoracionMedia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.valoracionMedia = valoracionMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public double getValoracionMedia() {
        return valoracionMedia;
    }

    public void setValoracionMedia(double valoracionMedia) {
        this.valoracionMedia = valoracionMedia;
    }

    @Override
    public String toString() {
        return "Alojamiento: \n" + "Nombre: " + nombre + ", direccion: " + direccion + ", valoracion media: " + valoracionMedia;
    }
    
    
    
    
}
