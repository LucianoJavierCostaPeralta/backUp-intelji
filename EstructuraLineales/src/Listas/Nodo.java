package Listas;

public class Nodo {

    public Nodo siguiente ;
    public String valor  ;

    public Nodo(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }


    @Override
    public String toString() {
        return this.valor;
    }
}
