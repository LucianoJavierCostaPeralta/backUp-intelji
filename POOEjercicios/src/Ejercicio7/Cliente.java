package Ejercicio7;

public class Cliente {
    //Atributos
    private String nombre ;
    private String apellido ;
    private String dni ;
    Cuenta cuentas[];//Creamos un arreglo de obejtos de la clase "Cuenta" . En la clase "Cliente"


    //Metodos
    //MetodoConstructor

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    //Metodos Geters


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    //Metodo Consulatr saldo
    public double consultarSaldo (int n){
         return cuentas[n].getSaldo();
    }

    //Metodo Ingresar Dinero

    public void ingresar_Dinero (int n,double cantidad){
        cuentas[n].ingresarDinero(cantidad);
    }

    //Metodo Retirar dinero

    public void retirar_Dinero (int n , double cantidad){
        cuentas[n].retirarDinero(cantidad);
    }

}
