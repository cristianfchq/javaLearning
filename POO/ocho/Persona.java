package POO.ocho;

public class Persona {
    
    private final String nombre;
    private int edad;

    //constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es : " + this.nombre);
        System.out.println("La edad es : " + this.edad);
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

}
