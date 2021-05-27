package Vehiculo;
//Clase Principal - Ejecutable
public class Principal {
    public static void main(String[] args) {
        //Referencia Del Objetp      //Instancia Del Objeto
        VehiculoTurismo miVehiculo = new VehiculoTurismo("AS15","SAs","A10",4);

        //Consvercion Ascendente
        //Gurdo un objeto de una SubClase en la SuperClase
        Vehiculo vehiculo = miVehiculo;

        System.out.println(vehiculo);

    }
}
