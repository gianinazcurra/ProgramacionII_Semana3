
import java.util.Scanner;

/**
 *
 * @author Gianina
 */
public class NaveEspacial {

    private String nombre;
    private int combustible;

    public NaveEspacial() {
    }

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the combustible
     */
    public int getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void despegar() {
        if (combustible >= 30) {
            System.out.println("La nave espacial " + nombre + " está despegando...");
            combustible -= 30; // Consumo de combustible
        } else {
            System.out.println("Proceda a la recarga. La cantidad de combustible es insuficiente para el despegue.");
        }
    }

    public void avanzar(int cantidad) {
        if (combustible >= cantidad) {
            System.out.println("Listos para avanzar " + cantidad + " unidades.");
            combustible -= cantidad;
        } else {
            System.out.println("El combustible no es suficiente, proceda a recargar.");
        }
    }

    public void recargarCombustible() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de combustible que desea recargar (máx 50): ");
        int cantidad = leer.nextInt();

        while (cantidad > 50) {
            System.out.println("Está superando las unidades de combustible permitidas. Ingrese un valor menor a 50:");
            cantidad = leer.nextInt();
        }

        combustible += cantidad;
        System.out.println("Combustible recargado. Total actual: " + combustible);
    }

    public void mostrarEstado() {
        System.out.println("La cantidad de combustible es de: " + combustible);
        
    }
    
}