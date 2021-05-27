package Uber;

public class UberPool  extends  Vehiculo{
    //Atributos
    String marca ;
    String modelo ;

    //Metodo Constructor


    public UberPool(String placa, Cuenta chofer, String marca, String modelo) {
        super(placa, chofer);
        this.marca = marca;
        this.modelo = modelo;
    }
}
