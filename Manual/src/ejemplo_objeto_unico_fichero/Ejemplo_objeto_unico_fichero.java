
package ejemplo_objeto_unico_fichero;

import java.util.*;

/**
 *
 * @author david
 */
public class Ejemplo_objeto_unico_fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado emple1=new Empleado("David",1000,2009,9,15);
        Empleado emple2=new Empleado("Maria",1200,2000,7,25);
        Empleado emple3=new Empleado("Daniel",900,2018,12,9);
        
        emple1.subir_sueldo(5);
          emple2.subir_sueldo(7);
          emple3.subir_sueldo(10);
          
          
        emple1.visualizacion();
        emple2.visualizacion();
        emple3.visualizacion();
        
    }
    
}




class Empleado{

    public Empleado(String nombre,int sueldo,int anho,int mes,int dia) {
        
        
        this.nombre=nombre;
        this.sueldo=sueldo;
        GregorianCalendar calendario= new GregorianCalendar(anho,mes-1,dia);
        alta_contrato=calendario.getTime();
        
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
    
    public void subir_sueldo(double porcentaje){
       double aumento=sueldo*porcentaje/100; 
        sueldo=sueldo+aumento;
        
    }
       
       public void visualizacion(){
           
          System.out.println("Nonbre= "+nombre+"\nSueldo= "+sueldo+"\nFecha contratacion"+alta_contrato);  
           
       }     
           
          
            
      }
    
    


  