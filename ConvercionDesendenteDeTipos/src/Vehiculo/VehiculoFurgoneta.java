package Vehiculo;
//Clase Hija
public class VehiculoFurgoneta extends Vehiculo {
    private  int carga ; //Atributo

    //Metodo Constrcutor

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    //Metodo Geter

    public int getCarga() {
        return carga;
    }

    //Metodo MostrarDatos


    @Override
    public String mostrarDatos() {
        return "\nMatriucla : "+matricula+
                "\nMarca : "+marca+
                "\nModelo : "+modelo+
                "\nCarga : "+carga;
    }
}

