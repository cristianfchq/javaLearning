package POO.ocho;

public class Main {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Cristian", 21);

        persona1.mostrarDatos();

        persona1.setEdad(22);

        persona1.mostrarDatos();

        System.out.println("su nueva edad es : " + persona1.getEdad());

    }
}
