package Vehiculo;
//Clase Padre
public class Vehiculo {
    //Atributos
    protected  String matricula;
    protected  String marca ;
    protected String modelo ;

    //Metodos

    //Metodo Constructor


    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Metodos Geteres

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    //Metodo MostrarDatos



    public String mostrarDatos() {
        return "\nMatriucla : "+matricula+
        "\nMarca : "+marca+
        "\nModelo : "+modelo;
    }
}
