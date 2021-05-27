package Uber;

public class Vehiculo  {
    //Atributos
    Integer id ;
    String placa ;
    Cuenta chofer;
    Integer pasajero;

    public Vehiculo( String placa, Cuenta chofer) {

        this.placa = placa;
        this.chofer = chofer;

    }

    //MostrarDatos

  public void mostrarDatos (){

        System.out.println("Placa : "+placa+
                "\nChofer : "+chofer.nombre+
                "\nPasajero : "+pasajero);

    }



}
