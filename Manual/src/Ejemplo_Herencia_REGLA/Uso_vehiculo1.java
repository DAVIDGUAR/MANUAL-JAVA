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
public class Uso_vehiculo1 {
    
    public static void main(String[] args) {
        
       Coche coche1 = new Coche("deportivo",3);
       Furgoneta1 furgoneta1 =new Furgoneta1(500, 3);
        Moto moto1 = new Moto("chooper");
       // moto1.rellenar();
        Moto moto2 = new Moto("Deportiva","HONDA", "CBR","Amarilla" ,1300, 250, 2,1);
        
        //System.out.println(moto1.toString()+"\n"+moto1.toStringMoto());
        System.out.println(moto2.toString()+"\n"+moto2.toStringMoto());
        
        
    }
    
    
}
