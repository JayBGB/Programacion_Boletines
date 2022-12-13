
package bol6_1;


public class Bol6_1 {

    
    public static void main(String[] args) {
        
        Coche objCoche1 = new Coche ();
        objCoche1.acelerar(120);
        objCoche1.frenar(50);
        
        System.out.println("La velocidad tras acelerar y frenar es "+objCoche1.getVelocidade()+"km/h");
        
        
        
        
    }
    
}
