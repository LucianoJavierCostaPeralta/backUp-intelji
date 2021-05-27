package Vehiculo;
//Clase Principal - Ejecutable
public class Principal {
    public static void main(String[] args) {
        Vehiculo vehiculo = new VehiculoTurismo("ALF15","NTS","A10",4);

        //Consvercion Desendente
        //Convertimos un Objeto de la ClaseSuperior en un Objeto de una SubClase
        VehiculoTurismo nuevoVehiculo =  (VehiculoTurismo) vehiculo;

        System.out.println(nuevoVehiculo);
    }
}
