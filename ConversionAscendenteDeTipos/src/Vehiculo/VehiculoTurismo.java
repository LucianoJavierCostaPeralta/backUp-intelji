package Vehiculo;
//Clase Hija
public class VehiculoTurismo extends  Vehiculo {
    private int numeroPuertas;//Atributo

    //MetodoConstructor
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
        return "\nMatricula : "+matricula+
                "\nMarca : "+marca+
                "\nModelo : "+modelo+
                "\nNumero de Puertas : "+numeroPuertas;
    }
}
