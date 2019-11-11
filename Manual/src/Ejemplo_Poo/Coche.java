/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Poo;

import javax.swing.SpringLayout;

/**
 *
 * @author david
 */
public class Coche {

    private boolean climatizador, navegador;
    private String color;
    private int ruedas, peso_chasis, largo, ancho, motor, peso_total;//al poner private estamos encapsulando las variables.
    // Lo que hace es que solo accediendo a la clase puedes modificar las variavles. ej. seat.setRuedas(3);

    public Coche(String color, int ruedas, int peso, int largo, int ancho, int motor) {
        this.color = color;
        this.ruedas = ruedas;
        this.peso_chasis = peso;
        this.largo = largo;
        this.ancho = ancho;
        this.motor = motor;
    }

    public Coche() {

        color = "rojo";
        ruedas = 4;
        peso_chasis = 1500;
        ancho = 1200;
        largo = 4000;
        motor = 2000;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPeso() {
        return peso_chasis;
    }

    public void setPeso(int peso) {
        this.peso_chasis = peso;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public void visualizacion() {

        System.out.println("Ruedas = " + ruedas + "\nPeso= " + peso_chasis + "\nancho= " + ancho + "\nlargo= " + largo + "\nmotor= " + motor+"\nColor= "+color);
        //Esto y lo siguiente sirve para lo mismo, cambia la forma de llamarlo y espresarlo.

    }

    public String visualizacion2() {

        return "Ruedas = " + ruedas + "\nPeso= " + peso_chasis + "\nancho= " + ancho + "\nlargo= " + largo + "\nmotor= " + motor+"\nColor= "+color;

    }

    public String dar_motor() {

        return "" + motor;
    }

    public void setClimatizador(String dato_navegador) {

        if (dato_navegador.equalsIgnoreCase("si") || dato_navegador.equalsIgnoreCase("s") || dato_navegador.equalsIgnoreCase("yes") || dato_navegador.equalsIgnoreCase("y")) {

            this.climatizador = true;

        } else {
            this.climatizador = false;

        }

    }

    public String getClimatizador() {

        if (climatizador == true) {
            return "El coche dispone de climatizador";
        } else {

            return "El coche dispone de aire acondicionado";
        }

    }

    public void setNavegador(String dato_navegador) {

        if (dato_navegador.equalsIgnoreCase("si") || dato_navegador.equalsIgnoreCase("s") || dato_navegador.equalsIgnoreCase("yes") || dato_navegador.equalsIgnoreCase("y")) {

            this.navegador = true;

        } else {
            this.navegador = false;

        }

    }

    public String getNavegador() {
        if (navegador == true) {
            return "El coche dispone de navegador ";

        } else {
            return "El coche no dispone de navegador";
        }
    }

    public String set_get_peso() { //Esto es un setter y un getter en el mismo metodo, no es muy recomendable usarlo.
        int peso_habitaculo = 500;
        peso_total = peso_chasis + peso_habitaculo;
        if (climatizador == true) {
            peso_total += 50;

        }
        if (navegador == true) {
            peso_total += 30;

        }

        return "El peso del coche es : " + peso_total;

    }
    
    
    public void precio(){
        int precio=12000;
        
        if(climatizador==true){
            precio+=3500;
            
              
            
        }
        if(navegador==true){
            precio=precio+1500;
            
        }
        
     System.out.println("PVP = "+precio);
       
    }
    
}

