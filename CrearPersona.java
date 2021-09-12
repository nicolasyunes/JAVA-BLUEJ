import java.util.*;
public class CrearPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona(123123,"juan", "perez",2005);
        Calendar unaFecha = Calendar.getInstance();
        unaFecha.set(1990,9,5);
        Persona persona2 = new Persona(123123,"pedro", "gonzales",unaFecha);
        persona1.mostrar();
        persona2.mostrar();


    }
}