/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Ejercicio3_EncapsulamientoClaseLibro {
    
        public static void main(String[] args) {
            
            Libro libro = new Libro();
            
            libro.setTitulo("Los días del Venado");
            libro.setAutor("Liliana Bodoc");
           // libro.setAnioPublicacion(2050);
            
            libro.mostrarInfo();
            libro.modificarAnio();
            libro.mostrarInfo();
        }
}
