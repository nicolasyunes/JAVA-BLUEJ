public class Laboratorio{
    //atributos
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMin;
    private int diaEntrega; 
    
    /**
    * Encapsulamiento del atributo nombre.
    * @param recibe un parametro string p_nombre.
    */
    private void setNombre(String p_nom){
        this.nombre = p_nom;
    }
    
    /**
    * Encapsulamiento del atributo domicilio.
    * @param recibe un parametro string p_dom.
    */
        private void setDomicilio(String p_dom){
        this.domicilio = p_dom;
    }
    
    /**
    * Encapsulamiento del atributo telefono.
    * @param recibe un parametro string p_tel.
    */
        private void setTelefono(String p_tel){
        this.telefono = p_tel;
    }
    
    /**
    * Encapsulamiento del atributo CompraMin.
    * @param recibe un parametro int  p_compraMin.
    */
        private void setCompraMin(int p_compraMin){
        this.compraMin = p_compraMin;
    }
    
    /**
    * Encapsulamiento del atributo DiaEntrega.
    * @param recibe un parametro int  p_diaEntrega.
    */
        private void setDiaEntrega(int p_diaEntrega){
        this.diaEntrega = p_diaEntrega;
    }
    
    /**
    * Retorna el valor de la variable.
    * @return string nombre.
    * 
    */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
    * Retorna el valor de la variable.
    * @return string domicilio.
    * 
    */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
    * Retorna el valor de la variable.
    * @return string  telefono.
    * 
    */
    public String getTelefono(){
        return this.telefono;
    }
    
    /**
    * Retorna el valor de la variable.
    * @return int compraMin.
    * 
    */
    public int getCompraMin(){
        return this.compraMin;
    }
    
    /**
    * Retorna el valor de la variable.
    * @return int diaEntrega.
    * 
    */
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    
    /**
     * Constructor para objetos de la clase CopyOfLaboratorio.
     * @param string p_nom, string p_dom, String p_numTel.
     */
    public  Laboratorio(String p_nom, String p_dom, String p_numTel){
        this.setNombre(p_nom);
        this.setDomicilio(p_dom);
        this.setTelefono(p_numTel);
    }
    
    /**
     * Constructor para objetos de la clase CopyOfLaboratorio.
     * @param String p_nom, String p_dom, String p_numTel,int p_compraMin, int p_diaEntrega)
     */
    public Laboratorio(String p_nom, String p_dom, String p_numTel, int p_compraMin,  int p_diaEntrega){
        this.setNombre(p_nom);
        this.setDomicilio(p_dom);
        this.setTelefono(p_numTel);
        this.setCompraMin(p_compraMin);
        this.setDiaEntrega(p_diaEntrega);
    }
    
    /**
     * Este método muestra los datos: laboratorio,domicilio, telefono.
     */
    public String mostrar(){
        String retorno = "Laboratorio: "+getNombre() + "\nDomicilio: "+getDomicilio() + "\t-Telefono: " + getTelefono();
        return retorno;
    }
    
}

  
