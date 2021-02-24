package POO.seis;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Alejandro", 21);

        persona1.dni = "321654654654";

        persona1.correr();

        persona1.correr(2000);

        persona1.showDates();

        Persona persona2 = new Persona("321658654");

        persona2.nombre = "Cristian";

        persona2.edad = 22;

        persona2.correr();

        persona2.correr(4000);

        persona2.showDates();



    }

}