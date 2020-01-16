/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Interfaz_Clase_Interna;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author david
 */
public class Ejemplo_Interfaz_Clase_Interna {

    public static void main(String[] args) {

        Reloj reloj1 = new Reloj(3000, true);

        reloj1.enMarcha();

        JOptionPane.showMessageDialog(null, "Pulsa para terminar");

    }

}

class Reloj {

    private int intervalo;
    private boolean sonido;

    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void enMarcha() {

        ActionListener oyente = new DameLaHora();

        Timer el_temporizador = new Timer(intervalo, oyente);

        el_temporizador.start();

    }
    
    
    private class DameLaHora implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            
            Date ahora=new Date();
            
            System.out.println("Te pongo la hora cada 3 seg." + ahora);
            
            
            if (sonido){
                
                Toolkit.getDefaultToolkit().beep();
                
                
            }
            
            
        }
        
    }
    

}

/*
 public static void main(String[] args) {
        
 DameLaHora oyente=new DameLaHora();// la siguiente linea de codigo es lo mismo que esta.
        
 //ActionListener oyente=new DameHora();

 Timer el_temporizador = new Timer(5000, oyente);
        
        
 el_temporizador.start();
        
 JOptionPane.showMessageDialog(null,"Hola, pulsa aceptar para detener. ");
        
 System.exit(0);
        

 }

 }

 class DameLaHora implements ActionListener {

 public void actionPerformed(ActionEvent e) {
        
 Date ahora =new Date();
        
 System.out.println("Te pongo la hora cada 5 seg. "+ahora);
        
 Toolkit.getDefaultToolkit().beep();
        
        
        
 }


CLASE INTERNE LOCAL

public static void main(String[] args) {

        Reloj reloj1 = new Reloj();

        reloj1.enMarcha(3000, true);

        JOptionPane.showMessageDialog(null, "Pulsa para terminar");

    }



class Reloj {

   
    public void enMarcha(int intervalo, final boolean sonido) {

     class DameLaHora implements ActionListener{            
        
        public void actionPerformed(ActionEvent e){
            
            Date ahora=new Date();
            
            System.out.println("Te pongo la hora cada 3 seg." + ahora);
            
            
            if (sonido){
                
                Toolkit.getDefaultToolkit().beep();
                
                
            }




        ActionListener oyente = new DameLaHora();

        Timer el_temporizador = new Timer(intervalo, oyente);

        el_temporizador.start();

    }
    
    
    






 */
