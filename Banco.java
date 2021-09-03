public class Banco {
    public static void main(String[] args){
        Persona unaPersona = new Persona(391874444, "Juan", "Perez", 34);
        CajaDeAhorro unaCajaDeAhorro = new CajaDeAhorro(unaPersona, 11223344);
        unaCajaDeAhorro.mostrar();

        System.out.println("--Deposito ");
        unaCajaDeAhorro.depositar(1000);
        unaCajaDeAhorro.mostrar();

        System.out.println("--Extraccion MONTO INSUFICIENTE");
        unaCajaDeAhorro.extraer(2000);
        

        System.out.println("--Extraccion NRO DE EXTRACCIONES");
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.extraer(20);

        CuentaCorriente unaCuentaCorriente = new CuentaCorriente(123123, unaPersona);
        unaCuentaCorriente.mostrar();

        System.out.println("--->Deposito ");
        unaCuentaCorriente.depositar(1000);
        unaCuentaCorriente.mostrar();

        System.out.println("---Extraccion sin exito");
        unaCuentaCorriente.extraer(2000);

        System.out.println("---Extraccion exitosa");
        unaCuentaCorriente.extraer(200);
        System.out.println("--FIN---");

    }
}
