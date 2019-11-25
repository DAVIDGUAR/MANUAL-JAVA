/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manual;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author david
 */
public class Ejemplo_Interfaz {

    public static void main(String[] args) {

        Jefatura2 jefe_RRHH = new Jefatura2("Vicente", 5000, 1980, 01, 10);
        jefe_RRHH.subir_sueldo_jefarura(500);

       
        Empleado4[] mis_empleados = new Empleado4[7];
        mis_empleados[0] = new Empleado4("David", 1000, 2009, 9, 22);
        mis_empleados[1] = new Empleado4("Maria", 1500, 2000, 12, 2);
        mis_empleados[2] = new Empleado4("Daniel", 1200, 2018, 12, 06);
        mis_empleados[4] = jefe_RRHH;    
        mis_empleados[3] = new Empleado4("Juan", 2000, 1999, 5, 14);
        mis_empleados[5] = new Jefatura2("Carolina", 6000, 1990, 2, 3);
        mis_empleados[6] = new Direccion2("Carmen", 10000, 1985, 2, 3);

        Direccion2 director = (Direccion2) mis_empleados[6];  
        director.subir_sueldo_direcion(20000);

        Jefatura2 jefa_marketing = (Jefatura2) mis_empleados[5]; 
        jefa_marketing.subir_sueldo_jefarura(750);

      
        for (Empleado4 e : mis_empleados) {

            e.Subir_Sueldo(5);

        }
        // USO DE INTERFAZ DEFINIDA
        
        Arrays.sort(mis_empleados);
        
        // ESTO ESTA ORDENANDO POR SUELDO EL ARRAY --MEDIANTE  LA INTERFAZ ARRAYS--
        // TIENES QUE DECLARAR LA INTERFAZ EN LA CLASE
        // TIENES QUE CREAR UN METODO QUE PIDE LA INTERFAZ -- compareTo--

        for (Empleado4 e : mis_empleados) {

            System.out.println("Nonbre= " + e.getNombre() + ". Sueldo= " + e.getSueldo() + ". Fecha contratacion= " + e.getFecha_inicio());

        }
    }
}

class Empleado4 implements Comparable {//DECLARACION DE INTERFAZ

    private String nombre;
    private double sueldo;
    private Date fecha_inicio;
    private int id;
    private static int idSiguiente;

    
    public Empleado4(String nombre, double sueldo, int anho, int mes, int dia) {
        this.nombre = nombre;

        this.sueldo = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(anho, mes - 1, dia);
        this.fecha_inicio = calendario.getTime();

        ++idSiguiente;
        id = idSiguiente;

    }

    // METODO QUE NECESITA LA INTERFAZ
    
    
    // DEVUELVE UN A VARIABLE TIPO OBJETO
    
    
    public int compareTo(Object miObjeto) { 
        
        
        // CREAMOS VARIABLE DE TIPO EMPLEADO Y CASTEAMOS LA VARIABLE ANTERIORMENTE QUE ERA DE OBJETO.

        Empleado4 a = (Empleado4) miObjeto; 

        
        //COMPARA LA VARIABLE SUELDO
        
        
        if (this.sueldo < a.sueldo) {

            return 1;

        }

        if (this.sueldo > a.sueldo) {
            return -1;

        }

        return 0;

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre + ". Id = " + id;
    }

    public void Subir_Sueldo(double porcentaje) {

        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;

    }

}

 class Jefatura2 extends Empleado4 { 

    private double incentivo;

    public Jefatura2(String nombre, double sueldo, int anho, int mes, int dia) {
        super(nombre, sueldo, anho, mes, dia);
    }

    public void subir_sueldo_jefarura(double in) {

        incentivo = in;

    }

    public double getSueldo() {
        double sueldo_jefatura = super.getSueldo();       //este metodo llama al metodo con el mismo nombre que en la clase empleado

        return sueldo_jefatura + incentivo;
    }

}

class Direccion2 extends Jefatura2 {

    public Direccion2(String nombre, double sueldo, int anho, int mes, int dia) {
        super(nombre, sueldo, anho, mes, dia);
    }

    public void subir_sueldo_direcion(double dirin) {

        beneficios = dirin;

    }

    public double getSueldo() {

        double sueldo_direcion = super.getSueldo();

        return sueldo_direcion + beneficios;

    }

    private double beneficios;

}
