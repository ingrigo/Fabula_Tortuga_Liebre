/**
 *
 * @author RODRIGO GALVAN
 */
package fabula_liebre_tortuga;

public class Tortuga extends Animal{
    private final static String TIPO = "REPTIL";
    private String habitat;     //Solo es posible modificar este atributo con el constructor
    private int velocidad=3;    //Velocidad de la Tortuga en tierra
    
    public Tortuga(String nombre){
        super(nombre);
    }
    
    public Tortuga(String nombre, String habitat){ 
        //Solo se modifica la velocidad de la tortuga cuando una tortuga sea acuatica
        super(nombre);
        this.habitat=habitat;
        
        if ("ACUATICA".equals(habitat))
          velocidad=velocidad-1;        //Cuando es una tortuga con aletas (acuatica) disminuye su velocidad
    }
    
    public String getHabitat(){
        return habitat;
    }
    
    public String getTipo(){
        return TIPO;
    }
    
    public void setVelocidad(Integer velocidad){
        this.velocidad=velocidad;
    }
    
    public Integer getVelocidad(){
        return velocidad;
    }    
}
