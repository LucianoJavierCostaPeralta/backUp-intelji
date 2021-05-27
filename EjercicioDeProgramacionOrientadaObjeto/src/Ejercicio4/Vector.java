package Ejercicio4;

import java.util.ArrayList;

public class Vector {
    private ArrayList<Integer>arreglo = new ArrayList<Integer>();

    public Vector(ArrayList<Integer> arreglo) {
        this.arreglo = arreglo;
    }

    public Vector numero (int numero) {
        Vector resultado;
        ArrayList<Integer> arreglo2 = new ArrayList<Integer>();
        for (Integer i : arreglo) {
            int mult = i * numero;

            arreglo2.add(mult);
        }
        resultado = new Vector(arreglo2);

        return resultado;

    }

    public Vector sumar (Vector v){
        Vector resultado ;
        ArrayList<Integer>arreglo2 = new ArrayList<Integer>();

        if (this.arreglo.size()==v.arreglo.size()){
            for (Integer i : this.arreglo){
                for (Integer j : v.arreglo){
                    arreglo2.add(i+j);
                }
            }
        }

        resultado = new Vector(arreglo2);

        return resultado;


    }


    public String toString() {
        return "["+arreglo+"]";
    }
}
