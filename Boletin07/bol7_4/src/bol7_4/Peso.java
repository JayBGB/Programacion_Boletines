
package bol7_4;


public class Peso {
    
    public void diferenciaPeso (String nomA, String nomB, double numA, double numB){
        
       if (numA>numB){
       
            System.out.println(nomA + " pesa " + (numA-numB) + "kg más que " + nomB + ".");
       
       }
       
       
       else if (numB>numA) {
       
           System.out.println(nomB + " pesa " + (numB-numA) + "kg más que " + nomA + ".");
           
       }
       
       else {
       
           System.out.println(nomA + " y " + nomB + " pesan lo mismo.");
           
       }
             
    }
    


}
   
   
    
      
    
   
    
 
 
