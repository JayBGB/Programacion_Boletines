
package bol17;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Bol17 {
    
    private static final DecimalFormat DF = new DecimalFormat("0.00");

    public static void main(String[] args) {
        
        DF.setRoundingMode(RoundingMode.UP);
       
   do { 
    ProbasEscritas escrita = new ProbasEscritas();    
    float pEscrita=escrita.globalEscrita();
    
    ProbaPractica practica = new ProbaPractica();
    float pPractica=practica.globalPractica();
    
    Boletins boletines = new Boletins ();
    float pBoletines=boletines.globalBoletins();
    
     
    float notaTotal=pEscrita+pPractica+pBoletines;
    
    JOptionPane.showMessageDialog(null, "PROBAS TEÓRICAS.........."+DF.format(pEscrita)+"\nPROBA PRÁCTICA.........."+DF.format(pPractica)+"\nBOLETINS.........."+DF.format(pBoletines)+"\nNOTA TOTAL.........."+DF.format(notaTotal));
    
   }
   
   while (JOptionPane.showConfirmDialog(null, "¿Desexas calcular outra nota?")==0);
   
        
    }
}
    

