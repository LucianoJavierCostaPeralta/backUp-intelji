package Vehiculo;
//Clase Hija
public class VehiculoDeportivo extends  Vehiculo{
    private int cilindrada ; //Atributo

    //Metodo Constrcutor

    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    //Metodo Geter

    public int getCilindrada() {
        return cilindrada;
    }

    //Metodo MostrarDatos
    @Override
    public String mostrarDatos() {
        return "\nMatricula : "+matricula+
                "\nMarca : "+marca+
                "\nModelo : "+modelo+
                "\nCilindrada : "+cilindrada;
    }
}
