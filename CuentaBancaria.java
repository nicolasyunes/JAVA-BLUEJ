public class CuentaBancaria {
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    



    public CuentaBancaria(int nroCuenta, double saldo, Persona titular) {
        this.setSaldo(saldo);
        this.setTitular(titular);        
        this.setNroCuenta(nroCuenta);
    }

    public CuentaBancaria(int nroCuenta, Persona titular) {
        this.setNroCuenta(100);
        this.setTitular(titular);
        this.setSaldo(9999);
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

    public Persona getTitular() {
        return this.titular;
    }

    private void setTitular(Persona titular) {
        this.titular = titular;
    }
    
    public double depositar(double p_importe){
        setSaldo(this.saldo + p_importe);
        return getSaldo();
    }

    public double extraer(double p_importe){
        setSaldo(this.saldo - p_importe);
        return getSaldo();
    }


    public void mostrar(){
        System.out.println("******Cuenta Bancaria***********");
        System.out.println("Titular: " + this.getTitular().apeYNom() + this.getTitular().edad());
        System.out.println("Saldo: "  + this.getSaldo());
    }
    

}
