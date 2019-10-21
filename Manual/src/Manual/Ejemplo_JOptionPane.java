
package Manual;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Ejemplo_JOptionPane {
    
    
    
    public static void main(String[] args) {
        
        String entrada_nombre = JOptionPane.showInputDialog("Introduce tu nombre ");
        
            String entrada_dia = JOptionPane.showInputDialog("Introduce dia que nacistes ");
            
            String entrada_mes = JOptionPane.showInputDialog("Introduce mes que nacistes ");
            
           // String entrada_año = JOptionPane.showInputDialog("Introduce año actual ");
            
            int dia, mes,año,resultado_dia,resultado_mes,resultado_a,resultado_año;
            
            dia = Integer.parseInt(entrada_dia);
            mes = Integer.parseInt(entrada_mes);
             //año = Integer.parseInt(entrada_año);       
             
           
            
            
             resultado_dia=dia-7; //para hacerlo automatico abri que conseguir que el 7 cambiara con el dia de la fecha actual
             resultado_mes=mes-10;//lo mismo que lo anterior, pero cogiendo el mes actual.
             
            // resultado_a=(año-2019);
            // resultado_año=resultado_a-año;
            
              if(resultado_mes<=0){
                  
                System.out.println(" Buenas "+entrada_nombre+ ", te quedan " + resultado_dia + " dia/s y "+ (resultado_mes+12) + " mes/es. "  );  
              }   
              else 
             
             
        
        System.out.println(" Buenas "+entrada_nombre+ ", te quedan " + resultado_dia+ "dia/s "+ resultado_mes+ ", mes/es. "  );
        
              }
    }
    
