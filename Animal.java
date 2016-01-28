/**
 *
 * @author RODRIGO GALVAN
 */
package fabula_liebre_tortuga;

public abstract class Animal extends Thread {
    private String nombre;
    private int lentitud;   //Define que tan despacio camina el animal
            
    public Animal(String nombre, Integer lentitud){
        this.nombre=nombre;
        this.lentitud=lentitud;
    }
                  
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setLentitud(Integer lentitud){
        this.lentitud=lentitud;
    }
    
    public Integer getLentitud(){
        return lentitud;
    }    
}
