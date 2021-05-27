package Ejercicio2;

public class Tablero {
    //Atributos
    private int x;
    private int y;

    //Metodos

    //Metodo Constructor
    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Metodo MoverArriba
    public void moverArriba(int incremento){
        y += incremento;
    }

    //Metodo MoverAbajo
    public void moverAbajo (int incremento){
        y -= incremento;
    }

    //Metodo MoverDerecha
    public void moverDerecha (int incremento){
        x += incremento;
    }

    //Metodo MoverIzquierda
    public void moverIzquierda (int incremento){
        x -= incremento;
    }

    //Metodos Geters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
