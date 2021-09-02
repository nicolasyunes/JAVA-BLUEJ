
import java.util.Random;

public class  CrearCirculo{
    public static void main(String [] args){
    Random unNumero = new Random();
    double radio = unNumero.nextDouble() * 100.0;
    double radio2 = unNumero.nextDouble() * 100.0;   

    Punto p1 = new Punto();
    Punto p2 = new Punto(5.2, 0.5);

    Circulo unCirculo = new Circulo(radio , p1);
    

    System.out.println("********Un Circulo****** ");
    unCirculo.caracteristicas();
    System.out.println("*********Se desplaza circulo******** ");    
    unCirculo.desplazar(-240,-230);
    unCirculo.caracteristicas();

    System.out.println("*******Otro circulo********** "); 
    Circulo otroCirculo = new Circulo(radio2 , p2);
    otroCirculo.caracteristicas();
    System.out.println("-----------------------");
    
    System.out.println("******Mayor*******  ");   
    unCirculo.elMayor(otroCirculo);
    System.out.println("Distancia:  " + p1.distanciaA(p2));    

    System.out.println("____Fin_____ ");

        
    
    
    
    
    
    }
}