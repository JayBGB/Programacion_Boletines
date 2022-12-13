
package bol17;

import javax.swing.JOptionPane;

/**
 *
 * @author JayBGB
 */

public class ProbasEscritas {
      private float nota1, nota2;

    
    public float globalEscrita (){
       nota1=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la primera prueba escrita: "));
       nota2=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la segunda prueba escrita: "));
       float notaGlobal=(float)(((nota1+nota2)/2)*0.4);
       return notaGlobal;
       
       
    } 
   
    
}
