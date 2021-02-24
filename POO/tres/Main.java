package POO.tres;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String [] args){

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        Operacion op = new Operacion();

        op.sumar(numero1, numero2);
        op.restar(numero1, numero2);
        op.muliplicar(numero1, numero2);
        op.dividir(numero1, numero2);

        op.mostrarResultados();

    }
    
}
