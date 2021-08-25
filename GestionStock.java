public class GestionStock
{
    public static void main(String arg[]){
        Laboratorio lab1 = new Laboratorio("Colagate SA",": Scalabrini Ortiz 5524","3777444444");
        Producto prod1 = new Producto(19923,"Perfumeria","Jabon ",5.25,12,0,lab1);
        System.out.println("*****  Ingreso de 500 productos al stock  *********");
        prod1.ajuste(500);
        prod1.mostrar();
        System.out.println("****** Se quitan  200 productos al stock *********");
        prod1.ajuste(-200);
        prod1.mostrar();
        System.out.println("****** Consulta de cliente:  *************");
        System.out.println("Precio de contado : $" + prod1.precioContado());
        System.out.println("Precio de lista  : $" + prod1.precioLista()); 
        System.out.println("");
        
        
        
        
        
    }
}

//int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima,Laboratorio p_la
