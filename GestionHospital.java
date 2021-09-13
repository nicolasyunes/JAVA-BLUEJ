
/**
 * Clase ejecutable GestionHospital.
 * 
 * @author Yunes Nicolas
 * @version 2021
 */

import java.util.Scanner;
 
 public class GestionHospital{
    
    public static void main (String args[]){
        
        
        Localidad loc1 = new Localidad("Monte Caseros", "Corrientes");
        Localidad loc2 = new Localidad("Corrientes Capital","Corrientes");
        
        Paciente pac1 = new Paciente(57869,"Juan Manuel Ortigoza","Bulevar 3 de Abril", loc1, loc2);
        
        Hospital hosp1 = new Hospital("Garrahan", "Leonardo Ruiz");
        
        loc1.mostrar();

        pac1.mostrarDatosPantalla();
        
        pac1.cadenaDeDatos();
    
        hosp1.consultaDatosFiliatorios(pac1);
    }}