/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manual;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejemplo_condicional_If_Else {
    
    
    
      public static void main(String[] args) {
        
        
        Scanner entrada1 = new Scanner(System.in);
        
        System.out.println("Introduce nota, gracias");
        
        int nota=entrada1.nextInt();
        
        if (nota>5){
            System.out.println("Asignatura probada, bien echo.");
                  
            
        }
        
        else{
            
            System.out.println(" Esfuerzate mas, SUSPENSO");
            
        }
        
        
        
    
    
    }
}

    

