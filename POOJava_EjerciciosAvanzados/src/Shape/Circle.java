package Shape;
//Clase hija de "Shape"
public  class Circle extends  Shape{
    //Atributos
    protected double radius ;

    //Metodos

    //Metodo Constructor por defecto
    public Circle() {
    }

    //Metodo Constructor pasando el atributo de la clase "Circle"
    public Circle(double radius) {
        this.radius = radius;
    }

    //Metodo aplicando Herencia
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    //Metodos Geters & Seters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    //Sobre escritura de Metodos

    @Override
    public double getArea() {
        return Math.PI*(Math.pow(this.radius,2));
    }

    @Override
    public double getPerimetro() {
        return (Math.PI*2)*this.radius;
    }


    //Metodo ToString


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                "} " + super.toString();
    }
}
