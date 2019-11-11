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
public class Ejemplo_Static_Final {

    public static void main(String[] args) {

        Empleado trabajador1 = new Empleado("Paco", 35);
        Empleado trabajador2 = new Empleado("Maria", 50);
        Empleado trabajador3 = new Empleado("Benito", 25);

        System.out.println(trabajador1.toString());

      //  Empleado.numero_empleado++;// tendria que ir poniendo cada vez que visiualizara un empleado, osea tendras que repetirlo constantemente;
        System.out.println(trabajador2.toString());
        // Empleado.numero_empleado++;
        System.out.println(trabajador3.toString());
        trabajador1.setPuesto("Encargado");
        System.out.println(trabajador1.toString());
        trabajador3.setPuesto("RRHH");
        System.out.println(trabajador3.toString());
         // trabajador1.setNombre("Juan");//PARA EVITAR PODER CAMBIAR EL NOMBRE DEL EMPLEADO UNA VES ESTABLECIDO SE DECLARA LA VARIABLE COMO FINAL;

        //USO DEL METODO STATIC
        
        System.out.println(Empleado.numero_ref_empleado());
        
        
    }

}

class Empleado {

    private final String nombre;//ESTA VARIABLE NO PUEDE SER MODIFICADA UNA VEZ ASIGNADA MEDIANTE EL CONTRUCTOR;
    private int edad;
    private String puesto;
        // public static int numero_empleado=1;//tendria que ir poniendo cada vez que visiualizara un empleado, osea tendras que repetirlo constantemente;  Empleado.numero_empleado++;
    private  int numero_empleado = 1;
    private static int ref=1;

    public Empleado(String nombre, int edad/*,int ref*/) {//AL DECLARAR LA VARIAVLE COMO CONSTANTE DE CLASE
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = "Mozo almacen";
        //numero_empleado=ref;          AL PONER LA VARIABLE COMO CONSTANTE DE CLASE (STATIC) NO 
        
        numero_empleado = ref;
        ref++;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    /*  public void setNombre(String nombre) {           NO PODEMOS CAMBIAR EL NOMBRE DEL EMPLEADO UNA VEZ SEA CREADO YA QUE LA TENEMOS DECLARADO COMO FINAL, 
     SOLO SE PUEDE ASIGNAR EL NOMBRE AL INICIO,AL CREARLO(MEDIANTE EL CONSTRUCTOR).
     this.nombre = nombre;
     }*/
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", puesto=" + puesto + ", numero_empleado=" + numero_empleado + '}';
    }
    
    
    public static String numero_ref_empleado(){
        
       return "El numero de empleado siguiente sera : "+ref; 
    } 

}
