package com.jay.bol13second;

/**
 *
 * @author JayBGB
 */
public class Persoal {

    //Attributes
    
    private String telefono, correo;
    
    // Constructors

    public Persoal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public Persoal (){}
    
    // Getters & Setters

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    // toString

    @Override
    public String toString() {
        return "Persoal{" + "telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    
}
