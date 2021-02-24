package POO.Ejercicio1;

public class Cuadrilatero {
    
    //Atributos
    private float lado1;
    private float lado2;

    //metodos

    //metodo constructor cuando se un cuadrilatero
    public Cuadrilatero(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //metodo constructor cuando tengas lados iguales
    public Cuadrilatero(float lado1){
        this.lado1 = lado1;
        this.lado2 = lado1;
    }

    public float getPerimetro(){
        float perimetro = 2 * (lado1 + lado2);
        return perimetro; 
    }

    public float getArea(){
        float area = lado1 * lado2;
        return area;
    }


}
