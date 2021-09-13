public class Hombre {

  private String nombre;
  private String apellido;
  private int edad;
  private String estadoCivil;
  private Mujer esposa;

  public Hombre(String p_nombre, String p_apellido, int p_edad) {
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setEdad(p_edad);
    this.setEstadoCivil("Soltero");
  }

  public Hombre(
    String p_nombre,
    String p_apellido,
    int p_edad,
    Mujer p_esposa
  ) {
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setEdad(p_edad);
    this.setEstadoCivil("Casado");
    this.setEsposa(p_esposa);
  }

  public void casarseCon(Mujer p_mujer) {
    if (this.getEstadoCivil() == "Soltero") {
      this.setEsposa(p_mujer);
      this.setEstadoCivil("Casado");
      this.esposa.setEstadoCivil("Casada");
      this.esposa.setEsposo(this);
    } else {
      System.out.println("No puede casarse si no está divorciado o soltero");
    }
  }

  public void divorcio() {
    this.esposa = null;
    this.setEstadoCivil("Divorciado");
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

  public void casadoCon() {
    if (this.getEstadoCivil() == "Casado") {
      System.out.println(
        this.datos() + " esta casado con " + this.esposa.datos()
      );
    } else {
      System.out.println(this.datos() + "   no esta casado");
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

  public void setEsposa(Mujer p_esposa) {
    this.esposa = p_esposa;
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
