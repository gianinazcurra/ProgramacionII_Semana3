
import java.util.Scanner;

/**
 *
 * @author Gianina
 */
public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the anioPublicacion
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * @param anioPublicacion the anioPublicacion to set
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    
    public void mostrarInfo(){
        
        System.out.println("Nombre del libro: " +titulo);
        System.out.println("Autor: " +autor);
     //   System.out.println("Año de publicación: " + anioPublicacion);
    }
    public void modificarAnio() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el año de publicación del libro: ");
        int anioPublicacion = leer.nextInt();

        while (anioPublicacion <= 0 || anioPublicacion > 2025) {
            System.out.println("Incorrecto, ingrese un año válido: ");
            anioPublicacion = leer.nextInt();
        }

        this.anioPublicacion = anioPublicacion;
        System.out.println("Año de publicación correcto: " + this.anioPublicacion);
    }

}

