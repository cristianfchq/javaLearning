package POO.cinco;

/**
 * Persona
 */
public class Persona {

    /**
     * Atributos
     */

    String nombre;
    int edad;

    /**
     * metodos
     */

    /**
     * Constructor
     */

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es : " + this.nombre);
        System.out.println("La edad es : " + this.edad);
    }

}