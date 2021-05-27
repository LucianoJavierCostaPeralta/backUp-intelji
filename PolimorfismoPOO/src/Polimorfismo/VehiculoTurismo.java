package Polimorfismo;

public class  VehiculoTurismo  extends  Vehiculo{
    private int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "\nMatricula : "+matricula+
                "\nMarca : "+marca+
                "\nModelo : "+modelo+
                "\nNumeroPuertas : "+numeroPuertas;
    }
}
