package GeometricObject;

public abstract class Circle implements GeometricObject{
    //Atributos
    protected double radius = 1.0;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (Math.PI*2)*this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI*(Math.pow(this.radius,2));
    }

    //Sobre escritura de Metodos
    public abstract double resize(int percent);
}
