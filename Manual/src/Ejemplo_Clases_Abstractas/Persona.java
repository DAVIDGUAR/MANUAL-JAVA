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
abstract public class Persona {
    
    
    private String nombre;

    public Persona(String nom) {
        this.nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract String dameDescripcion();
        
        
        
    
    
    
}
