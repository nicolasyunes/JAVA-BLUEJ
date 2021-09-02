
import java.util.Random;

public class CrearRectangulo {
    public static void main(String[] args) {
        Random nroRandom = new Random();
        double alto = nroRandom.nextDouble() * 100 ;  
        double ancho = nroRandom.nextDouble() * 100;
        
        Punto unPunto = new Punto();
        Punto otroPunto = new Punto(7.4 ,4.5);

        Rectangulo unRectangulo  = new Rectangulo(unPunto, ancho, alto);

        unRectangulo.caracteristicas();
        unRectangulo.desplazar(40, -20);
        unRectangulo.caracteristicas();

        Random nuevoRandom = new Random();
        double alto2 = nuevoRandom.nextDouble() * 100 ;  
        double ancho2 = nuevoRandom.nextDouble() * 100;
        Rectangulo otroRectangulo = new Rectangulo(otroPunto, ancho2, alto2);
        
        unRectangulo.elMayor(otroRectangulo);
        unRectangulo.distanciaA(otroPunto);
        System.out.println("-------FIN---------");
        
        

    }
}
