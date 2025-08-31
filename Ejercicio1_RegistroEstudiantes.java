

/**
 *
 * @author Gianina
 */
public class Ejercicio1_RegistroEstudiantes {
   
    
    public static void main(String[] args) {
    
    Estudiante estudiante = new Estudiante();
    
    estudiante.setNombre("Gianina");
    estudiante.setApellido("Azcurra");
    estudiante.setCurso("Programación");
    estudiante.setCalificacion(8.0);
    
        System.out.println("Información Inicial: ");
    estudiante.mostrarInfo();
    
        System.out.println("Información luego de subir la calificación: ");
        
    estudiante.subirCalificacion(2.0);
    estudiante.mostrarInfo();
    
        System.out.println("Información luego de disminuir la calificación: ");
    estudiante.bajarCalificacion(3.0);
    estudiante.mostrarInfo();
    }
    
}
