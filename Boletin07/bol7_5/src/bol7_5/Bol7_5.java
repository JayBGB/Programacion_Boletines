
package bol7_5;

import javax.swing.JOptionPane;


public class Bol7_5 {

    
    public static void main(String[] args) {
        
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número: "));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tercer número: "));
        
        Numeros objN = new Numeros();
        objN.comparacion(numero1, numero2, numero3);
    }
    
}
