/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiApp;
import javax.swing.JOptionPane;
/**
 *Para crear una libreta, aporta métodos que contrenda dicha libreta
 * @author epastorizalorenzo
 */
public class Libreta {
    //private String nombre;
    //private String dni;
    private final Contacto[] contactos=new Contacto[10];
    private final Grupo[] grupos = new Grupo[10];
    
    public Libreta(){
        /*for(int i=0;i<contactos.length;i++){
            contactos[i]=new Contacto();
            contactos[i].setNombre("");
        }*/
    }
    
    /**
     * para crear un contacto y añadirlo a la libreta
     * @param contacto.
     */
    public void engadir(Contacto contacto){
        boolean libretaLlena=true;
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]==null){
                contactos[i]=contacto;
                libretaLlena=false;
                break;
            }
        }
        
        if(libretaLlena){
            JOptionPane.showMessageDialog(null, "Libreta llena");
        }
    }
    
    /**
     * para crear un contacto y añadirlo a la libreta.
     */
    public void engadir(){
        boolean libretaLlena=true;
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]==null){
                Contacto contacto = new Contacto(JOptionPane.showInputDialog("Nombre:"),JOptionPane.showInputDialog("Apellidos:"));
                contactos[i]=contacto;
                libretaLlena=false;
                break;
            }
        }
        
        if(libretaLlena){
            JOptionPane.showMessageDialog(null, "Libreta llena");
        }
    }
    
    /**
     * visualizamos los contactos.
     */
    public void listar(){
        String cadena="";
        for(Contacto elemento:contactos){
            if(elemento!=null){
                cadena+=elemento.toString()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
    
    /**
     * este metodo nos permite borrar contactos de la libreta.
     */
    public void borrar(){
        boolean notFound = true;
        int id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del contacto que desea borrar:"));
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]!=null){
                if(contactos[i].getId()==id){
                    contactos[i]=null;
                    notFound=false;
                    break;
                }
            }
        }
        if(notFound){
            JOptionPane.showMessageDialog(null, "Contacto no encontrado");
        }
    }
    
    /**
     * Permite crear un grupo de contactos.
     */
    public void crearGrupo(){
        boolean grupoLleno = true;
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del grupo");
        Grupo grupo = new Grupo(nombre);
        for(int i=0;i<grupos.length;i++){
            if(grupos[i]==null){
                grupos[i]=grupo;
                grupoLleno=false;
                break;
            }
        }
        if(grupoLleno){
            JOptionPane.showMessageDialog(null, "Límite de grupos alcanzado");
        }
    }
    
    /**
     * Permite agregar un contacto a un grupo a partir del id del contacto y el nombre del grupo.
     */
    public void agregarAGrupo(){
        boolean contactoEncontrado = false ,grupoEncontrado = false;
        int indiceContactos = 0, indiceGrupos=0;
        int id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del contacto que quiere guardar en el grupo:"));
        String nombreGrupo = JOptionPane.showInputDialog("Nombre del grupo en el que quiere guardar el contacto:");
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]!=null){
                if(contactos[i].getId()==id){
                    indiceContactos=i;
                    contactoEncontrado=true;
                    break;
                }
            }
        }
        
        for(int i=0;i<grupos.length;i++){
            if(grupos[i]!=null){
                if(grupos[i].getNombre().equalsIgnoreCase(nombreGrupo)){
                    indiceGrupos=i;
                    grupoEncontrado=true;
                    break;
                }
            }
        }
        
        if(contactoEncontrado && grupoEncontrado){
            contactos[indiceContactos].setGrupo(grupos[indiceGrupos]);
        }
        else{
            JOptionPane.showMessageDialog(null, "Contacto o grupo no encontrado");
        }
    }
}
