public class Mujer {

  private String nombre;
  private String apellido;
  private int edad;
  private String estadoCivil;
  private Hombre esposo;

  public Mujer(String p_nombre, String p_apellido, int p_edad) {
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setEdad(p_edad);
    this.setEstadoCivil("Soltera");
  }

  public void Mujer(
    String p_nombre,
    String p_apellido,
    int p_edad,
    Hombre p_esposo
  ) {
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setEdad(p_edad);
    this.setEstadoCivil("Casada");
    this.setEsposo(p_esposo);
  }

  public void casarseCon(Hombre p_hombre) {
    if (this.getEstadoCivil() == "Soltera") {
      this.setEsposo(p_hombre);
      this.setEstadoCivil("Casada");
      this.esposo.setEstadoCivil("Casado");
      this.esposo.setEsposa(this);
    } else {
      System.out.println("No puede casarse si no está divorciada o soltera");
    }
  }

  public void divorcio() {
    this.esposo = null;
    this.setEstadoCivil("Divorciada");
  }

  public String datos() {
    String result =
      this.getApellido() + " " + this.getNombre() + " " + this.getEdad();
    return result;
  }

  public String mostrarEstadoCivil() {
    return (
      this.getNombre() +
      " " +
      this.getApellido() +
      " de " +
      this.getEdad() +
      "años  -" +
      this.getEstadoCivil()
    );
  }

  public void casadaCon() {
    if (this.getEstadoCivil() == "Casada") {
      System.out.println(
        this.datos() + " esta casada con " + this.esposo.datos()
      );
    } else {
      System.out.println(this.datos() + "   no esta casada");
    }
  }

  private void setNombre(String p_nombre) {
    this.nombre = p_nombre;
  }

  private void setApellido(String p_apellido) {
    this.apellido = p_apellido;
  }

  private void setEdad(int p_edad) {
    this.edad = p_edad;
  }

  public void setEstadoCivil(String p_estadoCivil) {
    this.estadoCivil = p_estadoCivil;
  }

  public void setEsposo(Hombre p_hombre) {
    this.esposo = p_hombre;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getApellido() {
    return this.apellido;
  }

  public int getEdad() {
    return this.edad;
  }

  public String getEstadoCivil() {
    return this.estadoCivil;
  }
}
