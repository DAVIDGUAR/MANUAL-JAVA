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
public class Furgoneta1 extends Vehiculo{
    
    
    private int capacidad_carga,plaza_extras,puertas;

    public Furgoneta1(int capacidad_carga, int plaza_extras) {
        
        super();                                   //llama al constructor de la clase coche.
        this.capacidad_carga = capacidad_carga;
        this.plaza_extras = plaza_extras;
        this.puertas=puertas;
        
        
    }

    public Furgoneta1(int capacidad_carga, int plaza_extras, int puertas, String marca, String modelo, String color, int motor, int peso_chasis, int ruedas, int plazas) {
        super(marca, modelo, color, motor, peso_chasis, ruedas, plazas);
        this.capacidad_carga = capacidad_carga;
        this.plaza_extras = plaza_extras;
        this.puertas = puertas;
    }
    
   
    

   
    public String toStringFurgoneta() {
        return  "Capacidad_carga=" + capacidad_carga + "\nPlaza_extras=" + plaza_extras ;
    }

    
}
