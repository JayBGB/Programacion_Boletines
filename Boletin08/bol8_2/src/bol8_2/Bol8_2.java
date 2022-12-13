
package bol8_2;

import javax.swing.JOptionPane;


public class Bol8_2 {

    
    public static void main(String[] args) {
        
        Opciones obj = new Opciones ();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona la figura cuya superficie deseas calcular:\n1. Cuadrado\n2. Triángulo\n3. Círculo"));
        obj.opciones(opcion);
        
    }
    
}
