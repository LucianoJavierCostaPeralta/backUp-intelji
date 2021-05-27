package Ejerciccio1;

public class Principal {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(100);

        cuenta.ingresar(50);
        System.out.println(cuenta.getCantidad());


    }
}
