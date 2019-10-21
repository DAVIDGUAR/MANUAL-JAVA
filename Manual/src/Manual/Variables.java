package Manual;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author david
 */
public class Variables {

    public static void main(String[] args) {

        byte edad = 35; // declaracion de variable, instanciandola, osea dandole un valor.

        int edadd = 35; //lo mismo que el anterior, pero ocupando menos ,memoria.

        double edaddd = 35.05;

        float edadddd = (int) 35.055555; //castear, forzar a un numero declarado como decimal a que pase a numero entero. de float a int.

        System.out.println(edad);
        System.out.println(edadd);
        System.out.println(edaddd);
        System.out.println(edadddd);

        // diferentes formad de declarar variables
        int a, b, c; // declarqcion de variables al mismo tiempo, sin asignacion de valor, osea sin instanciar.

        a = 35;
        b = 40;
        c = a-b;  //  instancia de variable mediante una operacion de variables.

        float d = 3F;  //declaracion de variable, instanciandola, osea dandole un valor.

    }

}
