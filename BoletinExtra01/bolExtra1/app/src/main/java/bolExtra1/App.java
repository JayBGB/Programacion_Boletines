//Un economista hace un programa que realice cálculos con IVA. 
//La aplicación debe solicitar la base imponible y el IVA que se debe aplicar. 
//Mostrar por pantalla el importe correspondiente, el IVA y el total (con IVA).


package bolExtra1;

import java.util.Scanner;

public class App {
    
    
   public static void main(String[] args) {
       
       System.out.print("Introduce el IVA aplicable: ");
       Scanner ivaScan = new Scanner(System.in);
       double iva = ivaScan.nextDouble();
      
       System.out.print("Introduce la base imponible: ");
      // Scanner baseScan = new Scanner (System.in);
       double baseImp = ivaScan.nextDouble();
       
       double total = baseImp + (baseImp*(iva/100));
       
       System.out.println("Teniendo una base imponible de "+baseImp+"€ y aplicando un IVA del "+iva+"% tendríamos un total de "+total+"€.");
        
    }
}