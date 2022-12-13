
package bol3_4;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
         
        System.out.println("¿Cúantos euros tienes?");
        
        Scanner scanEur = new Scanner (System.in);
        int euros=scanEur.nextInt();
        scanEur.close();
        
        int b100= (int) (euros/100);
        int b20= (int) ((euros%100)/20);
        int b5= (int) ((euros%100)%20)/5;
        int m1= ((euros%100)%20)%5;
        
        System.out.println("Entonces tienes "+b100+" billetes de 100€, "+b20+" billetes de 20€, "+b5+" billetes de 5€ y "+m1+" monedas de 1€.");
    }
}
