package bol17;

import javax.swing.JOptionPane;

/**
 *
 * @author JayBGB
 */
public class ProbaPractica {
    
    public float globalPractica (){
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la prueba práctica: "));
        float notaGlobal=(float)(nota*0.4);
        return notaGlobal;
    }
}
