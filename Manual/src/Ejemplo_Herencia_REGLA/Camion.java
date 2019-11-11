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
public class Camion extends Vehiculo{
    
    private boolean cabezatractora;
    private int carga,puertas;

    public Camion(boolean cabezatractora, int carga) {
        super();
        this.cabezatractora = cabezatractora;
        this.carga = carga;
        this.puertas=puertas;
    }

    public Camion(boolean cabezatractora, int carga, int puertas, String marca, String modelo, String color, int motor, int peso_chasis, int ruedas, int plazas) {
        super(marca, modelo, color, motor, peso_chasis, ruedas, plazas);
        this.cabezatractora = cabezatractora;
        this.carga = carga;
        this.puertas = puertas;
    }
    
    
    
}
