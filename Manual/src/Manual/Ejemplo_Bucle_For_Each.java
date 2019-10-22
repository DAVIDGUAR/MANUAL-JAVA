/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manual;

/**
 *
 * @author david
 */
public class Ejemplo_Bucle_For_Each {
    
    
    public static void main(String[] args) {
        
        
        
     /*   String [] paises = new String[8];
        
        paises[0]="España";
        paises[1]="Francia";
        paises[2]="Suiza";
        paises[3]="Usa";
        paises[4]="India";
        paises[5]="Japon";
        paises[6]="Australia";
        paises[7]="Egipto";
       
    
    
    
    for (int i=0; i < paises.length; i++){//bucle for normal
        
        
        System.out.println("Pais  "+(i+1)+" = "+ paises[i]);
    
    
    
}
    int  vueltas_bucle=0;
        
        for (String a:paises){    //bucle for each
            
          
          vueltas_bucle++;
          
            System.out.println("Pais "+ vueltas_bucle +" "+a);
            
        }
        
       */
        
        int [] aleatorio=new int[150];
        
        for (int i=0;i<aleatorio.length;i++){
            
            aleatorio[i]=(int)Math.round(Math.random()*100);
            
        }
        
        for (int a:aleatorio){ 
            
            System.out.print(a +" ");
            
        }
}
}