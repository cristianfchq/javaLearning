package POO.Ejercicio4;

public class Atleta {

    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    
    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera(){
        return tiempoCarrera;
    }

    public String mostrarDatosGanador(){
        return "\nNombre de Atleta : " + nombre + "\nNumero de atleta : " + numeroAtleta + "\nEl tiemo realizado : " + tiempoCarrera;
    }
}