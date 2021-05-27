package Ejercicio3;

public class Fraccion {
    private int dividendo ;
    private int divisor ;

    public Fraccion() {
    }

    public Fraccion(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public int getDivisor() {
        return divisor;
    }


    public String toString() {
        return +divisor+"/"+dividendo;
    }

    public Fraccion sumaFrancciones (Fraccion f){
        Fraccion suma = new Fraccion();
        suma.dividendo=this.dividendo*f.dividendo;
        suma.divisor=(this.divisor*f.dividendo)+(this.dividendo*f.divisor);
        return suma;

    }

    public Fraccion multiFraccion (Fraccion f){
        Fraccion mult = new Fraccion();
        mult.dividendo=this.dividendo*f.dividendo;
        mult.divisor = this.divisor*f.divisor;
        return mult;
    }
}
