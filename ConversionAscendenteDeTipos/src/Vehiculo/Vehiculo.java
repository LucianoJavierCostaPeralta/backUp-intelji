package Vehiculo;
//Clase Padre
public class Vehiculo {
    //Atributos
    protected String matricula ;
    protected String marca ;
    protected String modelo;

    //Metodos

    //Metodo Constrcutor

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

    //Metodo Mostrar Datos

    public String mostrarDatos (){
        return "\nMatricula : "+matricula+
                "\nMarca : "+marca+
                "\nModelo : "+modelo;

    }
}
