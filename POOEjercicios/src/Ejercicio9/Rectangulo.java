package Ejercicio9;
//Clase Hija
public class Rectangulo extends  Poligono {
    //Atributos
    private  double lado1;
    private  double lado2;

    //Metodos

    //Metodo Constructor

    public Rectangulo( double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Metodo Geter

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    //Metodo ToString

    @Override
    public String toString() {
        return "Rectangulo : \n"+super.toString()+
                "\nLado1 : "+lado1+"\nLado2 : "+lado2;

    }

    //Metodo Area


    @Override
    public double area() {
        return lado1*lado2;
    }
}
