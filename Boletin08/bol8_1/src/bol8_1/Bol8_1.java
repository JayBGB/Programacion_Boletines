
package bol8_1;

import javax.swing.JOptionPane;


public class Bol8_1 {

   
    public static void main(String[] args) {
        
        Productos obj = new Productos ();
        
        String articulo = JOptionPane.showInputDialog("Introduce el nombre del artículo: ");
        double ventas = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número de "+articulo+" vendid@s."));
        
        obj.cantidad(articulo, ventas);
    }
    
}
