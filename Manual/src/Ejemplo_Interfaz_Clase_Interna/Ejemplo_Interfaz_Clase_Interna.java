/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Interfaz_Clase_Interna;

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
    }

   

}
