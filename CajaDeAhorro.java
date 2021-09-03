public class CajaDeAhorro {
    private Persona titular ;
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles; 

    public CajaDeAhorro(Persona titular, int nroCuenta, double saldo) {
        setExtraccionesPosibles(10);
        setNroCuenta(nroCuenta);
        setSaldo(saldo);
        setTitular(titular);
    }

    

    public CajaDeAhorro(Persona titular, int nroCuenta) {
        setExtraccionesPosibles(10);
        setSaldo(0);
        setNroCuenta(nroCuenta);
        setTitular(titular);
    }


    public Persona getTitular() {
        return this.titular;
    }

    private void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNroCuenta() {
        return this.nroCuenta;
    }

    private void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getExtraccionesPosibles() {
        return this.extraccionesPosibles;
    }

    private void setExtraccionesPosibles(int extraccionesPosibles) {
        this.extraccionesPosibles = extraccionesPosibles;
    }
    /**
     * verifica si puede o no realizar la extraccion
     * @param p_importe
     * @return
     */
    public boolean puedeExtraer(double p_importe ){
        if (getSaldo() < p_importe    || getExtraccionesPosibles() == 0 ){
            return false;
        }else{
            return true;
        }
    }
    /**
     * metodo que efectiviza la operacion correspondiente.
     * @param p__importe
    */
    public void extraccion ( double p__importe){
        setSaldo(getSaldo()-p__importe);
        setExtraccionesPosibles(extraccionesPosibles-1);
    }

    /**
     * Verifica si puede extraer el monto solicitado.
     * En caso de puedeExtrer == true, llama al metodo para realizar la extraccion.
     * en caso de puedeExtraer == false, se verifica que atributo no se verifica y envia el mensaje correspondiente
     * por ultimo vuelve a llamar el metodo mostrar para tener informacion en  cada solicitud;
     * @param p_importe
     */
    public void extraer(double p_importe ){
        if (this.puedeExtraer(p_importe)==true){
           this.extraccion(p_importe);
        }else{
            if(getExtraccionesPosibles() == 0){
                System.out.println("No tiene habilitadas mas extracciones!");
            }else{
                if (getSaldo()   <  p_importe){
                    System.out.println("No puede extraer mas que el saldo!");
                }
            }
        }

        this.mostrar();

    }

    public void depositar(double p_importe){
        setSaldo(getSaldo() + p_importe);

    }

    public void mostrar(){
        System.out.println("**CAJA DE AHORRO**");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - " + "Saldo: " + this.getSaldo() );
        System.out.println("Titular: " + this.titular.apeYNom());
        System.out.println("Extracciones posibles: " + this.extraccionesPosibles);
        System.out.println("-------------------------------------");
    }





}
