/**
 * @author JayBGB
 * @version 22.11.2022
 */
package bol14;
import com.jay.partes.Cpu;
import com.jay.partes.Monitor;
import com.jay.partes.Teclado;


public class Ordenador {
    
    // Attributes
    
    private float precio;
    private Monitor mo;
    private Teclado te;
    private Cpu pro;
    
    /**
     * 
     * @param precio
     * @param mo
     * @param te
     * @param pro 
     */
    
    // Constructors

    public Ordenador(float precio, Monitor mo, Teclado te, Cpu pro) {
        this.precio = precio;
        this.mo = mo;
        this.te = te;
        this.pro = pro;
    }
    
    public Ordenador (){}
    
    // Setters & Getters
    
    /**
     * 
     * @param precio 
     */

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    /**
     * 
     * @param mo 
     */

    public void setMo(Monitor mo) {
        this.mo = mo;
    }

    /**
     * 
     * @param te 
     */
    public void setTe(Teclado te) {
        this.te = te;
    }
    
    /**
     * 
     * @param pro 
     */
    public void setPro(Cpu pro) {
        this.pro = pro;
    }
    
    /**
     * 
     * @return precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * 
     * @return monitor
     */
    public Monitor getMo() {
        return mo;
    }

    /**
     * 
     * @return teclado 
     */
    public Teclado getTe() {
        return te;
    }

    /**
     * 
     * @return return velocidad procesador
     */
    public Cpu getPro() {
        return pro;
    }
    
    // toString

    /**
     * 
     * @return piezas
     */
    @Override
    public String toString() {
        return "Ordenador{" + "precio=" + precio + ", mo=" + mo + ", te=" + te + ", pro=" + pro + '}';
    }
    
    
    
    
   
    
}
