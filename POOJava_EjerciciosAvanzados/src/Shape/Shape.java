package Shape;
//Clase Padre
public abstract class Shape {
    //Atributos
    protected String color ;
    protected boolean filled ;

    //Metodos

    //Metodo Constructor Defaut
    public Shape() {
    }

    //Metodo Constructor con Atributos
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //Metodos Geter & Seters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //Metodos Abstractos

    public  double getArea (){
        return 0;
    }

    public  double getPerimetro(){
        return 0;
    }

    //Metodo ToString

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
