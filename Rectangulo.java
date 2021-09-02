public class Rectangulo {
    private Punto origen;
    private double ancho;
    private double alto;

    public Rectangulo(Punto p_origen, double p_ancho, double p_alto) {
        setOrigen(p_origen);
        setAlto(p_alto);
        setAncho(p_ancho);                    
    }

    

    public Rectangulo(double p_ancho, double p_alto) {
        setAlto(p_ancho);
        setAncho(p_alto);
        setOrigen(new Punto());
    }



    public Punto getOrigen() {
        return this.origen;
    }

    private void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public double getAncho() {
        return this.ancho;
    }

    private void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    private void setAlto(double alto) {
        this.alto = alto;
    }
    
    /**
     * 
     * @param p_dx
     * @param p_dy
     * se desplaza el centro a un nuevo punto (punto inferior izq )  manteniendo la superficie 
     */
    public void desplazar (double p_dx, double p_dy){
        double x = this.origen.getX() + p_dx;
        double y = this.origen.getY() + p_dy;
        Punto nuevoPunto = new Punto(x,y);
        setOrigen(nuevoPunto);  
     }

     /**
     * 
     * @return superficie del objeto
     */
    public double superficie() {
        double superficie = getAlto() * getAncho()  ;
        return superficie;
    }
    /**
     * 
     * @return devuelve el perimetro del objeto 
     */
    public double perimetro(){
        double perimetro = 2 * (getAlto() * getAncho());
        return perimetro;
    }


    /**
     * 
     * @param otroRectangulo
     * @return recibe un objeto de tipo rectangulo y compara las superficies;
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        System.out.println("----------rectangulo mayor-------");
        if(this.superficie() > otroRectangulo.superficie()){
            this.caracteristicas();
            return this ;
        }else{
            otroRectangulo.caracteristicas();
            return otroRectangulo;
        }
    }
    /**
     * 
     * @param pto
     * @return distancia entre puntos de origen
     */
    public double distanciaA(Punto pto){
       
       double distancia = Math.sqrt(Math.pow(pto.getX() - this.origen.getX() ,2) + Math.pow(pto.getY() - this.origen.getY(),2 ) );
       System.out.println("Distancia: " + distancia);
       return distancia;
   }



     public void caracteristicas(){
        System.out.println("***********Rectangulo************");
        System.out.println("Origen: (" + this.getOrigen().getX() + "; " +this.getOrigen().getY() + ")  - " + "Alto: " + getAlto() + " - " + "Ancho: "+ getAncho());
        System.out.print("Superficie: " + this.superficie());
        System.out.println(" - Perimetro: " + this.perimetro());
        
        
    }

    

}

    
