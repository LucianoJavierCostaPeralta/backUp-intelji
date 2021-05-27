package Ejercicio4;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer>array = new ArrayList<Integer>();
        array.add(3);
        array.add(5);
        array.add(6);

        Vector vector = new Vector(array);

        ArrayList<Integer>array2 = new ArrayList<Integer>();
        array2.add(1);
        array2.add(2);
        array2.add(9);

        Vector vector2 = new Vector(array2);

        System.out.println(vector.numero(5));
        vector.toString();

        System.out.println(vector.sumar(vector2));
        vector.toString();


    }
}
