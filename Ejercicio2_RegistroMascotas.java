

/**
 *
 * @author Gianina
 */
public class Ejercicio2_RegistroMascotas {
    
        public static void main(String[] args) {

    Mascota mascota = new Mascota();
    
    mascota.setNombre("Willy");
    mascota.setEdad(9);
    mascota.setEspecie("perro");
    
    Mascota mascota1= new Mascota();
    
    mascota1.setNombre("Jose");
    mascota1.setEdad(3);
    mascota1.setEspecie("Pájaro");
    
    mascota.mostrarInfo();
    mascota.cumplirAnios(1);
            System.out.println("La edad de Willy luego de cumplir años será de: " + mascota.getEdad());
  
    mascota1.mostrarInfo();
    mascota.cumplirAnios(1);
            System.out.println("La edad de Jose luego de cumplir años será de: " + mascota1.getEdad());
        
    }
    
    
    
}

