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
public class Ejemplo_String_Objeto_II {
    
     public static void main(String[] args) {
         
         
         String frase= "Hoy vamos a comer huevos con patatas ";
         
         String frase_modificada=frase.substring(0,17) + " ostias" ; // EL METODO substring(inicio,final) resume el texto selecionado marcandole los parametros de inicio y final de la frase que queremos resumir.
         
         
         System.out.println("La frase completa : " + frase);
         
         System.out.println("La frese modificada seria : " + frase_modificada);
         
         System.out.println("La frese modificada seria : " + frase_modificada + " o " + frase.substring(18, 36));
         
         
         
         
         
     }
    
    
    
    
    
}
