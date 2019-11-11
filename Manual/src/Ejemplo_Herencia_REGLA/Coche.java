/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Herencia_REGLA;

/**
 *
 * @author david
 */
public class Coche extends Vehiculo {
    
    private String clase;
    private int puertas;

    public Coche(String clase, int puertas) {
        super();
        this.clase = clase;
        this.puertas = puertas;
    }

   
    public String toStringcoche() {
        return "Coche{" + "clase=" + clase + ", puertas=" + puertas + '}';
    }
    
    
    
    
    
    
}
