package Ejercicio5;

public class TrianguloIsosceles {
    //Atributo
    private double base ;
    private double lado ;

    //Metodos
    //MetodoConstructor
    public TrianguloIsosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    //Metodo Obtener Perimetro
    public  double obtenerPerimetro (){
        double perimetro = 2*lado+base;
        return perimetro;
    }

    //Metodo Obtemer Area
    public double obtenerArea (){
        double area = (base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
        return area;
    }

    public String mostrarDatos (){
        return "\nBase : "+base+"\nLado : "+lado+"\nPerimetro : "+obtenerPerimetro()+"\nArea : "+obtenerArea();
    }
}
