import java.util.Scanner;

public class AdivinaElNumero {
    private Scanner entrada = new Scanner(System.in);
    private boolean juegoActivo = true;

    public void jugar () {
        System.out.println("Hola ,¿Cual es tu nombre ?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("Bienvenido %s , vamos a comenzar  ",nombreJugador);
    //Ciclo while
        while (juegoActivo){
            int min=0 , max=100;
            int numeroJuego = (int) Math.random() * ((max - min) + 1) ;
            System.out.println(numeroJuego);
            juegoActivo = false;
        }


    }
}
