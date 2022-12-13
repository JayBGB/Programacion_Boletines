/**
 * @author JayBGB
 * @version 22.11.2022
 */
package com.jay.partes;


public class Teclado {
    
    // Attributes
    
    private String marca;
    
    // Constructors 

    /**
     * 
     * @param marca 
     */
    public Teclado(String marca) {
        this.marca = marca;
    }
    
    public Teclado (){}
    
    // Setters & Getters

    /**
     * 
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * 
     * @return marca del teclado
     */
    public String getMarca() {
        return marca;
    }
    
    // toString

    /**
     * 
     * @return marca
     */
    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + '}';
    }
    
    
    
}
