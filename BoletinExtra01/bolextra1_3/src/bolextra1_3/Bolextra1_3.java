
package bolextra1_3;

import java.util.Scanner;


public class Bolextra1_3 {

    
    public static void main(String[] args) {
        
        double a, b, c, x, xm;
        
        Scanner segundoGrado = new Scanner (System.in);
        
        System.out.print("Introduce el valor de a: ");
        
        a = segundoGrado.nextDouble();
                
        System.out.print("Introduce el valor de b: ");
        
        b = segundoGrado.nextDouble();
                
        System.out.print("Introduce el valor de c: ");
        
        c = segundoGrado.nextDouble();
        
        x= (-b + Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        xm= (-b - Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        
        System.out.println("El primer valor de x es "+x+" y el segundo es "+xm);
        
        
      
        
        
    }
    
}
