
package bol6_3;


public class Bol6_3 {

    
    public static void main(String[] args) {
        
        Circulo objC1 = new Circulo();
        objC1.setRadio(15);
        
        System.out.println("área="+objC1.calcularArea());
        System.out.println("longitud="+objC1.calcularLongitud());
        
        
        Circulo objC2 = new Circulo(10);
        System.out.println("área="+objC2.calcularArea());
        System.out.println("longitud="+objC2.calcularLongitud());
        
    }
    
}
