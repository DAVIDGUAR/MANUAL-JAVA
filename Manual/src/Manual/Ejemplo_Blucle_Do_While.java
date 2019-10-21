package Manual;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Ejemplo_Blucle_Do_While {

    public static void main(String[] args) {

        int n_aleatorio = (int) (Math.random() * 100);

        int numero = 0;

        int intentos = 0;

        do { //Se utiliza este  metodo, porque en el caso anterior del while, si por algun casual el numero a elegir fuera 0 no nos dejaria jugar.
            //Ya que lo iniciamos como 0 y el programa acertaria automaticamente el numero.

            intentos++;

            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

            if (numero < n_aleatorio) {

                System.out.println("El numero introducido es mas pequeño quel que buscas");

            } else if (numero > n_aleatorio) {

                System.out.println("El numero selecionado es mas grande quel que buscas ");

            }

        } while (numero != n_aleatorio);

        System.out.println("Correcto, lo as conseguido en : " + intentos + " intentos.");

        System.out.println("Ahora puedes saber tu peso ideal.");

        String genero = "";

        do {

            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M).");

        } while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm."));
        
        int peso_ideal = 0;
        
        if (genero.equalsIgnoreCase("h")){
            
            peso_ideal=altura-110;
            
            System.out.println("Tu peso ideal es : "+peso_ideal+" kg.");
            
        } else if (genero.equalsIgnoreCase("m")){
            
            peso_ideal=altura-120;
            
            System.out.println("Tu peso ideal es : "+peso_ideal+" kg.");
            
        }
        

    }
}
