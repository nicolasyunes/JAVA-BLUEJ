public class Paciente {
    private int historiaClinica;
    private String nombre; 
    private String domicilio;
    private Localidad p_localidadNacido;
    private Localidad p_localidadVive;




    public Paciente(int historiaClinica, String nombre, String domicilio, Localidad p_localidadNacido , Localidad p_localidadVive) {
        setDomicilio(domicilio);
        setHistoriaClinica(historiaClinica);
        setNombre(nombre);
        
    }

    public Localidad getLocalidadNacido() {
        return this.p_localidadNacido;
    }

    private void setLocalidadNacido(Localidad p_localidadNacido) {
        this.p_localidadNacido = p_localidadNacido;
    }

    public Localidad getLocalidadVive() {
        return this.p_localidadVive;
    }

    private void setLocalidadVive(Localidad p_localidadVive) {
        this.p_localidadVive = p_localidadVive;
    }


    public int getHistoriaClinica() {
        return this.historiaClinica;
    }

    private void setHistoriaClinica(int historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    private void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public  String cadenaDeDatos() {
        return (this.getNombre() + "......" + this.getHistoriaClinica() + "-......" + this.getDomicilio() + " ..." + this.getLocalidadNacido().getNombre() + " - " + this.getLocalidadNacido().getProvincia() );
    }

    public void mostrarDatosPantalla() {
        System.out.println("Paciente: " + this.getNombre() + "Historia Clinica: " + this.getHistoriaClinica() + "Domicilio: " + this.getDomicilio());
        this.getLocalidadNacido().mostrar();
    }


}
