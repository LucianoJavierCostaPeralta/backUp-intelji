package Uber;

import java.util.ArrayList;
import java.util.Map;


public class UberBkack  extends Vehiculo{
Map<String,ArrayList<String>>tipovehiculoAceptado;
ArrayList<String>material;
    public UberBkack(String placa, Cuenta chofer,Map<String,ArrayList<String>>tipovehiculoAceptado,ArrayList<String>material) {
        super(placa, chofer);
        this.tipovehiculoAceptado = tipovehiculoAceptado;
        this.material = material;
    }
}
