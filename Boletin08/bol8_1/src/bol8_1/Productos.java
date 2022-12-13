
package bol8_1;

import javax.swing.JOptionPane;


public class Productos {
    
    public void cantidad (String nom, double num){

        if (num<=100){
            JOptionPane.showMessageDialog(null, nom + " es un artículo de consumo bajo.");
            
        
        }
        
        else if ((num>100)&&(num<=500)){
        
            
            JOptionPane.showMessageDialog(null, nom + " es un artículo de consumo medio.");
        }
        
        else if ((num>500)&&(num<=1000)){
        
            
            JOptionPane.showMessageDialog(null, nom + " es un artículo de consumo alto.");
        }
        
        else if (num>1000){
        
           
            JOptionPane.showMessageDialog(null, nom + " es un artículo de primera necesidad.");
        
        }
        
        else {
            
            JOptionPane.showMessageDialog(null, "Introduce valores válidos.");
            
            
        }

}
    
}
