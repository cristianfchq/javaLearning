package POO.tres;

public class Operacion {
    
    //atributos
    int suma;
    int resta;
    int multiplicacion;
    int devision;

    //metodos

    //metodo para sumar ambos metodos

    public void sumar(int numero1, int numero2){
        suma = numero1 + numero2;
    }

    //metodo para restar ambos numeros

    public void restar(int numero1, int numero2){
        resta = numero1 - numero2;
    }

    //metodo para multiplicar ambos numeros

    public void muliplicar(int numero1, int numero2){
        multiplicacion= numero1 * numero2;
    }

    //metodo para dividir ambos numeros

    public void dividir(int numero1, int numero2){
        devision = numero1 / numero2;
    }

    public void mostrarResultados(){
        System.out.println("La suma es : " + suma);
        System.out.println("La resta es : " + resta);
        System.out.println("La multiplicacion es : " + multiplicacion);
        System.out.println("La division es : " + devision);
    }

}
