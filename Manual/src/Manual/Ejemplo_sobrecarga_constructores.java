/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manual;

import java.util.*;

/**
 *
 * @author david
 */
public class Ejemplo_sobrecarga_constructores {

    public static void main(String[] args) {

        Empleado1[] mis_empleados = new Empleado1[5];
        mis_empleados[0] = new Empleado1("David", 1000, 2009, 9, 22);
        mis_empleados[1] = new Empleado1("Maria");
        mis_empleados[2] = new Empleado1("Daniel", 1200, 2018, 12, 06);
        mis_empleados[3] = new Empleado1("Juan");
        mis_empleados[4] = new Empleado1("juan", 2000);

        for (int i = 0; i < mis_empleados.length; i++) {

            System.out.println("Nonbre= " + mis_empleados[i].getNombre() + ". Sueldo= " + mis_empleados[i].getSueldo() + ". Fecha contratacion= " + mis_empleados[i].getFecha_inicio());

        }
    }

}

class Empleado1 {

    //puedes hacer los constructores que quieras, mientras no se repita el numero de parametros. puede repetirse el mismo numero de parametros si son de diferente tipo(Strin,int,double).
    private String nombre;
    private int sueldo;
    private Date fecha_inicio;
    private int num;

       // puedes hacer los constructores que quieras, mientras no se repita el numero de parametros. puede repetirse el mismo numero de parametros si son de diferente tipo(Strin,int,double).
    public Empleado1(String nombre, int sueldo, int anho, int mes, int dia) {
        this.nombre = nombre;

        this.sueldo = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(anho, mes - 1, dia);
        this.fecha_inicio = calendario.getTime();
    }

    public Empleado1(String nom) {
        this(nom, 740, 2000, 12, 31);

    }

    public Empleado1(String nombre, Date fecha_inicio) {//COMO HACER LO MISMO QUE EL EJEMPOL ANTERIOR, PERO CON LA FECHA.
        this.nombre = nombre;                                    //        this(nombre,740,feche_inicio);                        NO FUNCIONA
        this.fecha_inicio = fecha_inicio;
    }

 

    public Empleado1(String nombre, int sueldo) {
        this(nombre,sueldo,2000,12,31);
    }

    /* public Empleado1(String nombre, int num) {            no nos deja porque tiene 2 parametros igual que el de arriva String  y  int(aunque este int no tiene el mismo nombre).
     this.nombre = nombre;
     this.num = num;
     }
     */
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getNombre() {
        return nombre;
    }

}
