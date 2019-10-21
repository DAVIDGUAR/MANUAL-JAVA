/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manual;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Ejemplo_Bucles_While {

    public static void main(String[] args) {

        String clave, contraseña;

        clave = "david";

        contraseña = "";

        while (clave.equalsIgnoreCase(contraseña) == false) {

            contraseña = JOptionPane.showInputDialog("Introduce contraseña");

            if (clave.equalsIgnoreCase(contraseña) == false) {

                System.out.println("Contraseña incorrecta");

            }

        }

        System.out.println("Acceso permitido");
        
        
        
          int n_aleatorio=(int)(Math.random()*100);
        
        
       int numero=0;
        
     int intentos=0;
     
     
     while (numero!=n_aleatorio){
         
         intentos++;
         
         numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
         
         
         if (numero<n_aleatorio){
             
             System.out.println("El numero introducido es mas pequeño que el que buscas");
             
            
             
             
         } else if (numero>n_aleatorio){
             
             System.out.println("El numero introducido es mas grande que el que buscas ");
             
         }
         
         
         
     }
        
        System.out.println("Correcto, lo as conseguido en : " + intentos + " intentos.");
        
    }

    }


