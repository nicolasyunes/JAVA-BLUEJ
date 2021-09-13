/**
 * Descripcion: en esta clase se pueden crearobjetos de la clase Hospital y mostrar los datos en pantalla
 * 
 * @author Yunes Nicolas
 * @version 2021
 */
public class Hospital{
    
    private String nombreHospital;
    private String nombreDirector;
    
    /**
     * Descripcion: constructor de la clase Hospital.
     * @param p_nombreHospital,p_nombreDirector.
     */
    
    public Hospital(String p_nombreHospital, String p_nombreDirector){
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
    }
    
    /**
     * Descripcion:setter para atributos.
     * Encapsulamiento.
     */
    
    private void setNombreHospital(String p_nombreHospital){
        this.nombreHospital = p_nombreHospital;
    }
    
    private void setNombreDirector(String p_nombreDirector){
        this.nombreDirector = p_nombreDirector;
    }
    
     /**
    * descripcion: getter para los atributos
    */
   
   
    /**
     * @return devuelve un valor de tipo String.
     */
    public String getNombreHospital(){
        return this.nombreHospital;
    }
    
    /**
     * @return devuelve un valor de tipo String.
     */
    public String getnombreDirector(){
        return this.nombreDirector;
    }
    
    /**
     * Descripcion: muestra en pantalla los datos de un afiliado
     * @param Paciente p_paciente
     */
    
    /**public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: "+this.getNombreHospital()+"\tDirector: "+this.getNombreDoctor());
        System.out.println("------------------------------------------------");
        System.out.println("Paciente: "+p_paciente.getNombre()+"\tHistoria Clinica: "+p_paciente.getHistoriaClinica()+"\tDomicilio: "
        +p_paciente.getDomicilio());
        System.out.println("Localidad: "+p_paciente.getLocalidadNacido()+"\tProvincia: "+p_paciente.getLocalidadVive());
    }*/
    
    public void consultaDatosFiliatorios(Paciente p_paciente){
       System.out.println("Hospital: "+this.getNombreHospital()+"\t"+"Director: "+this.getnombreDirector());
       System.out.println("-----------------------------------------------------------------------------------");
       p_paciente.mostrarDatosPantalla();
    }
    
}