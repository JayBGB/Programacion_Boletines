
package bolextra1_2;

import java.util.Scanner;

public class Bolextra1_2 {

    public static void main(String[] args) {
        
        double a, b, c, x;
        Scanner polinomio = new Scanner (System.in);
        
        System.out.print("Introduce el valor de a: ");
        
        a = polinomio.nextDouble();
                
        System.out.print("Introduce el valor de b: ");
        
        b = polinomio.nextDouble();
                
        System.out.print("Introduce el valor de c: ");
        
        c = polinomio.nextDouble();
        
        System.out.print("Introduce el valor de x: ");
        
        x = polinomio.nextDouble();        
        
        double y=a*Math.pow(x, 2)+b*x+c;
        
        System.out.println(a+"*"+x+"²+"+b+"*"+x+"+"+c+"="+y);
    }
    
}
