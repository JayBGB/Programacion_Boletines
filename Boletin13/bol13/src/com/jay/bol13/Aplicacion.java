package com.jay.bol13;
import com.jay.bol13second.Persoal;

/**
 *
 * @author JayBGB
 */
public class Aplicacion {

    
    public static void main(String[] args) {
        
       Persoal objP = new Persoal ("666777888", "alumno@danielcastelao.org");
       Academica objA = new Academica ("Alumno", 7, objP);
       
        System.out.println(objA);
    }
    
}
