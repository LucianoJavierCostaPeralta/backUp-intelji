package MiembrosEstaticosDeClases;

import javax.swing.*;

public class Estatico {
    //Atributo estatico
    private static String frase = "Primera frase ";

    //Metodo estatico

    public static int sumar(int n1 , int n2){
        int suma = n1+n2;
        return suma;
    }

    public static void main(String[] args) {
        //Creamos un objeto
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();

        ob2.frase="Segunda frase";

        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
        System.out.println(Estatico.frase);

        System.out.print("La suma es : "+Estatico.sumar(3,7));

        




    }
}
