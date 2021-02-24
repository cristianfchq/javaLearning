
/**
 * Construir un programa que calcule el area y el perimetro de un cuadrilatero 
 * dada la longitud de sus lados. Los valores de la longitud
 * deberan introducirse por linea de ordenes. Si es un cuadrado, solo de proporcionara la longitud de uno 
 * de los lados al construtor
 */
package POO.Ejercicio1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        Cuadrilatero C1;
        float lado1;
        float lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite lado1 : "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite lado2 : "));

        if (lado1 == lado2){
            C1 = new Cuadrilatero(lado1);
        } else {
            C1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El perimetro es : " + C1.getPerimetro());
        System.out.println("El area es : " + C1.getArea());
    }
    
}


// for (int i = 0; i <= 10; i++) {
        //     spaceship.moveToRight();
        //     Thread.sleep(WAIT_PERIOD);
        //     print(space.show());
        //     System.out.println("( " + spaceship.getPosX() + " , " + spaceship.getPosY() + " )");
        // }