package P1;

public class Clase1 {
    int a ;
    String cadena;
    double r ;

    public Clase1(int a, String cadena, double r) {
        this.a = a;
        this.cadena = cadena;
        this.r = r;
    }

    public int getA() {
        return a;
    }


    @Override
    public String toString() {
        return "Clase1{" +
                "a=" + a +
                ", cadena='" + cadena + '\'' +
                ", r=" + r +
                '}';
    }

    public String getCadena() {
        return cadena;
    }

    public double getR() {
        return r;
    }
}
