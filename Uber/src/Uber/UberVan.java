package Uber;

import java.util.ArrayList;

public class UberVan extends  Vehiculo{
    Map<String, ArrayList<String,Integer>>tipovehiculoAceptado;
    ArrayList<String>material;

    public UberVan(String placa, Cuenta chofer, Map<String, ArrayList<String, Integer>> tipovehiculoAceptado, ArrayList<String> material) {
        super(placa, chofer);
        this.tipovehiculoAceptado = tipovehiculoAceptado;
        this.material = material;
    }
}
