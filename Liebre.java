/**
 *
 * @author RODRIGO GALVAN
 */
package fabula_liebre_tortuga;

import static java.lang.Thread.yield;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Liebre extends Animal {
    private final static String TIPO="MAMIFERO";
    private final JLabel label;
    private final Integer meta;
    
    public Liebre(String nombre, Integer velocidad, Integer meta, JLabel label) {
        super(nombre, velocidad);
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
                if (n==50) {
                    label.setIcon(new ImageIcon(getClass().getResource("LiebreZ.jpg")));  
                    label.setLocation(n,0);
                    Thread.sleep(meta*35);
                }
                label.setIcon(new ImageIcon(getClass().getResource("Liebre.jpg")));                  
            } catch (InterruptedException ex) {
                Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        yield();
    }
}