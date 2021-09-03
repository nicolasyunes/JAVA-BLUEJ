public class CrearCuentaBancaria {
    public static void main(String[] args) {
        Persona titular = new Persona(391877, "Juan", "Perez", 50);
        CuentaBancaria unaCuenta = new CuentaBancaria(111111, titular);
        unaCuenta.mostrar();
        unaCuenta.depositar(44444);
        unaCuenta.mostrar();
        System.out.println("-----Fin--------");
    }
}
