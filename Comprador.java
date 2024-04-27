
package modelo;

/**
 *
 * @author Jimena
 */
public class Comprador extends Usuario{
    
    String preferencias;

    public Comprador(String preferencias, int id, String nombre, String apellido, String correo, String contrasenia) {
        super(id, nombre, apellido, correo, contrasenia);
        this.preferencias = preferencias;
    }
    


    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    } 
    
}
