package Vehiculo;
//Clase Hija
public class VehiculoTurismo extends Vehiculo {
    private int numeroPuertas ; //Atributo

    //Metodo Constructor


    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    //Metodo Geter

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    //Metodo MostrarDatos

    @Override
    public String mostrarDatos() {
        return "\nMatriucla : "+matricula+
                "\nMarca : "+marca+
                "\nModelo : "+modelo+
                "\nNumero De Puertas : "+numeroPuertas;

    }
}

