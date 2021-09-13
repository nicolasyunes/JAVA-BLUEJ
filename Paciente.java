
 
public class Paciente{
    
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    /**
     * Descripcion: constructor para los objetos de la clase Paciente
     * @param p_historiaClinica,p_nombre, p_domicilio,p_localidadNacido,p_localidadVive
     */
    
    public Paciente(int p_historiaClinica, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoriaClinica(p_historiaClinica);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setLocalidadNacido(p_localidadNacido);
        this.setLocalidadVive(p_localidadVive);
    }
    
    /**
     * Descripcion:setter para atributos.
     * Encapsulamiento.
     */
    
    private void setHistoriaClinica(int p_historiaClinica){
        this.historiaClinica = p_historiaClinica;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }   
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }  
    
    private void setLocalidadNacido(Localidad p_localidadNacido){
        this.localidadNacido = p_localidadNacido;
    }  
    
    private void setLocalidadVive(Localidad p_localidadVive){
        this.localidadVive = p_localidadVive;
    }
    
     /**
    * descripcion: getter para los atributos
    */
   
    /**
     * @return devuelve un valor de tipo entero
     */
    public int getHistoriaClinica(){
        return this.historiaClinica;
    }
    
    /**
     * @return devuelve un valor de tipo String 
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * @return un valor de tipo  String
     */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
     * @return devuelve un valor de tipo Localidad.
     */
    public Localidad getLocalidadNacido(){
        return this.localidadNacido;
    }
    
    /**
     * @return devuelve un valor de tipo Localidad.
     */
    public Localidad getLocalidadVive(){
        return this.localidadVive;
    }
    
    /**
     * Descripcion: muestra los datos de un paciente en pantalla
     */
    
    public void mostrarDatosPantalla(){
        System.out.println("Paciente: "+this.getNombre()+"\t Historia Clinica: "+this.getHistoriaClinica()+"\tDomicilio: "
        +this.getDomicilio());
        System.out.println("Localidad: "+this.getLocalidadNacido().getNombre()+"\t Provincia: "+this.getLocalidadVive().getProvincia());
    }
    
    /**
     * Descripcion: muestra los datos de un paciente pero en una sola linea
     */
    
    public String cadenaDeDatos(){
        return this.getNombre()+"\t"+this.getHistoriaClinica()+"\t"+this.getDomicilio()+"\t"+this.getLocalidadNacido().getNombre()+"\t"+
        this.getLocalidadVive().getProvincia();
    }
    
    
}
