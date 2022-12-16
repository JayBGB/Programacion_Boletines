package com.jay.bol13;
import com.jay.bol13second.Persoal;
import javax.swing.JOptionPane;

/**
 *
 * @author JayBGB
 */
public class Academica {

    //Attributes
    
    public static int numReferencia = 2018;
    private String nome;
    private int nota;
    private Persoal alum;
    
    //Constructors

    public Academica(String nome, int nota, Persoal alum) {
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
    }
    
    public Academica (){}
    
    //Getters & Setters

    public static int getNumReferencia() {
        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia) {
        Academica.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }
    
    // Methods
    
    public int validarNota(){
        do{
           nota = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nota (Debe estar entre 0 y 10)"));
        }while(nota<1 || nota>10);
        return nota;
    }
    
    //toString

    @Override
    public String toString() {
        return "Academica{" + "nome=" + nome + ", nota=" + nota + ", alum=" + alum + '}';
    }
    
    

}

