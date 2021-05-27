package Ejercicio3;

//Realizar un procedimiento que encuentre el número mayor de un vector de n números enteros de
//manera recursiva.

public class Ejercicio3 {

    public static void main(String[] args) {

        int a  []= {5,2,45,2,1};
        int i = 0;
        int max = a[0];

        findBiggestNumber(i, a, max);
    }

    private static void findBiggestNumber(int i, int[] a, int max) {

            if (i < a.length) {

            if (max < a[i]) {

                max = a[i];
            }
            System.out.println("Numero mayor en el array : " + max);
            findBiggestNumber((i + 1), a,max);
        }
    }
}

