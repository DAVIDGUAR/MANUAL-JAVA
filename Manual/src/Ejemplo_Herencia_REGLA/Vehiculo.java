/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Herencia_REGLA;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Vehiculo {
    private String marca,modelo,color;
    private int motor,peso_chasis,ruedas,plazas;

    public Vehiculo(String marca,String modelo, String color, int motor, int peso_chasis, int ruedas, int plazas) {
        this.marca = marca;
        this.modelo= modelo;
        this.color = color;
        this.motor = motor;
        this.peso_chasis = peso_chasis;
        this.ruedas = ruedas;
        this.plazas = plazas;
    }

    public Vehiculo() {
        
        
        
        
        
  
    }
    
    public void rellenar(){
        
        this.marca = JOptionPane.showInputDialog("Introduce marca");
        this.modelo= JOptionPane.showInputDialog("Introduce modelo");
        this.color = JOptionPane.showInputDialog("Introduce color");
        this.motor = Integer.parseInt(JOptionPane.showInputDialog("Introduce motor"));
        this.peso_chasis = Integer.parseInt(JOptionPane.showInputDialog("Introduce peso chasis"));
        this.ruedas = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de ruedas"));
        this.plazas = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de plazas"));
        
        
        
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPeso_chasis() {
        return peso_chasis;
    }

    public void setPeso_chasis(int peso_chasis) {
        this.peso_chasis = peso_chasis;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor + ", peso_chasis=" + peso_chasis + ", ruedas=" + ruedas + ", plazas=" + plazas + '}';
    }
    
    
}
