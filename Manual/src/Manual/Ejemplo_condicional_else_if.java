package Manual;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Ejemplo_condicional_else_if {

    public static void main(String[] args) {

        String entrada = JOptionPane.showInputDialog("Intruduce el mes que naciste, gracias. ");

        int mes = Integer.parseInt(entrada);

        String entrada2 = JOptionPane.showInputDialog("Intruduce el dia que naciste, gracias. ");

        int dia = Integer.parseInt(entrada2);

        if (dia <= 0) {    // comprovamos que nadie meta un dato erroneo (0,numeros negativos)

            System.out.println("DATO ERRONEO"); 

        } else if (dia >= 32) {   // comprovamos que nadie meta un dato erroneo (numeros superiores a 32)

            System.out.println("DATO ERRONEO");

        } else if (mes < 2) {//mes 1

            if (dia > 20) {//comprovacion, dia que pasa de un signo a otro 

                System.out.println("acuario");//si la cumple imprime este mensaje
            } else {
                System.out.println("capricornio");//sino cumple la condicion anterior, imprime este otro mensaje

            }

        } else if (mes < 3) {

            if (dia >= 30) {//sirve para comprovar que febrero no meten un numero por encima de 29,ya que antes solo hemos limitado numeros superiores a 32.

                System.out.println("DATO ERRONEO");

            } else if (dia >= 19) {

                System.out.println("piscis");
            } else {

                System.out.println("acuario");

            }

        } else if (mes < 4) {

            if (dia >= 21) {

                System.out.println("aries");
            } else {

                System.out.println("piscis");

            }

        } else if (mes < 5) {

            if (dia >= 31) {//sirve para comprovar que los meses de 30 dias, no meten un numero por encima de 30,ya que antes solo hemos limitado numeros superiores a 32.

                System.out.println("DATO ERRONEO");

            } else if (dia >= 21) {

                System.out.println("tauro");
            } else {

                System.out.println("aries");

            }

        } else if (mes < 6) {

            if (dia >= 21) {

                System.out.println("geminis");
            } else {

                System.out.println("tauro");

            }
        } else if (mes < 7) {

            if (dia >= 31) {

                System.out.println("DATO ERRONEO");

            } else if (dia >= 21) {

                System.out.println("cancer");
            } else {

                System.out.println("geminis");

            }

        } else if (mes < 8) {

            if (dia >= 23) {

                System.out.println("leo");
            } else {

                System.out.println("cancer");

            }
        } else if (mes < 9) {

            if (dia >= 24) {

                System.out.println("virgo");
            } else {

                System.out.println("leo");

            }

        } else if (mes < 10) {

            if (dia >= 31) {

                System.out.println("DATO ERRONEO");

            } else if (dia >= 24) {

                System.out.println("libra");
            } else {

                System.out.println("virgo");

            }

        } else if (mes < 11) {

            if (dia >= 23) {

                System.out.println("escorpio");
            } else {

                System.out.println("libra");

            }

        } else if (mes < 12) {

            if (dia >= 31) {

                System.out.println("DATO ERRONEO");

            } else if (dia >= 23) {

                System.out.println("sagitario");
            } else {

                System.out.println("escorpio");

            }
        } else if (mes < 13) {

            if (dia >= 21) {

                System.out.println("capricornio");
            } else {

                System.out.println("sagitario");

            }
        } else if (mes >= 13) {//sirve para comprovar si meten el numero de un mes que no existe.

            System.out.println("DATO ERRONEO");

        }
    }
}
