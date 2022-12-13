//Programa que lea dos números y calcule primero la suma,
//luego la resta, a continuación el producto y por último
//el cociente.
package bol2_4;

import java.util.Scanner;


public class Bol2_4 {

    
    public static void main(String[] args) {
        
       float num1, num2;
       
       System.out.println("¡Vamos a hacer cosas de matemáticas! Tendrás que introducir dos números.");
       System.out.println("¡Introduce el primero!");
       
       Scanner numeroUno = new Scanner (System.in);
       num1 = numeroUno.nextFloat();
       
       System.out.println("¡Y ahora introduce el segundo!");
       
       Scanner numeroDos = new Scanner (System.in);
       num2 = numeroDos.nextFloat();
        
       float suma=num1+(num2);
       float resta=num1-(num2);
       float producto=num1*(num2);
       float cociente=num1/(num2);
       
       System.out.println("Veamos...\nEl resultado de la suma de los números que has introducido es... ¡"+suma+"!");
       System.out.println("El resultado de la resta es "+resta+", el de la multiplicación sería "+producto+" y el de la división "+cociente+".");
       
    
            
    }
    
}
