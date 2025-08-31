

/**
 *
 * @author Gianina
 */
public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascota(){
     //constructor vacío   
    }

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
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
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("El nombre de la mascota es: " +nombre);
        System.out.println("Edad: " +edad);
        System.out.println("Especie: " +especie);
        
    }
    
    public void cumplirAnios(int anios){
        edad+=anios;
    }
}
