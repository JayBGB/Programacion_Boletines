/**
 * @author JayBGB
 * @version 22.11.2022
 */
package com.jay.partes;


public class Cpu {
    
    // Attributes
    
   private int velocidad;
    
    // Constructors

   /**
    * 
    * @param velocidad 
    */
    public Cpu(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public Cpu (){}
    
    // Setters & Getters

    /**
     * 
     * @param velocidad 
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * 
     * @return velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }
    
    // toString

    /**
     * 
     * @return Velocidad CPU
     */
    @Override
    public String toString() {
        return "Cpu{" + "velocidad=" + velocidad + '}';
    }
    
    
}
