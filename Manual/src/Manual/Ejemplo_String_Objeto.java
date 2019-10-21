
package Manual;

/**
 *
 * @author david
 */
public class Ejemplo_String_Objeto {
    
    
    public static void main(String[] args) {
        
        String nombre="David"; // Este es mi primer objeto(nombre), mediante la declaracion de variable de tipo String.
        
        int letra_final=nombre.length(); // Declaracion de variable,  instanciar la variable con  la cuenta del numero de letras de la variable String antes declarada.
        
        System.out.println("Mi nombre es "+nombre);
        
        System.out.println("Mi nombre tiene "+ nombre.length()+ " letras."); // Metodo length, lo que hace es contar el numero de caracteres que tiene la variable que le hemos selecionado.
        
        System.out.println("La primera letra del nombre es: "+ nombre.charAt(0)); // El metodo charAt nos muestra el caracter que le indicamos segun el numero que pongamos en el parentesis.
        
        System.out.println("La primera letra del nombre es: "+ nombre.charAt(3)); // El metodo empieza a contar dsesde 0,1,2,3,etc
        
        System.out.println("La ultima letra del nombre es: "+ nombre.charAt(4)); // Porque se el numero de letras que tiene el nombre
        
        System.out.println("La ultima letra del nombre es: "+ nombre.charAt(letra_final-1));  // Si no saves el numero de letras, tendrias que cuntarlas, iniciar una variable con esa cuenta y despues indicar la variable con la resta -1.
        
    }
    
    
}
