/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_objeto;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Uso_coche {
    
    
    
      public static void main(String[] args) {
          
          Coche seat = new Coche();     //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE.
          Coche audi = new Coche("negro",  4,  2000,  5,  3, 3000);
          //System.out.println("El coche tiene "+seat.ruedas+ " ruedas."); No se puede hacer hay que hacerlo de la forma siguente, ya que la variable esta encapsulado como private.
          System.out.println("El coche tiene = "+seat.getRuedas());
         
          
          seat.setRuedas(5);
          System.out.println("SEAT");
          seat.visualizacion();
          System.out.println("SEAT\n"+seat.visualizacion2());
          System.out.println("AUDI");audi.visualizacion();
         seat.dar_motor();//no hace nada
          System.out.println("Potencia motor= "+audi.dar_motor()+"c.c.");
          seat.setClimatizador(JOptionPane.showInputDialog("tu coche tiene climatizador??"));
          //seat.setClimatizador("no");
          System.out.println("Climatizador = "+seat.getClimatizador());
          
          seat.setNavegador("yes");
          System.out.println("Navegador = "+seat.getNavegador());
          
          System.out.println(seat.set_get_peso());
          
          System.out.println("SEAT ");
          seat.precio();
          System.out.print("AUDI ");
          audi.precio();
          
          
      }
    
}
