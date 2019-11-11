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
public class Moto extends Vehiculo {
    
    private String tipo; 

    public Moto(String tipo) {
        super();
        this.tipo = tipo;
    }

    public Moto(String tipo, String marca, String modelo, String color, int motor, int peso_chasis, int ruedas, int plazas) {
        super(marca, modelo, color, motor, peso_chasis, ruedas, plazas);
        this.tipo = tipo;
    }
    
    
    
    

 
    public String toStringMoto() {
        return "Moto{" + "tipo=" + tipo + '}';
    }



   
}
