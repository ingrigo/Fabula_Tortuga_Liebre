/**
 *
 * @author RODRIGO GALVAN
 */
package fabula_liebre_tortuga;

public class Fabula_Liebre_Tortuga {

    public static void main(String[] args) {
        Tortuga corredora;
        corredora=new Tortuga("Tortuga Ninja", "ACUATICA");
        Liebre correcaminos;
        correcaminos = new Liebre("El Correcaminos");
        
        System.out.println(corredora.getVelocidad());
        System.out.println(correcaminos.getVelocidad());        
        
    }
    
}
