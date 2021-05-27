package Producto;
//Clase Padre
public class Producto {
    //Atributos
    protected String name ;
    protected double precio;

    //Metodos

    //Metodo Constructor
    public Producto(String name, double precio) {
        this.name = name;
        this.precio = precio;
    }

    //Metodos Geter & Seters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    //Metodo Calcular

    public double Calcular (int cantidad){
        return this.precio*cantidad;
    }


    //Metodo MostrarDatos


    public String mostrarDatos() {
        return "\nNombre : "+name+
                "\nPrecio : "+precio;
    }
}
