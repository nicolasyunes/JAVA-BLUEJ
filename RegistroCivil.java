public class RegistroCivil {

  public static void main(String[] args) {
    Hombre hombre1 = new Hombre("Juan", "Perez", 20);
    Mujer mujer1 = new Mujer("Juana", "Perez", 25);
    Mujer mujer2 = new Mujer("Elcira", "De las siete puntas", 55);

    hombre1.casarseCon(mujer2);
    hombre1.casadoCon();

    hombre1.casarseCon(mujer1);
    hombre1.casadoCon();
    System.out.println("Divorcio: ");
    hombre1.divorcio();
    hombre1.casadoCon();
    System.out.println("Casarse Mujer: ");
    mujer1.casarseCon(hombre1);
    mujer1.casadaCon();

    System.out.println("Divorcio mujer: ");
    mujer1.divorcio();
    mujer1.casadaCon();
    
   
    
  }
}
