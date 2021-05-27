package Empleados;
///Clase Padre - Clase Abstracta
public  class Empleados {
    //Atributos
    protected String nombre ;
    protected int edad ;
    protected double salario ;


    //Metodos

    //Metodo Constructor

    public Empleados(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    //Metodos Geter & Seters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Metodo  Plus
    public  double  Plus (int plus ) {
    return this.salario = salario + plus ;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "\nNombre : "+nombre +
                "\nEdad : "+edad+
                "\nSalario $ "+salario;
    }
}
