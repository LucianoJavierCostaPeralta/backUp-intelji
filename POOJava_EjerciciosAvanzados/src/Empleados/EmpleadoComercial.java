package Empleados;
//Clase hija
public class EmpleadoComercial extends Empleados{
    //Atributo
    private double comision;

    //Metodos

    //Metodo Constructor
    public EmpleadoComercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    //Metodos Geter & Seters
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    //Sobre escritura del Metodo Plus

    @Override
    public double Plus(int plus) {

        if ((super.getEdad()>30) && (this.comision>5000)){

           this.salario  = (this.salario + plus )*0.10;
        }


        return getSalario();

    }

    //Sobre escritura de Metodo mostrarDatos

    @Override
    public String toString() {
        return super.toString()+
                "\nComision : "+comision;
    }
}
