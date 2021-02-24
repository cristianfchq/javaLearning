package POO.nueve;

public class Estatico {
    
    private static String frase = "primera frase";


    public static int sumar(int i, int j) { 
        int suma = i + j;
        return suma;        
    }
    
    public static void main(String[] args) {
        
        // Estatico ob1 = new Estatico();  //ya no es necesario instanciar

        // Estatico ob2 = new Estatico();  //ya no es necesario instanciar

        // ob2.frase = "segunda frase";

        // System.out.println(ob1.frase);
        // System.out.println(ob2.frase);


        System.out.println(Estatico.frase);
        System.out.println(Estatico.frase);

        

        System.out.println("La suma es  : " + Estatico.sumar(10,10));

    }

}
