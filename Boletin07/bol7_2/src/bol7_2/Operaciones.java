
package bol7_2;


public class Operaciones {
    
    //attributes
    
    private short num1, num2;
    
    //constructors
    
    public Operaciones (){}
    
    public Operaciones (short numero, short numero2){
    
    num1=numero;
    num2=numero2;
    
    }
    
    
   //setters & getters 
    public void setNum1 (short numero){
    num1=numero;
    }
    public short getNum1 (){
    return num1;
    }
    
    
    public void setNum2 (short numero2){
    num2=numero2;
    }
    public short getNum2(){
    return num2;
    }
    
    //methods
    
    public void operaciones (){
        
        short suma = (short)(num1 + num2);
        System.out.println(suma);
        
        
        
        if (num1>=num2){
            
            short resta = (short)(num1-num2);
            System.out.println(resta);
        
        }
        
        
    }
    
}
