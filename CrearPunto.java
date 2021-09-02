import java.util.*;
public class CrearPunto{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double x,y,xx,yy;
        
        System.out.println("Ingrese valor de abcisa:(p1) ");
        x = input.nextDouble();
        System.out.println("Ingrese valor de ordenada:(p1) ");
        y = input.nextDouble();
        
        System.out.println("Ingrese valor de abcisa:(p2) ");
        xx = input.nextDouble();
        System.out.println("Ingrese valor de ordenada:(p2) ");
        yy = input.nextDouble();
        
        
        Punto p1 = new Punto(x,y);
        Punto p2 = new Punto(xx,yy);
        p1.mostrar();
        p2.mostrar();
 
        System.out.println("distancia " + p1.distanciaA(p2));
    }
}
