/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Clases_Abstractas;

/**
 *
 * @author david
 */
public class Uso_Persona {
    
     public static void main(String[] args) {
         
         
            Persona[] las_personas= new Persona[5];
         
         las_personas [0]=new Empleado("Maria", 1200, 2000,11, 2);
         las_personas [1]=new Alumno("David", "Programcion");
         las_personas [2]=new Empleado("Juan", 1200, 2000,11, 2);
         las_personas [3]=new Jefatura("Marta", 1500, 2000,11, 2);
         las_personas [4]=new Direccion("Marcos", 1800, 2000,11, 2);
         
         
         
         for (Persona e:las_personas){
             
             
             System.out.println("Nombre = "+e.getNombre()+" , "+e.dameDescripcion());
             
             
         }
         
         
         
         
         
     }
    
    
    
    
}
