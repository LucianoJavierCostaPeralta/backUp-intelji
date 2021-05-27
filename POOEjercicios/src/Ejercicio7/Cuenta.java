package Ejercicio7;

public class Cuenta<cantidad> {
    //Atributos
    private int numeroCuenta;
    private double saldo ;

    //Metodos
    //Metodo Constructor

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Metodos Geters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Metodo IngresarDinero
    public  void ingresarDinero(double cantidad){
        saldo += cantidad;
    }

    //Metodo RetirarDinero
    public void retirarDinero (double cantidad){
        saldo -= cantidad;
    }


}
