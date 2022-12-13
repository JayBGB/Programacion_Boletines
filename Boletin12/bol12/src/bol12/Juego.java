
package bol12;

import javax.swing.JOptionPane;


public class Juego {
    
    public void adivina () {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1, introduce el número entre 1 y 50 que debe adivinar el jugador 2: "));
        int intentos = Integer.parseInt(JOptionPane.showInputDialog("¿En cuántos intentos debe adivinarlo?"));
        int adivinar = Integer.parseInt(JOptionPane.showInputDialog("¡Adivina el número!\nEstá entre el 1 y el 50... ¡ambos incluidos!"));
        
       
        if (adivinar==num){
        
        JOptionPane.showMessageDialog(null, "¡Has acertado el número!");
        
        }
        

        else while (adivinar!=num){
        
        intentos --;
        
        if (intentos<=0){
        
        JOptionPane.showMessageDialog(null, "Te has quedado sin intentos.");
        break;
        
        }
        
        else if ((adivinar>50||adivinar<1)&&adivinar!=num){
        
            adivinar = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 1 y 50:"));
        
        }
        
        else if (adivinar<num){
        
            adivinar = Integer.parseInt(JOptionPane.showInputDialog("¡Estás buscando un número mayor que "+adivinar+"!"));
        
        }
       
        
        else if (adivinar>num){
        adivinar=Integer.parseInt(JOptionPane.showInputDialog("¡Estás buscando un número menor que "+adivinar+"!"));
        }
        
        else {
        
            JOptionPane.showMessageDialog(null, "¡Has acertado el número!");
        
        }
        
        
       if (adivinar==num){
        
        JOptionPane.showMessageDialog(null, "¡Has acertado el número!");
        
        }
            
        }
        
        }            
        
        }
    
       
        

    
