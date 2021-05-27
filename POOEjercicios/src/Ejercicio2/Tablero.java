package Ejercicio2;
/*Construir un programa que permita dirigir el movimiento de un objeto dentro de
* un tablero y actualice su posicion dentro del mismo . Los movimientod posibles son :
* ARRIBA , ABAJO , DERECHE , IZQUIERDA . Tras cada movimiento el programa mostrara
* la nueva direccion elegida y las cordenadas de situacion del objeto dentro del
* tablero */
public class Tablero {
    //Atributo
    private int x;
    private int y;

    //Metodo constructor

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Metodo moverArriba
    public void moverArriba (int incremento){
        y += incremento;
    }

    //Metodo moverAbajo
    public void moverAbajo(int incremento){
        y -= incremento;
    }

    //Metodo moverDerecha
    public void moverDerecha(int incremento){
        x += incremento;
    }

    //Metodo moverIzquierda
    public void moverIzquierda(int incremento){
        x -= incremento;
    }

    //Metodos get


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
