

/**
 *
 * @author Gianina
 */
public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos; 

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public Gallina() {
    }

    /**
     * @return the idGallina
     */
    public int getIdGallina() {
        return idGallina;
    }

    /**
     * @param idGallina the idGallina to set
     */
    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
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

    /**
     * @return the huevosPuestos
     */
    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    /**
     * @param huevosPuestos the huevosPuestos to set
     */
    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    
    public void mostrarEstado(){
        System.out.println("Información del animal: ");
        System.out.println("Id: " +idGallina);
        System.out.println("Cantidad de huevos puestos: " +huevosPuestos);
        
    }
    
    public void ponerHuevo(int huevo){
        huevosPuestos+= huevo;
    }
    public void envejecer(int anios){
        edad += anios; 
    }
    
    
    
}
