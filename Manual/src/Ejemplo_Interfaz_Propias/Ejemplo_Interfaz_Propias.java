/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Interfaz_Propias;


import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author david
 */
public class Ejemplo_Interfaz_Propias {
    
    
    
     public static void main(String[] args) {

        Jefatura5 jefe_RRHH = new Jefatura5("Vicente", 5000, 1980, 01, 10);
        jefe_RRHH.subir_sueldo_jefarura(500);

        Empleado5[] mis_empleados = new Empleado5[6];
        mis_empleados[0] = new Empleado5("David", 1000, 2009, 9, 22);
        mis_empleados[1] = new Empleado5("Maria", 1500, 2000, 12, 2);
        mis_empleados[2] = new Empleado5("Daniel", 1200, 2018, 12, 06);
        mis_empleados[4] = jefe_RRHH;
        mis_empleados[3] = new Empleado5("Juan", 2000, 1999, 5, 14);
        mis_empleados[5] = new Jefatura5("Carolina", 6000, 1990, 2, 3);

        Empleado5 director_comercial = new Jefatura5("Marta", 2000, 2019, 11, 3);
        Comparable ejemplo=new Empleado5("Juan", 3000,2000,2,9);
        
      
        
        

        for (int i = 0; i < 1; i++) {
            mis_empleados[1].subir_sueldo(5);

        }

        Arrays.sort(mis_empleados);

        for (int i = 0; i < 6; i++) {

            System.out.println("Nonbre= " + mis_empleados[i].getNombre() + ", Sueldo= " + mis_empleados[i].getSueldo() + ", Fecha contratacion" + mis_empleados[i].getAlta_contrato());

        }

    }
}

class Empleado5 implements Comparable {

    public Empleado5(String nombre, double sueldo, int anho, int mes, int dia) {

        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(anho, mes - 1, dia);
        alta_contrato = calendario.getTime();

    }

    private String nombre;
    private double sueldo;
    private Date alta_contrato;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getAlta_contrato() {
        return alta_contrato;
    }

    public void setAlta_contrato(Date alta_contrato) {
        this.alta_contrato = alta_contrato;
    }

    public void subir_sueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo = sueldo + aumento;

    }

    public void visualizacion() {

        System.out.println("Nonbre= " + nombre + "\nSueldo= " + sueldo + "\nFecha contratacion" + alta_contrato);

    }

    public int compareTo(Object miObjeto) {

        Empleado5 otroEmpleado = (Empleado5) miObjeto;

        if (this.sueldo < otroEmpleado.sueldo) {

            return -1;

        }

        if (this.sueldo > otroEmpleado.sueldo) {

            return 1;

        }

        return 0;

    }

}

class Jefatura5 extends Empleado5 {

    private double incentivo;

    public Jefatura5(String nombre, double sueldo, int anho, int mes, int dia) {
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
    
    
    
    
    
    
    
}
