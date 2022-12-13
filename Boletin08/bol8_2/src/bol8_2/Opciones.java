
package bol8_2;

import javax.swing.JOptionPane;


public class Opciones {
    
    public void opciones (int opcion){
        
    
    switch (opcion) {
    
        case 1:
            
            double lado=Double.parseDouble(JOptionPane.showInputDialog("Medida de uno de los lados del cuadrado: "));
            double supC=Math.pow(lado, lado);
            JOptionPane.showMessageDialog(null, "La superficie de tu cuadrado es "+supC);
           
            break;
            
        case 2:
            
            double base=Double.parseDouble(JOptionPane.showInputDialog("Medida de la base del triángulo: "));
            double altura=Double.parseDouble(JOptionPane.showInputDialog("Medida de la altura del triángulo: "));
            double supT=(base*altura)/2;
            JOptionPane.showMessageDialog(null, "La superficie de tu triángulo es "+supT);
            
            break;
            
        case 3:
            double radio=Double.parseDouble(JOptionPane.showInputDialog("Medida del radio del círculo: "));
            double supCc=Math.PI*Math.pow(radio, 2);
            JOptionPane.showMessageDialog(null, "La superficie de tu círculo es "+supCc);
          
            break; 
            
        default:
            JOptionPane.showMessageDialog(null, "Opción incorrecta.");
          
            break;
    
    
    }
    
    }
    
}
