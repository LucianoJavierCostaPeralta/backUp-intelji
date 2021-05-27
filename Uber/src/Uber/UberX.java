package Uber;
//Clase hija de Clase "Vehiculo"
public class UberX  extends Vehiculo{
    //Atributos
    String marca ;
    String modelo ;

    //Metodo Constructor
    public UberX(String placa, Cuenta chofer, String marca, String modelo) {
        super(placa, chofer);
        this.marca = marca;
        this.modelo = modelo;
    }
}
