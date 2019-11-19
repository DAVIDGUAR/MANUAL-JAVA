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
public class Ejemplo_declaracion_Arrays_bidimensionales {

    public static void main(String[] args) {

         int [][] numeros=new int[2][5];
        
        
         numeros[0][0]=2;
         numeros[0][1]=5;
         numeros[0][2]=25;
         numeros[0][3]=463;
         numeros[0][4]=-4635;
        
         numeros[1][0]=8;
         numeros[1][1]=9;
         numeros[1][2]=10;
         numeros[1][3]=11;
         numeros[1][4]=12;
        
       //  System.out.println(numeros[1][3]);
          for (int[] n:numeros){
        
        for(int na:n){
        
        System.out.print(na + " ");
            
        
        } System.out.println("\n");
          }
        
        
       
       /*  for (int i=0;i<2;i++){      //bucle for, normal
             
         for (int j=0;j<5;j++){
                   
         System.out.println(numeros[i][j]);
         }
             
         
       /* int[][] numeros = {
            {10, 15, 26, 38, 88}, {20, 88, 96, 74, 21}};

        for (int i = 0; i < 2; i++) {      //bucle for, normal
            System.out.println();
            for (int j = 0; j < 5; j++) {

                System.out.print(numeros[i][j] + " ");
            }

        }
        
        
        
        for (int[] n:numeros){
            
        System.out.println();
        
        for(int na:n){
        
        System.out.print(na + " ");

    }*/
}

        
    }


