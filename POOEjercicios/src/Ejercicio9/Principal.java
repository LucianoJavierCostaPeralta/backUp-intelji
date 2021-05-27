package Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

//ClasePrincipal -Ejecutable
public class Principal {
    //Arreglos Dinamicos
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    //Metodo Scaner
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {//Main
        //LLenar El Poligono
        llenarPoligono();

        //Mostrar los datos y area , de cada Poligono
        mostrarResultados();

    }

    //Metodo Llenar Triangulo
    public static void llenarPoligono (){
        int opcion ;
        char respuesta ;

      do {

          do {
              System.out.println("Digite el Poligono deseado.");
              System.out.println("1.Triangulo.");
              System.out.println("2.Rectangulo.");
              System.out.print("Opcion : ");
              opcion = entrada.nextInt();
          }while (opcion < 1 || opcion >2);

          switch (opcion){
              case 1 :llenarTriangulo(); //Llenar un Triangulo
                  break;
              case 2 : llenarRectangulo(); //Llenar un Rectangulo
                  break;
          }

          System.out.print("\nDesea introducir otro Poligono (s/n) : ");
          entrada.nextLine();
         respuesta = entrada.nextLine().charAt(0);
          System.out.println("");
      }while (respuesta == 's' || respuesta =='S');
    }

    //Metodo Llenar Triangulo
    public static void llenarTriangulo () {
        double lado1,lado2,lado3;

        System.out.print("\nDigite el lado1 delTriangulo : ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado12 delTriangulo : ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado3 delTriangulo : ");
        lado3 = entrada.nextDouble();

       Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        poligonos.add(triangulo);//Almaceno dentro del array poligonos el objeto triangulo

    }

    //Metodo Llenar Rectangulo

    public static void llenarRectangulo (){
        double lado1,lado2;

        System.out.print("\nDigite el lado1 del Rectangulo : ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del Rectangulo : ");
        lado2 =  entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1,lado2);

        poligonos.add(rectangulo);
    }

    //Metodo mostrarResultados

    public static void mostrarResultados (){

        //Recorriendo el arreglo de Poligonos

        for (Poligono poli : poligonos){

            System.out.println(poli.toString());
            System.out.println("Area : "+poli.area());
            System.out.println(" ");

        }
    }
}
