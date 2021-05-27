package Producto;

public class NoPerecedero extends Producto {
    //Atributos
    private char tipo ;

    //Metodos

    //Metodo Constructor
    public NoPerecedero(String nombre, double precio, char tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    //Metodos Geter & Seters
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    //Sobre escritura de Metodo
    @Override
    public double Calcular(double cantidad) {
        return super.Calcular(cantidad);
    }

    //Metodo ToString

    @Override
    public String toString() {
       final StringBuilder sb ;
       sb = new StringBuilder();

       sb.append(super.toString());
       sb.append("Tipo del producto : ").append(this.tipo);

       return sb.toString();
    }
}
