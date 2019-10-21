/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manual;

/**
 *
 * @author david
 */
public class Ejemplo_String_Objeto_III {
    
     public static void main(String[] args) {
         
         String alumno1, alumno2,alumno3,alumno4;
         
         alumno1="david";
         alumno2="David";
         alumno3="Ernesto";
         alumno4="Carolina";
         
         System.out.println(alumno1.equals(alumno2));//es un metodo que nos permite comparar variable y ver si son iguales. devuelve true si coinciden y false si no coinciden
         System.out.println(alumno1.equalsIgnoreCase(alumno2)); // la diferebcia de este metodo con el anterior es que no diferencia entre mayusculas o minusculas.
         System.out.println(alumno1.equals(alumno3));
         System.out.println(alumno3.equalsIgnoreCase(alumno4));
         
         
         
         
     }
    
    
}
