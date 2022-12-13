
package bol7_5;


public class Numeros {
    
    public void comparacion (double numA, double numB, double numC){
    
    if ((numA==numB)||(numA==numC)||(numC==numB)){
    
        System.out.println("Introduce números diferentes.");
    
    }
    
    else if ((numB>numA)&&(numB>numC)){
    
        System.out.println("El mayor número de los 3 es el "+numB);
    
    }
    
    else if ((numC>numA)&&(numC>numB)){
    
        System.out.println("El mayor número de los 3 es el "+numC);
        
    }
    
    else if ((numA>numB)&&(numA>numC)){
        
        System.out.println("El mayor número de los 3 es el "+numA);
    }
    
    else {
    
        System.out.println("Los números no son válidos.");
    
    }
    
    
    }
    
}
