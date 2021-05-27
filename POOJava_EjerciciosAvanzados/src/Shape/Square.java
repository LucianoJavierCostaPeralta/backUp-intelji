package Shape;
//Clase hija de "Rectagle"
public class Square extends  Rectangle{
    //Atributos
    private double side ;

    //Metodos

    //Metodo Constructor por defecto
    public Square() {
    }

    //Metodo Constructor con Atributo de la clase
    public Square(double side) {
        this.side = side;
    }

    //Metodo Constructor Aplicando Herencia


    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        this.side = side;
    }

    //Metodo Geters & Seters
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //Sobre escritura de Metodos


    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }


    //Metodo ToString

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "} " + super.toString();
    }
}
