
public class Punto{
 
   private double x; 
   private double y;
   
   /**
    * retorna el contenido de x
    * @return x
    */
   public double getX(){
        return this.x; 
   }
    /**
     * retornal el contenido de y
     * @return y
     */
   public double getY(){
        return this.y; 
   }
    /**
     * encapsula el atributo x
     * @param double p_x
     */
   private void setX(double p_x){
        this.x = p_x;
   }
    /**
     * encapsula el atributo y
     * @param double p_y
     */
   private void setY(double p_y){
        this.y = p_y;
   }
    /**
     * Metodo constructor
     * @param double p_x double p_y
     */
   public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
   }
    /**
     * Constructor inicializa los atributos en su valor minimo
     * 
     */
   public Punto(){   
        this.setX(0);
        this.setY(0);
   }
    /**
     * Develve las coordenadas del punto
     * @return String coordenadas
     */
   public String coordenadas(){
        return "Coordenandas :  ("+this.getX()+","+this.getY()+")";
   }
   /**
    * Desplaza el punto
    * @param double p_dx pudlbe p_dy
    */
   public void desplazar(double p_dx,double p_dy){
       this.setX((this.getX()+p_dx));
       this.setY(this.getY()+p_dy);
   }
   
   public double distanciaA(Punto pto){
       
       double distancia = Math.sqrt(Math.pow(pto.getX() - this.getX() ,2) + Math.pow(pto.getY() - this.getY(),2 ) );
       
       return distancia;
   }
   /**
    * muestra la ubicacion del punto.
    */
   public void mostrar(){
        System.out.println(this.coordenadas());
        
   }

}
