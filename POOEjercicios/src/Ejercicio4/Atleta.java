package Ejercicio4;

public class Atleta {
    //Atributos
    private int numeroAtletas ;
    private String nombre ;
    private float tiempoCarrera;

    //Metodos

    //MetodoConstructor


    public Atleta(int numeroAtletas, String nombre, float tiempoCarrera) {
        this.numeroAtletas = numeroAtletas;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }


    //Metodo Geter

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }


    //Metodo mostarDatos del Ganador

    public String mostrarDatosGanador(){

        return "\nNumero del Atleta : "+numeroAtletas+"\nNombre del Atleta : "+nombre+"\nTiempo de la Carrera : "+tiempoCarrera;

    }
}
