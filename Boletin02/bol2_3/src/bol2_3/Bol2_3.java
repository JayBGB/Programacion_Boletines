//Crea un algoritmo que cambie euros a dólares.
package bol2_3;

import java.util.Scanner;


public class Bol2_3 {

    
    public static void main(String[] args) {
        
    
    
    System.out.println("Introduce la cantidad de euros que deseas convertir a dólares\n(¡RECUERDA! Utiliza ',' para los decimales): ");
    
    Scanner objectOne = new Scanner(System.in);
    float euros=objectOne.nextFloat();
    
    System.out.println("Introduce el valor del dólar respecto al que deseas convertir:");
    Scanner objectTwo = new Scanner(System.in);
    float dolares=objectTwo.nextFloat();
    
    float cambio=euros*dolares;
    
    System.out.println(euros+"€ serían $"+cambio+" si el valor del dólar fuese $"+dolares);
        
        
    }
    
}
