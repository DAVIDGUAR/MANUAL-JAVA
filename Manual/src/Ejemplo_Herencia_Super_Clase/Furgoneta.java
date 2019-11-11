/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Herencia_Super_Clase;

/**
 *
 * @author david
 */
public class Furgoneta extends Coche1 {
    
    private int capacidad_carga,plaza_extras;

    public Furgoneta(int capacidad_carga, int plaza_extras) {
        
        super();                                   //llama al constructor de la clase coche.
        this.capacidad_carga = capacidad_carga;
        this.plaza_extras = plaza_extras;
        
        
        
    }
    
    
    public void visualizacionFurgoneta(){
        
        
        
    }
    

    @Override
    public String toString() {
        return  "Capacidad_carga=" + capacidad_carga + "\nPlaza_extras=" + plaza_extras ;
    }

 
    
    
    
    
    
    
}
