package Ejercicio5;

import java.util.Scanner;

public class Principal {
    public  static double mayorArea (TrianguloIsosceles trianguloIsosceles[]){
        double area ;
        area = trianguloIsosceles[0].obtenerArea();
        for (int i = 1 ; i < trianguloIsosceles.length ; i ++){
            if (trianguloIsosceles[i].obtenerArea() > area){
                area = trianguloIsosceles[i].obtenerArea();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        double base , lado ;
        int nTriangulos ;

        System.out.print("Digite la cantidad de triangulos a  ingresar  : ");
        nTriangulos = entreda.nextInt();
        TrianguloIsosceles trianguloIsosceles [] = new TrianguloIsosceles[nTriangulos];
        for (int i = 0 ; i < trianguloIsosceles.length ; i ++){
            System.out.println("\nDigite los valores para el triangulo   "+(i+1));
            System.out.print("Introduzca la base : ");
            base = entreda.nextDouble();
            System.out.print("Introduzca el lado : ");
            lado = entreda.nextDouble();

            trianguloIsosceles[i] = new TrianguloIsosceles(base,lado);

            System.out.println("El perimetro del triangulo es : "+trianguloIsosceles[i].obtenerPerimetro());
            System.out.println("El area del triangulo es : "+trianguloIsosceles[i].obtenerArea());
        }


        System.out.println("EL area deltriangulo de mayor superficie es : "+mayorArea(trianguloIsosceles));


    }
}
