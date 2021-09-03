public class Escuela {
    private String nombre;
    private String domicilio;
    private String director;
    
    

    public Escuela(String nombre, String domicilio, String director) {
        setDirector(director);
        setNombre(nombre);
        setDomicilio(domicilio);
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

    public String getDirector() {
        return this.director;
    }

    private void setDirector(String director) {
        this.director = director;
    }

    public void imprimiRecibo(Docente p_docente){
        System.out.println("Escuela: " + this.getNombre() + "  " + "Domicilio: " + this.getDomicilio() + "  " + "Director: " + this.getDirector());
        System.out.println("------------------------------------------------");
        System.out.println("Docente: " + p_docente.getNombre());
        System.out.println("Sueldo:..............$ "+p_docente.calcularSueldo());
        System.out.println("Sueldo Basico:.......$"+ p_docente.getSueldoBasico());
        System.out.println("Asignación familiar:..$" +p_docente.getAsignacionFamiliar());
    }



    
}
