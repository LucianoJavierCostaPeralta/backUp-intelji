package Vehiculo;
//Clase Hija
public class VehiculoDeportivo extends Vehiculo {
    private int cilindrado ; //Atributo

    //Metodo Constructor


    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrado) {
        super(matricula, marca, modelo);
        this.cilindrado = cilindrado;
    }

    //Metodo Geter

    public int getCilindrado() {
        return cilindrado;
    }

    //Metodo MostrarDatos


    @Override
    public String mostrarDatos() {
        return "\nMatriucla : "+matricula+
                "\nMarca : "+marca+
                "\nModelo : "+modelo+
                "\nCilindrado : "+cilindrado;
    }
}
