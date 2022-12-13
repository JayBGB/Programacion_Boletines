/*
*Amosar:
*1.- Todos los datos
*2.- Solamente precio
*3.- Solamente marca
*4.- Solamente velocidad
*/



package bol14;
import com.jay.partes.Cpu;
import com.jay.partes.Monitor;
import com.jay.partes.Teclado;

/**
 * @author JayBGB
 * @version 22.11.2022
 */



public class Bol14 {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        
       Monitor objMo = new Monitor (27.5f);
      // Cpu objPro = new Cpu (4800);
       
       
      
        
       Ordenador objPc = new Ordenador (1500.50f, objMo, new Teclado ("Newskill"), new Cpu (4800));
       
        System.out.println(objPc.toString());
       
        System.out.println("------------------------------------------------");
       
        System.out.println("Precio = "+objPc.getPrecio());
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Marca = "+objPc.getTe());
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Velocidad = "+objPc.getPro());
        
        System.out.println("------------------------------------------------");
       
       
      
       
        
        
       
    }
    
}
