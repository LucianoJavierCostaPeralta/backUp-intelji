package Producto;

public class Producto {
    //Atributos
    protected static final int  ProductoMax =4;
    protected String Nombre ;
    protected double Precio ;

    //Metodos

    //Metodo Constructor
    public Producto(String nombre, double precio) {
        Nombre = nombre;
        Precio = precio;
    }

    //Metodos Geter & Seter
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    //Metodo Calcular
    public double Calcular (double cantidad ){
        return this.Precio*cantidad;
    }

    //Metodo ToString


    @Override
    public String toString() {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append("Nombre del producto : ").append(this.Nombre).append("\n");
        sb.append("Precio del producto : ").append(this.Precio).append("\n");
        return sb.toString();
    }
}
