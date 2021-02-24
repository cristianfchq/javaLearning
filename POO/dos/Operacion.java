package POO.dos;

import javax.swing.JOptionPane;

public class Operacion {
    
    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int devision;

    //metodos

    //Metodo para pedirle al usuario que nos digite dos numero

    public void leerNumero(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        // numero1 = 1;
        // numero2 = 2;
    }

    //metodo para sumar ambos metodos

    public void sumar(){
        suma = numero1 + numero2;
    }

    //metodo para restar ambos numeros

    public void restar(){
        resta = numero1 - numero2;
    }

    //metodo para multiplicar ambos numeros

    public void muliplicar(){
        multiplicacion= numero1 * numero2;
    }

    //metodo para dividir ambos numeros

    public void dividir(){
        devision = numero1 / numero2;
    }

    public void mostrarResultados(){
        System.out.println("La suma es : " + suma);
        System.out.println("La resta es : " + resta);
        System.out.println("La multiplicacion es : " + multiplicacion);
        System.out.println("La division es : " + devision);
    }

}
