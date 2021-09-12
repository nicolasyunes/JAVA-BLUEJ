import java.util.*;

public class Persona{
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private Calendar fechaNacimiento;

   /**
    * Encapsulamiento del atributo dni.
    * @param recibe un parametro int p_dni.
    */
    private void setnroDni(int p_dni){
        this.nroDni=p_dni;
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
    * Encapsulamiento del atributo anioNacimiento.
    * @param recibe un parametro int p_anio.
    */
    private void setAnioNacimiento(int p_anio){
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(p_anio,Calendar.MONTH,Calendar.DATE);
        this.setFechaNacimiento(fecha1);
        
}
    
    /**
    * Retorna el valor de la variable.
    * @return String anioNacimiento.
    * 
    */
    public int getAnioNacimiento(){
        return this.anioNacimiento;
    }

    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento=p_fecha;
    }
    public Calendar getFechaNacimiento() {
        return this.fechaNacimiento;
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
     * Ejercicio 9 constructor persona 
     */
    public Persona(int p_dni,String p_nombre, String p_apellido,Calendar p_fecha){
        this.setnroDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }


    /**
     * Calcula la edad.
     * @return devuelve entero 
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int anios = anioHoy - this.getFechaNacimiento().get(Calendar.YEAR);
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
        System.out.println("-----------INICIO--------------------");
        System.out.println("Los datos de la persona son: ");
        System.out.println(this.nomYApe() + "\nDNI: "+this.getNroDni() +"\tEdad: " +  this.edad() + " "+ "años");
        System.out.println("-------------FIN-------------------------");
    }
    
}