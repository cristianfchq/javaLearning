/**
 * Construir un programa que permita dirigir el movimiento de un objeto
 * dentro de un tablero y actualice su posicion dentro del mismo. Los movimientos
 * posibles son ARRIBA, ABAJO, IZQUIERDA, DERECHA. Tras cada movimiento el
 * programa mostrara la nueva direccion elegida y las coordenadas de situacion del 
 * obtejo dentro del tablero.
 */

package POO.Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Tablero t1;

        int x, y, opcion, incremento = 0;

        System.out.println("Digite la coordenada inicial de X : ");
        x = entrada.nextInt();

        System.out.println("Digite la coordenada inicial de Y : ");
        y = entrada.nextInt();

        //posicion inicial del objeto en el tablero

        t1 = new Tablero(x, y);

        System.out.println("Posicion actual en X : " + t1.getX());
        System.out.println("Posicion actual en Y : " + t1.getY());

        do {

            System.out.println("\n\tMENU : ");
            System.out.println("1. Mover hacia ARRIBA");
            System.out.println("2. Mover hacia ABAJO");
            System.out.println("3. Mover hacia DERECHA");
            System.out.println("4. Mover hacia IZQUIERDA");
            System.out.println("5. SALIR");
            System.out.println("Digite una opcion");
            opcion = entrada.nextInt();

            if (opcion < 5) {
                System.out.println("Digite la cantidad de espacios a moverse : ");
                incremento = entrada.nextInt();
            }

            switch (opcion) {
                case 1: t1.moverArriba(incremento);
                    break;
                case 2: t1.moverAbajo(incremento);
                    break;
                case 3: t1.moverDerecha(incremento);
                    break;
                case 4: t1.moverIzquierda(incremento);
                    break;
                case 5: break;
                default: System.out.println("Opcion incorrecta digite nuevamente : ");
                    break;
            }

            System.out.println("Posicion actual en X : " + t1.getX());
            System.out.println("Posicion actual en Y : " + t1.getY());
            
        } while (opcion != 5);

    }
    
}
