

public class Circulo {
    
    private double radio;
    private Punto centro;
    
    public Circulo(double p_radio, Punto p_centro ){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    /**
     * consttructor sin parametros, inicializado en centro (0,0)
     */
    public Circulo(){
        
        this.setCentro( new Punto());
        this.setRadio(0);
    }

    private void setCentro(Punto p_centro){
        this.centro = p_centro;

    }

    private void setRadio(double p_radio){
        this.radio = p_radio;

    }

    public Punto getCentro(){
        return this.centro;
    }

    public double getRadio(){
        return this.radio;
    }

    
    /**
     * 
     * @param p_dx
     * @param p_dy
     * se desplaza el centro a un nuevo punto manteniendo la superficie
     */
    public void desplazar (double p_dx, double p_dy){
       double x = this.centro.getX() + p_dx;
       double y = this.centro.getY() + p_dy;
       Punto nuevoPunto = new Punto(x,y);
       setCentro(nuevoPunto);

    }
    /**
     * 
     * @return superficie del objeto
     */
    public double superficie() {
        double superficie =  3.1416 * Math.pow(this.getRadio(),2);
        return superficie;
    }
    /**
     * 
     * @return devuelve el perimetro del objeto 
     */
    public double perimetro(){
        double perimetro = 2*Math.PI*this.getRadio();
        return perimetro;
    }
    
    /**
     * 
     * @param otroCirculo
     * @return objeto de mayor superficie, comparativa entre dos objetos mostrando caracterisiticas.
     * 
     */
    public Circulo elMayor(Circulo otroCirculo) {
        if (this.superficie() > otroCirculo.superficie()){
            
            this.caracteristicas();
            return this;

        }else{
            otroCirculo.caracteristicas();
            return otroCirculo;
               
        }
       
        
    }

    
    
    public void caracteristicas(){
        System.out.print("Centro : " + "(" +  this.getCentro().getX() + " ; " +  this.getCentro().getY() + ") ");
        System.out.println("- Radio: " + this.getRadio());
        System.out.print("Superficie: " + this.superficie());
        System.out.println(" - Perimetro: " + this.perimetro());
        
    }

    
}