package Circle2;

public class Circle {
    //Atributos
    private  double radius  = 1.0 ;
    private String color = "red";

    //Metodos

    //Metodo Constructor por defaut
    public Circle() {
    }

    //Metodo Constructo con el Atributo "Radius"
    public Circle(double radius) {
        this.radius = radius;
    }

    //Metodo Constructor con todos los Atributos de la clase "Circle"
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //Metodo getArea
    public double getArea (){
        return Math.PI*(Math.pow(this.radius,2));
    }

    //Metodo ToString


    @Override
    public String toString() {
        return "\nRadio : "+radius+
                "\nColor : "+color;
    }
}
