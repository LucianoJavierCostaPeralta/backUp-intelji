package Ejercicio3;

public class MetodosSueltos {
    public static int generarNumeroAleatorio(int minimo , int maximo){
        int numero = (int)(Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1)));
        return numero;
    }
}
