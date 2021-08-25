
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto
{
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio ;
    
    /**
     * Constructor for objects of class Producto
     * encapsulamiento doble 
    @params int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima,
    Laboratorio p_lab
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima,
    Laboratorio p_lab)
    {
        setCodigo(p_codigo);
        setRubro(p_rubro);
        setDesc(p_desc);
        setCosto(p_costo);
        setLab(p_lab);
        setPorcPtoRepo(p_porcPtoRepo);
        setExistMinima(p_existMinima);
        setStock(0);
    }
    
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo,Laboratorio p_lab)
    {
        setCodigo(p_codigo);
        setRubro(p_rubro);
        setDesc(p_desc);
        setCosto(p_costo);
        setLab(p_lab);
        setStock(0);        
    }
    
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    private void setCodigo(int p_codigo){
        codigo = p_codigo;
    }
    
    public int  getCodigo(){
        return this.codigo;
    }
    
    private void setRubro(String p_rubro){
        rubro = p_rubro;
    }
    
    public String getRubro(){
        return rubro;
    }
    
    private void setDesc(String p_desc){
        descripcion = p_desc;
    }
    
    public String getDesc(){
        return descripcion;
    }
    
    private void setCosto(double p_costo){
        costo = p_costo;
    }
    
    public double getCosto(){
        return costo;
        
    }
    
    private void setStock(int p_stock){
        stock = stock + p_stock;
    }
    
    public int  getStock(){
        return this.stock;
    }
    
    private void setPorcPtoRepo(double p_porcPtoRepo){
        porcPtoRepo = p_porcPtoRepo;
    }
    
    public double getPorcPtoRepo(){
        return porcPtoRepo;
    }
    
    private void setExistMinima(int  p_existMinima){
        existMinima = p_existMinima;
    }
    
    public int  getExistMinima(){
        return existMinima;
    }
        
    
    private void setLab(Laboratorio p_lab){
        laboratorio = p_lab;
    }
    
    public Laboratorio getLab(){
        return laboratorio;
    }
    
    /**
     * Metodo que agrega o quita stock
     * pasaje de parametros con - en caso de quitar stock
     * 
     */
    public void ajuste(int p_cantidad){
        setStock(p_cantidad);
    }
    
    /**
     * Metodo que devuelve el precio de lista( costo + 12%)
     */
    public double  precioLista(){
        double precioLista =(getCosto() + getCosto()*0.12);
        return precioLista;
    }
    
    /**
     * @return precio de costo * stock + 12% de rentabilidad
     */
    public double  stockValorizado(){
        double stockVal = getStock() * getCosto();
        double total = stockVal + (stockVal * 0.12);
        return total;
    }
    
    public double  precioContado(){
        double total = precioLista() - ( precioLista() * 0.05 );
        return total;
    }
    
    public void ajustarPtoRepo(double p_porce){
        setPorcPtoRepo(p_porce);
    }
    
    public void ajustarExistMin(int p_cantidad){
        setExistMinima(p_cantidad);
    }
    
    
    /**
     * Imprimir lista con el laboratorio llamando a los metodos de la clase  laboratorio
     * y metodos propios del producto
     */
    public void mostrar(){
        System.out.println(laboratorio.mostrar());
        System.out.println("            ");
        System.out.println("Rubro: " + getRubro());
        System.out.println("Decripcón: " +  getDesc());        
        System.out.println("Precio Costo: $"+ getCosto());        
        System.out.println("Stock: " + getStock() + " - Stock Valorizado: $" + stockValorizado() );
        System.out.println("********");
        
        
        
    }
    
    
    
    
}
