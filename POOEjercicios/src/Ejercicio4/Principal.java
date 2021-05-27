package Ejercicio4;

import java.util.Scanner;

public class Principal {
    //Metodo Statico
    public static int indiceGanador(Atleta atleta[]){
        float tiempoCarrera ;
        int indoce = 0;
        tiempoCarrera = atleta[indoce].getTiempoCarrera();

        for (int i = 1 ; i < atleta.length ; i++){
            if (atleta[i].getTiempoCarrera() < tiempoCarrera){
                tiempoCarrera = atleta[i].getTiempoCarrera();
                indoce = i;
            }
        }
        return indoce;
    }

    public static void main(String[] args) {

        Scanner entreda = new Scanner(System.in);
        String nombre ;
        int numeroAtleta , nAtletas ,indiceAtletaGnador;
        float tiempoCarrera ;

        System.out.print("Digite el numero de Atletas : ");
        nAtletas = entreda.nextInt();

        //Creamos los objetos para cada Atleta
        Atleta atleta [] = new Atleta[nAtletas];

        for (int i = 0 ; i < atleta.length ; i ++){


            System.out.print("\nDigite los datos del Atleta "+(i+1));
            System.out.print("\nIntroduzca Numero del Atleta : ");
            numeroAtleta = entreda.nextInt();
            entreda.nextLine();
            System.out.print("Introduzca Nombre del Atleta : ");
            nombre = entreda.nextLine();
            System.out.print("Introduszca el Tiempo de Carrera : ");
            tiempoCarrera = entreda.nextFloat();

            atleta[i]= new Atleta(numeroAtleta,nombre,tiempoCarrera);

        }


        indiceAtletaGnador = indiceGanador(atleta);
        System.out.println("El atleta ganador es : ");
        System.out.println(atleta[indiceAtletaGnador].mostrarDatosGanador());


    }
}
