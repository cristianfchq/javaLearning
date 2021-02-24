/**
 * 
 */

package POO.Ejercicio3;

import java.util.Scanner;

public class Main {

    public static int indiceCocheMasBarato(Vehiculo coches[]) {
        float precio;
        int indice = 0;
        precio = coches[0].getPrecio();

        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }

        return indice;
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String marca, modelo;
        float precio;
        int numeroVehiculos;
        int indiceDelBarato;

        System.out.println("Digite la cantidad de Vehiculos: ");
        numeroVehiculos = entrada.nextInt();

        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        for (int i = 0; i < coches.length; i++) {
            marca = entrada.nextLine();
            System.out.println("\nLas caracteriticas el coche " + (i + 1) + " : ");
            System.out.println("Introduzca Marca");
            marca = entrada.nextLine();
            System.out.println("Introduzca Modelo");
            modelo = entrada.nextLine();
            System.out.println("Introduzca Precio");
            precio = entrada.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio);

        }

        indiceDelBarato = indiceCocheMasBarato(coches);

        System.out.println("\nEl coche mas barato es : " + coches[indiceDelBarato].mostrarDatos());

    }

}
