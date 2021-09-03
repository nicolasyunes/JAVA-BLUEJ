import java.util.*;
/**
 * Esta clase muestra los datos de las personas para luego visualizarlo
 * 
 * @author Abrahan Ramirez Ulises Alejandro.
 * @version 1.0 (26/08/19).
 */
public class Persona{
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;

   /**
    * Encapsulamiento del atributo dni.
    * @param recibe un parametro int p_dni.
    */
    private void setnroDni(int p_dni){
        this.nroDni=p_dni;
    }
    
    /**
    * Encapsulamiento del atributo anioNacimiento.
    * @param recibe un parametro int p_anio.
    */
    private void setAnioNacimiento(int p_anio){
        this.anioNacimiento=p_anio;
    }
    
    /**
    * Encapsulamiento del atributo nombre.
    * @param recibe un parametro int p_nombre.
    */
    private void setNombre(String p_nombre){
        this.nombre=p_nombre;
    }
    
    /**
    * Encapsulamiento del atributo apellido.
    * @param recibe un parametro int p_apellido.
    */
    private void setApellido(String p_apellido){
        this.apellido=p_apellido;
    }

    /**
    * Retorna el valor de la variable.
    * @return int nroDni.
    */
    public int getNroDni(){
        return this.nroDni;
    }
    
    /**
    * Retorna el valor de la variable.
    * @return String nombre.
    * 
    */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
    * Retorna el valor de la variable.
    * @return String apellido.
    * 
    */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
    * Retorna el valor de la variable.
    * @return String anioNacimiento.
    * 
    */
    public int getAnioNacimiento(){
        return this.anioNacimiento;
    }



    /**
     * Constructor para objetos de la clase Persona
     * @param int p_dni, String p_nombre, String p_apellido, int p_anio.
     */
    //constructor
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        
        this.setnroDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }

    /**
     * Calcula la edad.
     * @return devuelve entero 
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int anios = anioHoy - this.getAnioNacimiento();
        return anios;
    }
    
    /**
     * Imprime el apellido y nombre.
     * @return devuelve un string.
     */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    
    /**
     * Imprime el nombre y apellido.
     * @return devuelve un string.
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Este metodo muestra los datos: nombre y apellido , numero de dni y la edad.
     */
    public void mostrar(){
        System.out.println("Los datos de la persona son: ");
        System.out.println(this.nomYApe() + "\nDNI: "+this.getNroDni() +"\tEdad: "+this.edad() + " "+ "años");
    }
    
}
