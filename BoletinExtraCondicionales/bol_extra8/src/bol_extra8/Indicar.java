
package bol_extra8;

import javax.swing.JOptionPane;


public class Indicar {
    
    public void cifras (){
        
    int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 0 y 99999\npara ver de cuántas cifras consta: "));
    
    if ((num>=0)&&(num<10)){
    JOptionPane.showMessageDialog(null, num + " tiene una cifra.");
    }
    
    else if ((num>=10)&&(num<100)){
    JOptionPane.showMessageDialog(null, num + " tiene dos cifras.");
    }
    
    else if ((num>=100)&&(num<1000)){
    JOptionPane.showMessageDialog(null, num + " tiene tres cifras.");
    }
    
    else if ((num>=1000)&&(num<10000)){
    JOptionPane.showMessageDialog(null, num + " tiene cuatro cifras.");
    }
    
    else if ((num>=10000)&&(num<100000)){
    JOptionPane.showMessageDialog(null, num + " tiene cinco cifras.");
    }
    
    else if (num>=100000){
    JOptionPane.showMessageDialog(null, "El número debe ser menor a 100000.");
    }
    
    else {
    JOptionPane.showMessageDialog(null, "El número no debe ser negativo.");
    }
    }
    
}
