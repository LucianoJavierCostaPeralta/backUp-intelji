package Ejercicio9;
//Clase Hija
public class Triangulo extends  Poligono {
    //Atributos
    private double lado1;
    private double lado2;
    private double lado3;

    //Metodos
    //MetodoConstructor

    public Triangulo( double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    //Metodo Geters

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    //Metodo ToString

    @Override
    public String toString() {
        return "Triangulo : \n"+super.toString()+
                "\nLado1 : "+lado1+"\nLado2 : "+lado2+
                "\nLado3 : "+lado3;

    }

    //Metodo Area


    @Override
    public double area() {
        double p = (lado1+lado2+lado3)/2;
        return Math.sqrt((p*(p-lado1)*(p-lado2)*(p-lado3)));
    }
}
