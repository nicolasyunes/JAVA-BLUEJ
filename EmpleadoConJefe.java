/**
 * Muestra los datos de la clase EmpleadoConJefe
 * 
 * @author Yunes Nicolas
 * @version 2021
 */
import java.util.*;
public class EmpleadoConJefe
{
    
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;
    
   /** Metodo constructor de la clase EmpleadoConJefe
     * @param long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoCondJefe p_jefe
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe){
     setCuil (p_cuil);
     setApellido (p_apellido);
     setNombre (p_nombre);
     setSueldoBasico (p_importe);
     setFechaIngreso (p_fecha);
     setJefe(p_jefe);
    }

   /** Metodo constructor de la clase EmpleadoConJefe
     * @param long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha
      */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
     setCuil (p_cuil);
     setApellido (p_apellido);
     setNombre (p_nombre);
     setSueldoBasico (p_importe);
     setFechaIngreso (p_fecha);
     setJefe(null);
    }
    
    /** Metodo constructor de la clase EmpleadoConJefe
     * @param long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
     setCuil (p_cuil);
     setApellido (p_apellido);
     setNombre (p_nombre);
     setSueldoBasico (p_importe);
     setAnioIngreso (p_anio);
     setJefe(null);
    }
    
     
    private void setCuil (long p_cuil){
     this.cuil = p_cuil;
    }
    
    private void setApellido (String p_apellido) {
     this.apellido = p_apellido;
    }
    
    private void setNombre (String p_nombre){
     this.nombre = p_nombre;
    }
    
    private void setSueldoBasico (double p_importe){
     this.sueldoBasico = p_importe;
    }
    
    private void setAnioIngreso (int p_anio){
     Calendar fecha = new GregorianCalendar();
     fecha.set(p_anio, 5, 5); //5, 5, son valores asignados al azar
     this.fechaIngreso = fecha;
    }
    
    private void setFechaIngreso (Calendar p_fecha){
         this.fechaIngreso = p_fecha;
    }
    
    private void setJefe(EmpleadoConJefe p_jefe){
     this.jefe = p_jefe;
    }
    
    /**
    * descripcion: getter para los atributos
    */
   
    /** 
     * @devuelve un valor de tipo long.
     */
    
    public long getCuil(){
     return this.cuil;
    }
    
    
    /**
     * @return devuelve un valor de tipo String.
     */
    public String getApellido(){
     return this.apellido;
    }
    
    /**
     * @return devuelve un valor de  tipo String.
     */
    public String getNombre(){
     return this.nombre;
    }
    
    /**
     * @return devuelve un valor de  tipo double.
     */
    public double getSueldoBasico(){
     return this.sueldoBasico;
    }
    
    /**
     * @return devuelve un valor de tipo entero.
     */
    public int getAnioIngreso(){
     return this.fechaIngreso.get(Calendar.YEAR);
    }
    
    /**
     * @return devuelve un valor de  tipo EmpleadoConJefe jefe
     */
    public EmpleadoConJefe getJefe(){
     return this.jefe;
    }
    
    /**
     * @return devuelve  un valo tipo Calendar fechaIngreso
     */
     public Calendar getFechaIngreso(){
     return this.fechaIngreso;
    }
    
    /** 
     * Calcula la antiguedad del empleado.
     */
    public int antiguedad(){
     Calendar fechaHoy = new GregorianCalendar();
     int anioHoy = fechaHoy.get(Calendar.YEAR);
     return (anioHoy - this.getAnioIngreso());
    }
    
    /** 
     * Calcula un descuento del 2% del sueldo basico.
     */
    private double descuento(){
     double p_descuento = (2*this.getSueldoBasico())/100;
     return (p_descuento + 12);
    }
    
     /** 
      * Calcula un adicional para el sueldo del empleado de acuerdo con su antiguedad
     */
    private double adicional(){
     double p_adicional;   
     if(this.antiguedad() < 2){
        p_adicional = (2*this.getSueldoBasico())/100;    
        }
            else if((this.antiguedad() >= 2) && (this.antiguedad() < 10)) {
             p_adicional = (4*this.getSueldoBasico())/100;
            }
                else{
                    p_adicional = (6*this.getSueldoBasico())/100;
                }
     return p_adicional;
    }
    
        
    /** 
     * Devuelve el sueldo neto (sueldo basico + adicional - descuento) del empleado
       */
    public double sueldoNeto(){
        return (this.getSueldoBasico() + this.adicional() )- this.descuento();
    }
    
    /** 
     * Devuelve el apellido y el nombre del empleado. 
     */
    public String apeYNom(){
        return (this.getApellido() + " " + this.getNombre());
    }
    
    
    /** 
     * Devuelve el nombre y el apellido del empleado. 
     */
    public String nomYape(){
        return (this.getNombre() + " " + this.getApellido());
    }
    
    /** 
     * Muetra los atributos del empleado en forma de cuadricula.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYape());
        System.out.println("CUIL: " + this.getCuil() + "\tAntiguedad: " + this.antiguedad() + " años de servicio" );
        System.out.println("Suedo Neto: $" + this.sueldoNeto());
        if(this.getJefe() != null){
        System.out.println("Responde a: "+this.getJefe().apeYNom());
        }
    }
    
    /** Muetra los atributos del empleado en forma de linea.
     */
    public void mostrarLinea(){
        System.out.println(this.getCuil() + "\t" + this.getApellido() + ", " +this.getNombre()// Sigue abajo.
                           + "................. $" + this.sueldoNeto());
    }
    
     /**
     * Comprueba el dia en el que la persona cumple un año mas en la empresa
     */
    public boolean esAniversario(){
     Calendar fechaHoy = new GregorianCalendar();
     return((fechaHoy.get(Calendar.DATE) == this.getFechaIngreso().get(Calendar.DATE)) && ((fechaHoy.get(Calendar.MONTH)+1) == this.getFechaIngreso().get(Calendar.MONTH)));
    }
}