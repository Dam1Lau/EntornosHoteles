/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornosalojamiento;


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
    
    public void meterAlojamiento(Alojamiento alojamiento){
        for (int i = 0; i < alojamientos.length; i++) {
            if(alojamientos[i] == null){
                alojamientos[i] = alojamiento;
            }else
                System.out.println("No se ha podido añadir el alojamiento. No hay espacio.");
        }
    
    }
    public void consultaAlojamiento(String provincia, double vmedia){
        for (int i = 0; i < alojamientos.length; i++) {
            if(alojamientos[i].getDireccion().getProvincia().compareToIgnoreCase(provincia) == 0
                    && alojamientos[i].getValoracionMedia() >= vmedia){
                System.out.println(alojamientos[i].toString());
            }
        }
    
    }
}
