package Ejercicio3;

public class principal {
    public static void main(String[] args) {
        Fraccion fraccion = new Fraccion(2,1);
        Fraccion fraccion1 = new Fraccion(4,3);
        System.out.println(fraccion.sumaFrancciones(fraccion1));
        fraccion.toString();

        System.out.println(fraccion.multiFraccion(fraccion1));
        fraccion.toString();
    }
}
