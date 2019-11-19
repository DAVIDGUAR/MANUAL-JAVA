/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manual;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author david
 */
public class Ejemplo_polimorfismo_enlazado_dinamico {

    public static void main(String[] args) {
        
        
        Jefatura jefe_RRHH=new Jefatura("Vicente", 5000, 1980, 01,10);//al iniciarlo primero el id es el 1 aunque lo introduzcamos en el ARRAY en la posicion 5.
        jefe_RRHH.subir_sueldo_jefarura(500);
        

        //para almacenar en un arrays diferentes clases de variantes(string,int,date,etc) hay que clear una clase y almacenar objetos dentro del arrays.
        
        Empleado2[] mis_empleados = new Empleado2[6];
        mis_empleados[0] = new Empleado2("David", 1000, 2009, 9, 22);
        mis_empleados[1] = new Empleado2("Maria", 1500, 2000, 12, 2);
        mis_empleados[2] = new Empleado2("Daniel", 1200, 2018, 12, 06);
        mis_empleados[4] = jefe_RRHH;    // POLIMORFISMO  - almacenas un objeto de la clase jefatura en un arrays de tipo empleado.
        mis_empleados[3] = new Empleado2("Juan", 2000, 1999, 5, 14);
        mis_empleados[5] = new Jefatura("Carolina", 6000,1990, 2,3);// OBJETO TIPO JEFATURA
        
       Jefatura jefa_marketing=(Jefatura)mis_empleados[5]; //estamos casteando 
       jefa_marketing.subir_sueldo_jefarura(750);
       
      // Jefatura jefe_compras = (Jefatura)mis_empleados[1];  esto casting no funciona ya que un jefe es un empleado, pero un empleado no es un jefe.

        for (Empleado2 e : mis_empleados) {

            e.Subir_Sueldo(5);

        }

        for (Empleado2 e : mis_empleados) {

            System.out.println("Nonbre= " + e.getNombre() + ". Sueldo= " + e.getSueldo() + ". Fecha contratacion= " + e.getFecha_inicio());

        }//e.getSueldo hace referencia a la clase empleado y otras a la clase jefatura. ESTO ES :
        
        //  ENLAZADO DINAMICO.

    }
}

class Empleado2 {

    private String nombre;
    private double sueldo;
    private Date fecha_inicio;
    private int id;
    private static int idSiguiente;

    // puedes hacer los constructores que quieras, mientras no se repita el numero de parametros. puede repetirse el mismo numero de parametros si son de diferente tipo(Strin,int,double).
    public Empleado2(String nombre, double sueldo, int anho, int mes, int dia) {
        this.nombre = nombre;

        this.sueldo = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(anho, mes - 1, dia);
        this.fecha_inicio = calendario.getTime();

        ++idSiguiente;
        id = idSiguiente;

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

class Jefatura extends Empleado2 {

    private double incentivo;

    public Jefatura(String nombre, double sueldo, int anho, int mes, int dia) {
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
