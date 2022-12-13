//Programa que muestre el porcentaje descontado a una compra.

package bol3_1;

import java.util.Scanner;

public class App {
   

   public static void main(String[] args) {
        
       System.out.print("Introduce la tarifa: ");
       Scanner objTar = new Scanner (System.in);
       float tarifa = objTar.nextFloat();
       
       System.out.print("Introduce el precio pagado: ");
       Scanner objPrec = new Scanner (System.in);
       float precio = objPrec.nextFloat();
       
       //Restamos al 100% el porcentaje que hemos pagado para obtener el porcentaje que se ha descontado.
       float descuento = 100-((precio*100)/tarifa);
       
       
       System.out.print("El descuento aplicado a esta tarifa es del "+descuento+"%.");
       
       
       
    }
}
