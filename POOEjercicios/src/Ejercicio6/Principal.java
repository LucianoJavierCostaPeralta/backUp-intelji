package Ejercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        /*
        Numero1 = a+b ;
        numero2 = c+d; */
        int opcion ,numero;
        double a,b,c,d;
        NumeroComplejo numero1,numero2,suma,mult;

        do {

            System.out.println("\n Operaciones con numeros complejos .");
            System.out.println("1. Sumar 2 numeros complejos ");
            System.out.println("2. Multiplicar 2 numeros complejos ");
            System.out.println("3. Comparar 2 numeros complejos ");
            System.out.println("4. Multiplicar un numero complejo por un entero ");
            System.out.println("5. salir ");
            System.out.print("\nDigite la opcion de menu  : ");
            opcion = entreda.nextInt();

            switch (opcion){
                case 1 :
                    System.out.println("Digite el primer numero complejo .");
                    System.out.print("Digite la parte real : ");
                    a = entreda.nextDouble();
                    System.out.print("Digite la parte imaginaria : ");
                    b = entreda.nextDouble();

                    System.out.println("Digite el segundo numero complejo .");
                    System.out.print("Digite la parte real : ");
                    c = entreda.nextDouble();
                    System.out.print("Digite la parte imaginaria : ");
                    d= entreda.nextDouble();
                    numero1 = new NumeroComplejo(a,b);
                    numero2 = new NumeroComplejo(c,d);
                    suma = numero1.CalcularSuma(numero2);
                    System.out.println("\nLa suma es "+suma.getA()+" + "+suma.getB()+" i ");
                    break;
                case 2 :
                    System.out.println("Digite el primer numero complejo .");
                    System.out.print("Digite la parte real : ");
                    a = entreda.nextDouble();
                    System.out.print("Digite la parte imaginaria : ");
                    b = entreda.nextDouble();

                    System.out.println("Digite el segundo numero complejo .");
                    System.out.print("Digite la parte real : ");
                    c = entreda.nextDouble();
                    System.out.print("Digite la parte imaginaria : ");
                    d= entreda.nextDouble();
                    numero1 = new NumeroComplejo(a,b);
                    numero2 = new NumeroComplejo(c,d);
                    mult = numero1.CalcularProducto(numero2);
                    System.out.println("\nLa Multiplicacion es : "+mult.getA()+" * "+mult.getB()+" i ");
                    break;
                case 3 :
                    System.out.println("Digite el primer numero complejo .");
                    System.out.print("Digite la parte real : ");
                    a = entreda.nextDouble();
                    System.out.print("Digite la parte imaginaria : ");
                    b = entreda.nextDouble();

                    System.out.println("Digite el segundo numero complejo .");
                    System.out.print("Digite la parte real : ");
                    c = entreda.nextDouble();
                    System.out.print("Digite la parte imaginaria : ");
                    d= entreda.nextDouble();
                    numero1 = new NumeroComplejo(a,b);
                    numero2 = new NumeroComplejo(c,d);
                    if (numero1.comprobarIgualdad(numero2)){
                        System.out.println("Los numeros complejos son iguales ");
                    }
                    else {
                        System.out.print("Los numeros complejos no son iguales ");
                    }
                    break;
                case  4 :
                    System.out.println("Digite el  numero complejo .");
                    System.out.print("Digite la parte real : ");
                    a = entreda.nextDouble();
                    System.out.print("Digite la parte imaginaria : ");
                    b = entreda.nextDouble();

                    numero1 = new NumeroComplejo(a,b);
                    System.out.print("\nAhora digita un numero entero : ");
                    numero = entreda.nextInt();

                    mult = numero1.multPorEntero(numero);

                    System.out.println("\nLa Multiplicacion es : "+mult.getA()+" * "+mult.getB()+" i ");
                    break;


            }


        }while (opcion != 5);
    }
}
