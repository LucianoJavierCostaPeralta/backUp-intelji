package Shape;
//Clase hija de "Shape"
public class Rectangle extends  Shape {
    //Atributos
    protected double width ;
    protected double length;

    //Metodos

    //Metodo Constructor por Defecto
    public Rectangle() {
    }

    //Metodo Constructo pasando los atributos de la clase
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //Metodo Constructor aplicando Herencia
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //Metodos Geter & Seters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Sobre escritura de Metodos


    @Override
    public double getArea() {
        return this.width*this.length;
    }

    @Override
    public double getPerimetro() {
        return 2*(this.width+this.length);
    }


    //Metodo ToString

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "} " + super.toString();
    }
}
