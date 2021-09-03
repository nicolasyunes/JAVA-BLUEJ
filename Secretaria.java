public class Secretaria {
    public static void main (String[] args){
        System.out.println("***Inicio***");
        Escuela escuela = new Escuela("Sarmiento", "AV 3 DE ABRIL", "Juan Perez");
        Docente docente = new Docente("Profesor Gonzalez " , "2° C " , 20100, 10000);
        escuela.imprimiRecibo(docente);
        System.out.println("---FIN----");
    }
    
}
