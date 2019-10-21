package Manual;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejemplo_Scanner {

    public static void main(String[] args) {

        Scanner entrada_nombre = new Scanner(System.in); // sirve para introducir datos por consola
        
        Scanner entrada_edad = new Scanner(System.in);

        System.out.println("Introduce tu nombre ");
        
        //System.out.println("Introduce tu edad "); // si lo ponemos en esta posicion el dato del nombre y la edad los pide seguido, sin separar las preguntas.

        String nombre = entrada_nombre.nextLine();
        
         System.out.println("Introduce la edad que tendras en el 2019 ");
        
        int edad = entrada_edad.nextInt();
        
        int fecha = 2019-edad;
        
        System.out.println("Resultado: ");

        System.out.println("Tu nombre tiene "+nombre.length()+ " letras, el año 2020 cumpriras " + (edad+1) + " años y nacistes en el año " + fecha + " .");
        
        
        

    }

}
