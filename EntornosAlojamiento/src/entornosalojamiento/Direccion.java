
package entornosalojamiento;

public class Direccion {
    private String calle;
    private int codPostal;
    private String provincia;
    private String comunidad;

    public Direccion() {
    }

    public Direccion(String calle, int codPostal, String provincia, String comunidad) {
        this.calle = calle;
        this.codPostal = codPostal;
        this.provincia = provincia;
        this.comunidad = comunidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    @Override
    public String toString() {
        return "Direccion: " + "\n Calle: " + calle + "\n Código Postal: " + codPostal + "\nProvincia: " + provincia + "Comunidad: " + comunidad;
    }
    
    
    
    
}
