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

       /* Empleado1 empleado1 = new Empleado1("david", 1000, 2002, 12, 11);
        Empleado1 empleado2 = new Empleado1("daniel", 1200, 2000, 2, 1);
        Empleado1 empleado3 = new Empleado1("david", 1500, 2001, 1, 21);
        

        empleado1.Subir_Sueldo(5);
        empleado2.Subir_Sueldo(5);
        empleado3.Subir_Sueldo(5);

        System.out.println("Nombre empleado = " + empleado1.getNombre() + " sueldo = " + empleado1.getSueldo() + "fecha de alta contrato = " + empleado1.getFecha_inicio());
        System.out.println("Nombre empleado = " + empleado2.getNombre() + " sueldo = " + empleado2.getSueldo() + "fecha de alta contrato = " + empleado2.getFecha_inicio());
        System.out.println("Nombre empleado = " + empleado3.getNombre() + " sueldo = " + empleado3.getSueldo() + "fecha de alta contrato = " + empleado3.getFecha_inicio());

        */
        Empleado1[] mis_empleados = new Empleado1[5];
         mis_empleados[0] = new Empleado1("David", 1000, 2009, 9, 22);
         mis_empleados[1] = new Empleado1("Maria");
         mis_empleados[2] = new Empleado1("Daniel", 1200, 2018, 12, 06);
         mis_empleados[3] = new Empleado1();
         mis_empleados[4] = new Empleado1("juan", 2000);

         for (int i = 0; i < mis_empleados.length; i++) {

         System.out.println("Nonbre= " + mis_empleados[i].getNombre() + ". Sueldo= " + mis_empleados[i].getSueldo() + ". Fecha contratacion= " + mis_empleados[i].getFecha_inicio());

         }
         
         for (Empleado1 e:mis_empleados){
             
             e.Subir_Sueldo(5);
             
             
         }
         
         
         for (Empleado1 a:mis_empleados){
             
             System.out.println("Nonbre= " + a.getNombre() + ". Sueldo= " + a.getSueldo() + ". Fecha contratacion= " + a.getFecha_inicio());
            
         }
         
        
         }
    }
//}

    class Empleado1 {

        //puedes hacer los constructores que quieras, mientras no se repita el numero de parametros. puede repetirse el mismo numero de parametros si son de diferente tipo(Strin,int,double).
        private String nombre;
        private double sueldo;
        private Date fecha_inicio;
        private int num;
      

        // puedes hacer los constructores que quieras, mientras no se repita el numero de parametros. puede repetirse el mismo numero de parametros si son de diferente tipo(Strin,int,double).
        public Empleado1(String nombre, double sueldo, int anho, int mes, int dia) {
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
    
    
    

       /*  public Empleado1(String nombre, int num) {         //   no nos deja porque tiene 2 parametros igual que el de arriva String  y  int(aunque este int no tiene el mismo nombre).
         this.nombre = nombre;
         this.num = num;
         }
     */

         public Empleado1() {
        
         this("yo",3500,1998,1,15);
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
            return nombre;
        }

        public void Subir_Sueldo(double porcentaje) {

            double aumento = sueldo * porcentaje / 100;
            sueldo += aumento;

        }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", sueldo=" + sueldo + ", fecha_inicio=" + fecha_inicio  ;
    }
        
        
        

    }

