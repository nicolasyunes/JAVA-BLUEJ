public class CuentaCorriente {
    private Persona titular;
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;

    public CuentaCorriente(int nroCuenta, Persona titular) {
        setNroCuenta(nroCuenta);
        setTitular(titular);
        setSaldo(0);
        setLimiteDescubierto(500);
    }

    public CuentaCorriente(int nroCuenta, Persona titular,  double saldo) {
        setNroCuenta(nroCuenta);
        setTitular(titular);
        setSaldo(saldo);
        setLimiteDescubierto(500);
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

    public double getLimiteDescubierto() {
        return this.limiteDescubierto;
    }

    private void setLimiteDescubierto(double limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }

    public boolean puedeExtraer(double p_importe ){
        if (getLimiteDescubierto() < p_importe){
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
        setSaldo(getSaldo() - p__importe);
    }

    public void depositar(double p_importe){
        setSaldo(getSaldo() + p_importe);

    }

    public void extraer(double p_importe ){
        if (this.puedeExtraer(p_importe)==true){
           this.extraccion(p_importe);
        }else{
            System.out.println("El importe de extraccion sobrepasa el límite de descubierto!!");
            
        }

        this.mostrar();

    }

    public void mostrar() {
        System.out.println("-   Cuenta Corriente    -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - " + "Saldo: "  + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().apeYNom());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
        System.out.println("--------------------------------------------");

    }

}
