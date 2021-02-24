/**
 * SOBRECARGA DE METODOS
 */

package POO.seis;

/**
 * Persona
 */
public class Persona {

    String nombre;
    int edad;
    String dni;

    /**
     * Metodos
     */

    // sobrecarga del metodo constructor

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni){
        this.dni = dni;
    }

    // sobrecarga del metodo correr

    public void correr(){
        System.out.println("Soy " + this.nombre + " y tengo " + this.edad + " anios");
    }
    
    public void correr(int km){
        System.out.println("He corrido " + km + "km");
    }

    public void showDates(){
        System.out.println("Nombre : " + this.nombre);
        System.out.println("Edad : " + this.edad);
        System.out.println("DNI : " + this.dni);
        System.out.println("\n\n");
    }
    
}
