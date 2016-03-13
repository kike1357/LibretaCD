/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiApp;

/**
 * Introducimos los atributos a Contacto
 * @author epastorizalorenzo
 */
public class Contacto {
    public static int numeroContactos=1;
    private int id;
    private String nombre;
    private String apellidos;
    private Grupo grupo;
    
    
    /**
     *Build default.
     */
    public Contacto(){
        id=numeroContactos;
        numeroContactos++;
    }
    /**
    * 
    * @param id se introducen los valores de id.
    * @param nombre se introducen los valores de nombre.
    * @param apellido se introducen los valores de apellido.
    * @param numeroContactos se introducen los valores del numero de contactos.
    */
    public Contacto(String nombre,String apellidos){
        id=numeroContactos;
        this.nombre=nombre;
        this.apellidos=apellidos;
        numeroContactos++;
    }
    /**
     *
     * @return id del contacto.
     */
    public int getId(){
        return id;
    }
    
    /**
     *
     * @param id del contacto.
     */
    public void setId(int id){
        this.id=id;
    }
    /**
     *
     * @return numero de contactos.
     */
    public int getNumeroContactos() {
        return numeroContactos;
    }
    
    /**
     *
     * @param numero de contactos.
     */
    public void setNumeroContactos(int numeroContactos) {
        Contacto.numeroContactos = numeroContactos;
    }
    /**
     *
     * @return nombre del contacto.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     *
     * @param nombre nombre del contacto.
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     *
     * @return apellidos del contacto.
     */
    public String getApellidos() {
        return apellidos;
    }
    
    /**
     *
     * @param apellido apellidos del contacto.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    /**
     *
     * @return grupo del contacto.
     */
    public Grupo getGrupo() {
        return grupo;
    }
    
    /**
     *
     * @param grupo del contacto.
     */
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Contacto{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
    
}
