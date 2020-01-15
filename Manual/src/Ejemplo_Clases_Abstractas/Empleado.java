/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Clases_Abstractas;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author david
 * 
 */
public class Empleado extends Persona {

    private double sueldo;
    private Date fecha_inicio;
    private static int id_siguiente=1;
    private int id;

       // puedes hacer los constructores que quieras, mientras no se repita el numero de parametros. puede repetirse el mismo numero de parametros si son de diferente tipo(Strin,int,double).
    public Empleado(String nom, double sueldo, int anho, int mes, int dia) {

        super(nom);
        this.sueldo = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(anho, mes - 1, dia);
        this.fecha_inicio = calendario.getTime();
        id = id_siguiente;
        ++id_siguiente;

    }

    public double getSueldo() {
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

    public void Subir_Sueldo(double porcentaje) {

        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;

    }
    
    
    
     public  String dameDescripcion(){
         
         
         return "Id empleado = " + id + " sueldo = " + sueldo;
         
     }
    
    

}
