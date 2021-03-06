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
       nombre = "TestName";
       direccion = new Direccion();
       valoracionMedia = 5;
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
    
    public abstract double calcularTarifa(int dias);

    @Override
    public String toString() {
        return "\n" + "Nombre: " + nombre +", valoracion media: " + valoracionMedia + direccion;
    }
    
    // que nos diga cuanto cuesta alojarse en ese alojamiento segun si es hotel/apartamento
    /*
    Hotel: tiene una tarifa por dia
    Apartamento: por persona el precio es otro diaPersona
    */
    
    
}
