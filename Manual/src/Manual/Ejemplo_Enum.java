
package Manual;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Ejemplo_Enum {
    
    //  enum Talla{Mini,Pequeña,Mediana,Grande,Muy_grande,Super_grande};
    
  
  
    
    enum Talla{
        
      
        
        MINI("xs"),PEQUEÑA("s"),MEDIANA("m"),GRANDE("l"),MUY_GRANDE("xl"),SUPER_GRANDE("xxl");
        
        private Talla(String abreviatura_talla){
            
            this.abreviatura=abreviatura_talla;
            
            
            
        }

        public String getAbreviatura(){
            
            return abreviatura;
            
            
            
        }
            private String abreviatura;
        
        
    }
   
    
    
    public static void main(String[] args){
        
        
        Scanner entrada1=new Scanner(System.in);
        
        System.out.println("Elige talla: Mini,Pequeña,Mediana,Grande,Muy_grande,Super_grande");
        
        String a=entrada1.next().toUpperCase(); // toUpperCase()= pasa todo a mayusculas;
        
        Talla la_Talla=Enum.valueOf(Talla.class,a);
        
        
        
        System.out.println("Talla = "+la_Talla);
        
        System.out.println("Abreviatura = " +la_Talla.getAbreviatura());
        
    }
    
    
    
    
    
}
