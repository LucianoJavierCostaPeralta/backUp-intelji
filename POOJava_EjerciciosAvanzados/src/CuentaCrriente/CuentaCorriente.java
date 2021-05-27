package CuentaCrriente;

public class CuentaCorriente {
    //Atributos
    private double saldo ;
    private String nombreTitular;
    private long numeroCuenta ;

    //Metodos

    //Metodo Constructor
    public CuentaCorriente( String nombreTitular,double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        //Determinar un numero de cuenta al azar
        //Entre 0 a 1000
        this.numeroCuenta = (long)(Math.random()*1000);
    }

    //Metodo  Seter Ingresar Saldo
    public void setIngresos (double monto ){
        this.saldo += monto ; //Al saldo le aumentamos monto
    }

    //Metodo Seter Retirar saldo
    public void setRetirar (double monto){
this.saldo -= monto ; // Al saldo le decrementamos monto
    }

    //Metodo geter saldo
    public double getSaldo() {
        return saldo;
    }

    //Metodo Strong mostrarDatos

    public  String mostrarDatos (){
        return "\nSaldo : "+saldo+
                "\nNombre del Titular : "+nombreTitular+
                "\nNumero de Cuenta : "+numeroCuenta;
    }

    //Metodo Transferencia
    public void transferir (CuentaCorriente cuenta , double monto){

        cuenta.saldo += monto ;
        this.saldo -= monto ;
    }
}
