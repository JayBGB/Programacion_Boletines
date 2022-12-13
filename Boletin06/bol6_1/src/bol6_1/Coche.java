
package bol6_1;


public class Coche {
    
    private int velocidade ;

    public Coche(){
    velocidade =0 ;
    
}
    
    
    public int getVelocidade(){
    return velocidade;
    }
    
    
    public void acelerar (int valor){
    velocidade+=(int)valor;
        
   
    }
    
    
    public void frenar (int menos) {
    velocidade-=(int)menos; 
        
    }
    
    
    
    
}
