package Ekercicio10;
//Clase Hija
public class Futbolista extends  Persona {
    //Atributos
    private int dorsal;
    private String posicion;

    //Metodos

    //Metodo Constructor

    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    //Metodo Geter


    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    //Metodo partidoFutbol


    @Override
    public void partidoFootball() {
        System.out.println("Juega el partido ");
    }

    //Metodo Entrenamiento

    @Override
    public void entrenamiento() {
        System.out.println("Entrana");
    }

    //Metodo Entrevista
    public void entrevista (){
        System.out.println("Da una entrevista");
    }
}
