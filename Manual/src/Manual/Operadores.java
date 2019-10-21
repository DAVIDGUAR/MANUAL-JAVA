package Manual;

/**
 *
 * @author david
 */
public class Operadores {

    public static void main(String[] args) {

        int a = 2;

        int b = 34;

        int c = a + b;

        System.out.println("valor de c= " + c);

        c++;  // incrementa +1 el volor de c.

        System.out.println("valor de c= "+ c);

        c += 2;   // incrementa +2, pero con el nuevo valor de c.

        System.out.println("valor de c= " + (c+=c)); // incrementa en +cm, pero con el nuevo valor de c.
        

        System.out.println("valor de c= "+ c);
        
        c=12; // le doi el valor a c de 12, porque vuelvo a inicializarla,  lo que anulo los resultados anteriores dandole el valor indicado o deseado.
        
        System.out.println("valor de c= "+ c);

        double d = 2;

        double e = 5;

        double f = d / e;

        System.out.println("resultado operadores double/double= resultado declarado double = " + f);

        int aa = 2;

        int bb = 5;

        int cc = aa / bb;

        double ccc = aa / bb;

        System.out.println("primer resultado operadores int/int= resultado declarado int = " + cc + "\nsegundo resultado operadores int/int= resultado declarado double = " + ccc);
      //ejemplo mal echor o resultados inesactos
        
        
        System.out.println("utilizacion de contante final");
        
         final double conversor=1.60934; // final sirve para declarar variables e instanciarlas con un valor que no se podran cambiar el resto del programa.
        
        double millas = 100;
        
        double resultado=conversor * millas;
        
        System.out.println("en "+ millas + " millas hay " + resultado + " km");
        
   
        
    }

}
