package Ejercicio3;

public class Vehiculo {
    //Atributo
    private String marca ;
    private String modelo;
    private float precio ;

    //Metodos

    //Metodo Constructor


    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Metodo Get


    public float getPrecio() {
        return precio;
    }

    //Metodo mostrar

    public String mostrarDatos (){

        return "\nMarca  "+marca+"\nModelo "+modelo+"\nPrecio $ "+precio;
    }
}
