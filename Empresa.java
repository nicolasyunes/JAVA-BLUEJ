/**
 * Clase ejecutable Empresa.
 * 
 * @authorYunesNicolas
 * @version 2021
 */
import java.util.*;

public class Empresa
{
    public static void main(){
        Scanner tecla = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String p_nombre = tecla.next();
        
        System.out.print("Ingrese el apellido: ");
        String p_apellido = tecla.next();
        
        System.out.print("Ingrese su numero de CUIL: ");
        long p_cuil = tecla.nextLong();
        System.out.print("Sueldo basico: ");
        double p_importe = tecla.nextDouble();
        System.out.print("\n Ingrese Fecha De Ingreso"+
                         "\n Anio: ");
        int p_anio = tecla.nextInt();         
        System.out.print("\n Mes (numerico MM): ");
        int p_mes = tecla.nextInt();
        System.out.print("\n Dia (numerico DD): ");
        int p_dia = tecla.nextInt();
        Calendar p_fechaIngreso = new GregorianCalendar();
        p_fechaIngreso.set(p_anio, p_mes, p_dia);
        
        
        
        System.out.print("\n ¿Este empleado tiene jefe? s/n: ");
        char op = tecla.next().charAt(0);
        if((op == 's') || (op == 'S')){
             System.out.print("\n Ingrese los datos del Jefe ");
             System.out.println(" ");
             System.out.print("Ingrese el nombre: ");
             String p_nombreJefe = tecla.next();
             System.out.print("Ingrese el apellido: ");
             String p_apellidoJefe = tecla.next();
             System.out.print("Ingrese su numero de CUIL: ");
             long p_cuilJefe = tecla.nextLong();
             System.out.print("Sueldo basico: ");
             double p_importeJefe = tecla.nextDouble();
             System.out.print("\n Ingrese Fecha De Ingreso"+
                         "\n Anio: ");
             int p_anioJefe = tecla.nextInt();         
             System.out.print("\n Mes (numerico MM): ");
             int p_mesJefe = tecla.nextInt();
             System.out.print("\n Dia (numerico DD): ");
             int p_diaJefe = tecla.nextInt();
             Calendar p_fechaIngresoJefe = new GregorianCalendar();
             p_fechaIngresoJefe.set(1990, 05, 06);
            
             EmpleadoConJefe p_jefe = new EmpleadoConJefe(p_cuilJefe, p_apellidoJefe, p_nombreJefe, p_importeJefe, p_fechaIngresoJefe);
             EmpleadoConJefe empleadoCJefe1 = new EmpleadoConJefe(p_cuil, p_apellido, p_nombre, p_importe, p_fechaIngreso, p_jefe); 
             System.out.print("\n    ");             
             empleadoCJefe1.mostrar();
        
             if(empleadoCJefe1.esAniversario()){
             System.out.print("\n    "+
                              "\n TIENE PERMISO DE SALIR UNA HORA ANTES!"+
                              "\n FIRMA: "+ empleadoCJefe1.getJefe().apeYNom());
                            }
                 
        }else {
                Empleado empleado1 = new Empleado(p_cuil, p_nombre, p_apellido, p_importe, p_fechaIngreso);    
                System.out.print("\n    ");
                empleado1.mostrar();
                if(empleado1.esAniversario()){
                        System.out.print("\n    "+
                                          "\n TIENE PERMISO DE SALIR UNA HORA ANTES!");
                            }
       }  
        
    }
}
