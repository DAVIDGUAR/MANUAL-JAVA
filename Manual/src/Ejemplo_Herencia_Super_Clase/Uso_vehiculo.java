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
public class Uso_vehiculo {
    
     public static void main(String[] args) {
    Furgoneta vehiculo1 = new Furgoneta(500, 3);
    Coche1 vehiculo2 = new Coche1();
    Coche1 vehiculo3 = new Coche1();
    
    
    vehiculo2.setColor("blanco");
    vehiculo1.setColor("negro");
    vehiculo1.setClimatizador("si");
    vehiculo1.setNavegador("no");
    vehiculo2.setClimatizador("si");
    
         System.out.println("vehiculo2 : \n"+ vehiculo2.visualizacion2());
          System.out.println("vehiculo3 : \n"+ vehiculo3.visualizacion2());
    System.out.println( "vehiculo1 : \n"+vehiculo1.visualizacion2()+"\n"+ vehiculo1.toString());
     } 
}
