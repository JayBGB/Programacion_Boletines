//Programa para convertir millas marinas a metros.
package bol2_5;

import java.util.Scanner;


public class Bol2_5 {
    
public static final float METROS = 1852;
    
    public static void main(String[] args) {
       
        System.out.println("¿Deseas convertir millas marinas a metros?\nIntroduce cuántas millas deseas convertir: ");
        
        Scanner millasUno = new Scanner (System.in);
        float millas = millasUno.nextFloat();
        
        //Una milla marina son 1852 metros, por tanto:
        float cambio=millas*METROS;
        
        //Añado kilómetros por legibilidad.
        float km=cambio/1000;
        
       
        System.out.println(millas+" millas marinas son "+cambio+" metros o, dicho de otra forma, "+km+" km.");
        
        
    }
    
}
