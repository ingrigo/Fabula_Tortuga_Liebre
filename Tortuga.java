/**
 *
 * @author RODRIGO GALVAN
 */
package fabula_liebre_tortuga;

import static java.lang.Thread.yield;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Tortuga extends Animal{
    private final static String TIPO = "REPTIL";
    private final JLabel label;
    private final Integer meta;
    
    public Tortuga(String nombre, Integer lentitud, Integer meta, JLabel label){
        super(nombre, lentitud);
        this.label=label;
        this.meta=meta;
    }
         
    public String getTipo(){
        return TIPO;
    }
    
    @Override
    public void run(){
        for (int n=0; n<meta; n++ ){
            try {
                Thread.sleep(getLentitud());
                label.setLocation(n, 0);
            } catch (InterruptedException ex) {
                Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        yield();
    }
}
