package Ejercicio1;

public class Cuenta {
    //Atributos
    private String nombre ;
    private String numeroCuenta ;
    private double tipoInteres;
    private double saldo ;

    //Metodo Constructor Defecto
    public Cuenta() {
    }

    //Metodo Constructor con Parametros
    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    //Metodo Constructor copia
    public Cuenta (Cuenta c){
        nombre = c.nombre;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }

    //Propiedades / Metodos Geters y Seters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    //Metodo Ingreso
    public boolean ingreso(double cantidad) {
        boolean ingresoCorrecto = true;
        if (cantidad < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + cantidad;
        }
        return ingresoCorrecto;
    }

    //Metodo Reintegro
    public boolean reintegro(double cantidad) {
        boolean reintegroCorrecto = true;
        if (cantidad < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }

    //Metodo Transferencia
    public boolean transferencia(Cuenta c, double cantidad) {
        boolean correcto = true;
        if (cantidad < 0) {
            correcto = false;
        } else if (saldo >= cantidad) {
            reintegro(cantidad);
            c.ingreso(cantidad);
        } else {
            correcto = false;
        }
        return correcto;
    }
}
