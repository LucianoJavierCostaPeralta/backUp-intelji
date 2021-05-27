package Ejercicio8;

public class Paquete {
    //Atributos
    private int numeroPaquete ;
    private String dni;
    private  double peso ;
    private int prioridad ;

    //Metodos

    //Metodo Constructor

    public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    //Metodos Geters

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    //Metodo MostrarDatos

    public String mostrarDatosPaquete(){

        return "\nNumeroPaquete : "+numeroPaquete+
                "\nDNI : "+dni+"\nPrecio = "+peso+
                "\nPrioridad : "+prioridad+"\n";
    }

}
