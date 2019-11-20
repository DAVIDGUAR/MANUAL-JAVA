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
class Direccion extends Jefatura{

    public Direccion(String nombre, double sueldo, int anho, int mes, int dia) {
        super(nombre, sueldo, anho, mes, dia);
    }
    
     public void subir_sueldo_direcion(double dirin) {

        beneficios = dirin;

    }
    
    
    public double getSueldo(){
        
        double sueldo_direcion = super.getSueldo();
        
        return sueldo_direcion + beneficios;
        
        
    }
    
    
    private double beneficios;
    
}
