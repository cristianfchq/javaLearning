package POO.dos;

public class Main {

    public static void main(String [] args){

        Operacion op = new Operacion();

        op.leerNumero();
        
        op.sumar();
        op.restar();
        op.muliplicar();
        op.dividir();

        op.mostrarResultados();

    }
    
}
