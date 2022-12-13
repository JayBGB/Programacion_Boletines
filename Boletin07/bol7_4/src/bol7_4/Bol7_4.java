
package bol7_4;

import javax.swing.JOptionPane;


public class Bol7_4 {

    public static void main(String[] args) {
    
       String nombre1 = JOptionPane.showInputDialog("¿Cuál es el nombre de la primera persona?");
       double peso1 = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto pesa la primera persona?"));
       
       String nombre2 = JOptionPane.showInputDialog("¿Cuál es el nombre de la segunda persona?");
       double peso2 = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto pesa la segunda persona?"));
       
       Peso objPeso = new Peso ();
       objPeso.diferenciaPeso(nombre1, nombre2, peso1, peso2);
    
    
    
    
        
    }
    
}
