package CuentaCrriente;

public class UsarCuenta {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("Luciano Costa",60000);
        CuentaCorriente cuenta2 = new CuentaCorriente("Barbara Gareis",30000);
        cuenta1.transferir(cuenta2,200);

        System.out.println("Cuenta 1 :"+cuenta1.mostrarDatos()+
                "\nCuenta 2 : "+cuenta2.mostrarDatos());


    }
}
