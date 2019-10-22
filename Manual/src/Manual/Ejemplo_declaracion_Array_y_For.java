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
public class Ejemplo_declaracion_Array_y_For {

    public static void main(String[] args) {

        /*int []  array_declaracion1= new int[10];
        
         int array_declaracion[]=new int[10;] seria lo mismo que la declaracion de arriba.
        
         array_declaracion1[0]=15;
         array_declaracion1[1]=-5;
         array_declaracion1[2]=55;
         array_declaracion1[3]=85;
         array_declaracion1[4]=19;
         array_declaracion1[5]=23;
         array_declaracion1[6]=-44;
         array_declaracion1[7]=0;
         array_declaracion1[8]=15;
         array_declaracion1[9]=5;
        
         // int[] array_declaracion={15,-5,55,85,19,23,-44,0,15,5}  Esta seria otra forma de declarar e iniciar el array o matriz o arreglo
        
       
 
         System.out.println(array_declaracion1[0]);
         System.out.println(array_declaracion1[1]);
         System.out.println(array_declaracion1[2]);
         System.out.println(array_declaracion1[3]);
         System.out.println(array_declaracion1[4]);
         System.out.println(array_declaracion1[5]);
         System.out.println(array_declaracion1[6]);
         System.out.println(array_declaracion1[7]);
         System.out.println(array_declaracion1[8]);
         System.out.println(array_declaracion1[9]);
        
         for (int i=0;i<array_declaracion1.length;i++){
            
         System.out.println("Las posicion " + (i+1) + " = " + array_declaracion1[i]);
            
         }
        
         */
        
        
        
        String[] array_declaracion1 = new String[10];//otra forma de rellenar un arrays

        for (int i = 0; i < 10; i++) {

            array_declaracion1[i] = JOptionPane.showInputDialog("Introduce pais " + (i + 1));

            
            
             System.out.println(array_declaracion1[i]);
             
             
        }
        
       

    }
    
}
