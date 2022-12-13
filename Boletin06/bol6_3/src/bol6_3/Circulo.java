

package bol6_3;


public class Circulo {
    
    //attributes
    
    private double radio;
    public static final double PI=3.14;
    
    //constructors
    
    public Circulo(){}
    
    public Circulo (double r){
    radio=r;
    }
    
    //setters & getters
    public void setRadio(double r){
    radio=r;
    }
    public double getRadio(){
    return radio;
    }
   
    
    //methods
    
    public double calcularArea(){
    double area=PI*Math.pow(radio, 2); 
    return area;
    }
    
    public double calcularLongitud(){
    double longitud=2*PI*radio;
    return longitud; //return 2*PI*radio;
    }
    
    
}
