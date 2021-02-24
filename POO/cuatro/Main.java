package POO.cuatro;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String [] args){

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        Operacion op = new Operacion();
        
        System.out.println("La suma es : " + op.sumar(numero1, numero2));
        System.out.println("La resta es : " + op.restar(numero1, numero2));
        System.out.println("La multiplicacion es : " + op.muliplicar(numero1, numero2));
        System.out.println("La division es : " + op.dividir(numero1, numero2));

    }
    
}
