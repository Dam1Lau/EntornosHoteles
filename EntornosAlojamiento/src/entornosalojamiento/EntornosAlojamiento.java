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
public class EntornosAlojamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gestor Uno = new Gestor();
        System.out.println("=====================\n OPCIONES: \n  1. Añadir alojamiento\n  2. Listar Apartamentos \n  3. Consultar Alojamientos");
        Uno.anadirAlojamiento(Utilidades.crearAlojamiento());
        Uno.listarApartamentos(Utilidades.pedirPlazas());
        
    }
    
}
