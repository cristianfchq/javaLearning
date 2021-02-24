package POO.Ejercicio4;

import java.util.Scanner;

public class Main {
    
    public static int indiceAtletaMasRapido(Atleta atletas[]) {
        float tiempo;
        int indice = 0;
        tiempo = atletas[0].getTiempoCarrera();

        for (int i = 1; i < atletas.length; i++) {
            if (atletas[i].getTiempoCarrera() < tiempo) {
                tiempo = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }

        return indice;
    }

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String nombre;

        int numeroAtleta, cantidadAtletas, indiceDelAtleta;

        float tiempoCarrera;

        System.out.println("Digite el numero de Atletas a participar : ");
        cantidadAtletas = entrada.nextInt();

        Atleta atletas[] = new Atleta[cantidadAtletas];

        for (int i = 0; i < atletas.length; i++) {

            System.out.println("\nDigite los datos del atleta " + (i + 1) + " : ");
            System.out.println("Introduzca numero de atletas : ");
            numeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Introduzca nombre de Atleta : ");
            nombre = entrada.nextLine();
            System.out.println("Introduzca tiempo de carrera : ");
            tiempoCarrera = entrada.nextFloat();

            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);

            
        }

        indiceDelAtleta = indiceAtletaMasRapido(atletas);

        System.out.println("\nEl coche mas barato es : " + atletas[indiceDelAtleta].mostrarDatosGanador());


    }

}
