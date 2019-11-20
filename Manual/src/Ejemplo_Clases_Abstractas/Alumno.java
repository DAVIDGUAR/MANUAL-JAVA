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
public class Alumno extends Persona{
    
    
    private String carrera;

    public Alumno( String nom,String carrera) {
        super(nom);
        this.carrera = carrera;
    }


     public  String dameDescripcion(){
         
         return "Este alumno estudia " + carrera;
         
         
     }
    
    
}
