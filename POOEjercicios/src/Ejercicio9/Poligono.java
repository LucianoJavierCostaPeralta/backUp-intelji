package Ejercicio9;
//Clase Padre - Clase Abstracta
public abstract class Poligono {
    protected int numeroLados ; //Atributo

    //Metodo Constructor


    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    //Metodo Geter

    public int getNumeroLados() {
        return numeroLados;
    }

    //Mostrar Datos

    @Override
    public String toString() {
        return "\nNumero de Lados : "+numeroLados;
    }

    //Declaramos el metodo Area como Abstracto

    public abstract double area ();
}
