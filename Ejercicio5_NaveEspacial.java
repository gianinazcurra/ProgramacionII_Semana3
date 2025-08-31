
/**
 *
 * @author Gianina
 */
public class Ejercicio5_NaveEspacial {

    public static void main(String[] args) {

        NaveEspacial naveEspacial = new NaveEspacial();

        naveEspacial.setNombre("Apolo 20");
        naveEspacial.mostrarEstado();
        naveEspacial.despegar();
        naveEspacial.recargarCombustible();
        naveEspacial.despegar();
        naveEspacial.avanzar(50);
//        naveEspacial.mostrarEstado();
    }
}
