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
public class  Jefatura extends Empleado {

    public Jefatura(String nom, double sueldo, int anho, int mes, int dia) {
        super(nom, sueldo, anho, mes, dia);
    }
    
      public void subir_sueldo_jefarura(double in) {

        incentivo = in;

    }

    public double getSueldo() {
        double sueldo_jefatura = super.getSueldo();       //este metodo llama al metodo con el mismo nombre que en la clase empleado

        return sueldo_jefatura + incentivo;
    }
    
    
    double incentivo;
    
}
