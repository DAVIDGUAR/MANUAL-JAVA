/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manual;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Calculos_Math {
   

    public static void main(String[] args) {

        System.out.println("redondeo raiz");

        // la clase Math tiene multitud de operaciones propias, por ejemplo la siguiente es la raiz cuadrada de un numero.
        double raiz = Math.sqrt(8); // int raiz daria un error, te devuelve un double asi que tienes que declarar la variable como double.

        System.out.println(raiz);

        long resultado = Math.round(raiz); //redondea el resultado de la raiz. la variable raiz eta declarada como double asi que lo que me devuelve es un long,
        //lo que me lleba a declarar la variable resultado como long.
        int resultado1 = (int) Math.round(raiz);//la diferencia esta en que este metodo devuelve un long y lo estoy convertirlo en un entero. osea casteando o refundicion.

        System.out.println(resultado);

        
        System.out.println(resultado1);

        // metodo de la clase Math, ROUND= redondeo
        System.out.println("CALCULO DE REDONDEO DE NUMERO");
        float a = 5.85F;

        float b = 9.85F;

        
        float c = 5.45F;

        int resultadoa = Math.round(a); // la diferencia esta en que este metodo devuelve un INT,  ya que  e declarado las variables como float.
        int resultadob = Math.round(b);
        int resultadoc = Math.round(c);

        System.out.println(resultadoa);

        System.out.println(resultadob);

        System.out.println(resultadoc);

        System.out.println("el numero era " + a + " y el redondeo es = " + resultadoa + "\nel numero era " + b + " y el redondeo es = " + resultadob + "\nel numero era " + c + " y el redondeo es = " + resultadoc);

        System.out.println("CALCULO NUMERO CON EXPONENTE");

        double base = 55.55;

        double exponente = 2;

        double resultado2 = Math.pow(base, exponente);
        
        int resultado3 = (int)Math.pow(base, exponente);//CASTEO UN DATO DECIMAL EN UN NUMERO ENTERO

        System.out.println("el numero " + base + " con exponente " + exponente + " es = " + resultado2);
        
        

        System.out.println("resultado casteado a un entero = "+resultado3);
        
        
            System.out.println("CALCULO RAIZ CUADRADA, CON REDONDEO Y LIMITANDO DECIMALES");
        
        
        String entrada3=JOptionPane.showInputDialog("introduce el numero, para hayar la raiz cuadrada");
        
        
        double dato=Double.parseDouble(entrada3);
        
        double raiz2=Math.sqrt(dato);
        
        
        System.out.println("la rair cuadrada de "+ entrada3 + " es :\n" + raiz2);//nos muestra la raiz cuadrada, con todo s los decimales.
        
        
        
        System.out.printf("%1.4f\n",raiz2);//nos da la raiz, con 4 decimales.
        
        
        System.out.printf("%1.2f\n",Math.sqrt(dato));//nos da la raiz cuadrada, pero con 2 decimales, ademas de redondear.
        
        System.out.println("FIN");
        
    }

}
