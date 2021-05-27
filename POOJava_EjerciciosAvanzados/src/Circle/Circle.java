package Circle;

public class Circle {
    //Atributo
    private double radius = 1.0;

    //Metodos

    //Metodo Constructor por Defecto
    public Circle() {
    }

    //Metodo Constructor con Atributos de la Clase
    public Circle(double radius) {
        this.radius = radius;
    }

    //Metodos Geter & Seters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Metodo GetArea

    public double getArea (){
        return Math.PI*(Math.pow(this.radius,2));
    }

    //Metodo GetCircunferencia
    public double getCircunferencia (){
        return Math.PI*(2*this.radius);
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

