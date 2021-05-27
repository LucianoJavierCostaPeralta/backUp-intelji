package Empleados;
//Clase hija
public class EmpleadoRepartidor extends Empleados {
    //Atributos
    private int zona ;


    //Metodos

    //Metodo Constructor
    public EmpleadoRepartidor(String nombre, int edad, double salario, int zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    //Metodos Geter & Seters

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    //Sobre escritura del Metodo Plus

    @Override
    public double Plus(int plus) {
        if ((super.getEdad()<25) && (this.zona ==3)){
            this.salario   = (this.salario + plus )*0.10;

        }
      return  getSalario();
    }

    //Sobre escritura de Metodo mostrarDatos

    @Override
    public String toString() {
        return super.toString()+
                "\nZona : "+zona;
    }
}
