package Manual;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author david
 */
public class Ejemplo_Bucle_For {

    public static void main(String[] args) {

        /*   
        
         for (int i = 0; i < 10; i++) { //para i =0, numero de veces que se repite, cuenta de 1 en 1. Escribe tu nombre 10 veces
         
         System.out.println("David");

         }
         for (int i = 2; i < 10; i++) { //escribe tu nombre 8 veces
         
            
         System.out.println("Maria");

         }
         for (int i = 10; i <10; i--){ //hace lo mismo que el de arriba pero con el bucle inicializado a la inversa.
             
         System.out.println("David");
             
         }
        
         */
        int arroba = 0;

        boolean punto = false;

        String email = JOptionPane.showInputDialog("Introduce tu correo electronico: ");

        for (int i = 0; i < email.length(); i++) {//conrtador, lo que cuenta es el numero de letras que tiene el email y repite el bucle tantas veces como letras tenga el email.

            if (email.charAt(i) == '@') {//busca el caracter selecionado

                arroba++;

            }

            if (email.charAt(i) == '.') {//busca otro caracter.

                punto = true;

            }

        }

        if (arroba == 1 && punto == true) { //comprueba si cumple las dos condiciones anteriores.

            System.out.println("CORRECTRO");//imprime este texto si cumple las dos condiciones anteriores.

        } else {
            System.out.println("INCORRECTO, vuelva a introducirla");//imprime este otro si alguna de las condiciones anteriores no se cumplo o las dos.
        }

    }

}
