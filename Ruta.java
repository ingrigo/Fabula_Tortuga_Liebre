/**
 *
 * @author RODRIGO GALVAN
 */

package fabula_liebre_tortuga;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ruta extends JFrame {
    private final JPanel[] paneles;
    private final JLabel[] labeles;
    private final String[] nombres = {"Liebre", "Tortuga"};
    private final JButton miboton;
    private final static Integer ANCHOVENTANA = 400;
    
    public Ruta(){
        setLayout(new GridLayout(0,1));
        paneles=new JPanel[2];
        labeles=new JLabel[2];        
        
        for (int n=0;n<2;n++){
            paneles[n]=new JPanel();
            add(paneles[n]);
            labeles[n]=new JLabel("");
            labeles[n].setIcon(new ImageIcon(getClass().getResource(nombres[n]+".jpg")));            
            paneles[n].add(labeles[n]);
            labeles[n].setLocation(0,0);
        }
        
        miboton=new JButton("Comenzar Fabula");
        miboton.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                Tortuga lacorredora;
                lacorredora=new Tortuga("La Tortuga Corredora",40,ANCHOVENTANA - 90,labeles[1]);
                Liebre correcaminos;
                //correcaminos = new Liebre("El Correcaminos",8,ANCHOVENTANA - 150,labeles[0]);
                correcaminos = new Liebre("El Correcaminos",20,ANCHOVENTANA - 124,labeles[0]);
                correcaminos.start();
                lacorredora.start();                
            }
        });
        
        add(miboton);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(250,200);
        setSize(ANCHOVENTANA,500);
        setVisible(true);
    }
}
