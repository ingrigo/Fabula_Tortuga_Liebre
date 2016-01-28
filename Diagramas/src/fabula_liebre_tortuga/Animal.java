/**
 *
 * @author RODRIGO GALVAN
 */
package fabula_liebre_tortuga;


public abstract class Animal {
    private String nombre;
    private double peso;
    private int edad;
            
    public Animal(String nombre){
        this.nombre=nombre;
    }
              
    public void setPeso(Double peso){
        this.peso=peso;
    }
    
    public void setEdad(Integer edad){
        this.edad=edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Double getPeso(){
        return peso;
    }
    
    public Integer getEdad(){
        return edad;
    }
}
