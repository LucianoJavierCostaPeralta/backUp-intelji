package Polimorfismo;

public class Principal {

    public static void main(String[] args) {
        Vehiculo misVehiculos [] = new Vehiculo[4];

        misVehiculos [0] = new Vehiculo("kj15","Ferrari","A89");
        misVehiculos [1] = new VehiculoTurismo("SD73","x","x1",4);
        misVehiculos [2] = new VehiculoDeportivo("RS01","DPTO","D10",600);
        misVehiculos [3] = new VehiculoFurgoneta("PT09","FIT","F100",1000);


        for (Vehiculo vehiculo : misVehiculos){

            System.out.println(vehiculo.mostrarDatos());

            System.out.println(" ");
        }

    }
}
