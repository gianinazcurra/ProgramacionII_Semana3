

/**
 *
 * @author Gianina
 */
public class Ejercicio4_GranjaDigital {

    public static void main(String[] args) {

        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();

        gallina1.setIdGallina(123);
        gallina1.setEdad(2);
        gallina1.setHuevosPuestos(7);

        gallina1.mostrarEstado();
        gallina1.envejecer(1);
        gallina1.setHuevosPuestos(234);
        System.out.println(
                "Al cabo de un año la gallina ha colocado: "
                + gallina1.getHuevosPuestos()
                + " teniendo ahora "
                + gallina1.getEdad()
                + " años de edad"
        );

        gallina2.setIdGallina(456);
        gallina2.setEdad(3);
        gallina2.setHuevosPuestos(345);

        gallina2.mostrarEstado();
        gallina2.envejecer(1);
        gallina2.setHuevosPuestos(678);
        System.out.println(
                "Al cabo de un año la gallina ha colocado: "
                + gallina2.getHuevosPuestos()
                + " teniendo ahora "
                + gallina2.getEdad()
                + " años de edad"
        );
    }

}
