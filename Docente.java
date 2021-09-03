public class Docente {
    private String nombre ; 
    private String grado ; 
    private double sueldoBasico;
    private double asignacionFamiliar;

   

    public Docente(String nombre, String grado, double sueldoBasico, double asignacionFamiliar) {
        setAsignacionFamiliar(asignacionFamiliar);
        setGrado(grado);
        setNombre(nombre);
        setSueldoBasico(sueldoBasico);
    }


    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return this.grado;
    }

    private void setGrado(String grado) {
        this.grado = grado;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    private void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getAsignacionFamiliar() {
        return this.asignacionFamiliar;
    }

    private void setAsignacionFamiliar(double asignacionFamiliar) {
        this.asignacionFamiliar = asignacionFamiliar;
    }

    public double calcularSueldo() {
        double calcular = this.getSueldoBasico() + this.getAsignacionFamiliar() ; 
        return calcular ; 
    }
    
}
