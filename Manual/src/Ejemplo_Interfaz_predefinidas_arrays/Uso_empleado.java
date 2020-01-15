/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Interfaz_predefinidas_arrays;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author david
 */
public class Uso_empleado {

    public static void main(String[] args) {
        
        
        Jefatura2 jefe_RRHH=new Jefatura2("Vicente", 5000, 1980, 01,10);
        jefe_RRHH.subir_sueldo_jefarura(500);
        

        Empleado3[] mis_empleados = new Empleado3[6];
        mis_empleados[0] = new Empleado3("David", 1000, 2009, 9, 22);
        mis_empleados[1] = new Empleado3("Maria", 1500, 2000, 12, 2);
        mis_empleados[2] = new Empleado3("Daniel", 1200, 2018, 12, 06);
        mis_empleados[4] = jefe_RRHH;    // POLIMORFISMO  - almacenas un objeto de la clase jefatura en un arrays de tipo empleado.
        mis_empleados[3] = new Empleado3("Juan", 2000, 1999, 5, 14);
        mis_empleados[5] = new Jefatura2("Carolina", 6000, 1990, 2, 3);// OBJETO TIPO JEFATURA
        
        Jefatura2 jefa_finanzas=(Jefatura2) mis_empleados[5];
        
        jefa_finanzas.subir_sueldo_jefarura(55000);
       

        for (int i = 0; i < 1; i++) {
            mis_empleados[1].subir_sueldo(5);

        }
        
        
        Arrays.sort(mis_empleados);
        
        
        for (int i = 0; i < 6; i++) {

            System.out.println("Nonbre= " + mis_empleados[i].getNombre() + ", Sueldo= " + mis_empleados[i].getSueldo() + ", Fecha contratacion" + mis_empleados[i].getAlta_contrato());

        }

    }
}

class Empleado3 implements Comparable{

    public Empleado3(String nombre, double sueldo, int anho, int mes, int dia) {

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
    
    
    public int compareTo(Object miObjeto){
        
        Empleado3 otroEmpleado=(Empleado3)miObjeto;
        
        if(this.sueldo<otroEmpleado.sueldo){
            
             return -1;
            
        }
        
        if(this.sueldo>otroEmpleado.sueldo){
            
            
            return 1;
            
        }
        
        
        return 0;
    
   
    
    
}
    
    

}

class Jefatura2 extends Empleado3 {  

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
