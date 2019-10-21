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
public class Calculo_Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       double base, altura, radio;

        System.out.println("Calcular area de :\n 1. Cuadrado. \n 2. Rectangulo. \n 3. Triangulo.\n 4. Circulo.");

        String entrada1 = JOptionPane.showInputDialog("ELIGE UNA OPCION");
        int dato1 = Integer.parseInt(entrada1);

        switch (dato1) {

            case 1:

                base = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor LADO"));

                System.out.println("El area es: " + base * base);
                
                System.out.println("El area es: " + Math.pow(base, 2));

                break;

            case 2:

                base = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor BASE"));

                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor ALTURA"));

                System.out.println("El area es: " + base * altura);

                break;
            case 3:

                base = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor BASE"));

                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor ALTURA"));

                System.out.println("El area es: " + base * altura / 2);

                break;

            case 4:
                
                radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor RADIO"));
                
                
                System.out.println("El area es: " + Math.PI*(Math.pow(radio, 2)));
                
                System.out.printf("Redondeo = " + "%1.4f",Math.PI*(radio*radio));

                break;
                
                

        }

    }

}
