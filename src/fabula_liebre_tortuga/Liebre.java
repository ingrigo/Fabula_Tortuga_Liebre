/**
 *
 * @author RODRIGO GALVAN
 */
package fabula_liebre_tortuga;

public class Liebre extends Animal {
    private final static String TIPO="MAMIFERO";
    private int velocidad=9;
    
    public Liebre(String nombre) {
        super(nombre);
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
