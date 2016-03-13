package MiApp;


/**
 *Para agrupar los contactos en grupo solo dispones de getters y setters.
 * @author epastorizalorenzo
 */
public class Grupo {
    
    private String nombre;
    private Contacto[] contactos;
    
    public Grupo(String nombre){
        this.nombre=nombre;
    }
    /**
     *
     * @return nombre.
     */
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     *
     * @return contactos.
     */
    public Contacto[] getContactos() {
        return contactos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }
    
    
    
}
    

