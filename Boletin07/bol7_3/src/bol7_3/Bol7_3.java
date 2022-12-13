
package bol7_3;

import javax.swing.JOptionPane;


public class Bol7_3 {

  
    public static void main(String[] args) {
        
        Signos objSigno = new Signos ();
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        objSigno.signo(numero);
    }
    
}
