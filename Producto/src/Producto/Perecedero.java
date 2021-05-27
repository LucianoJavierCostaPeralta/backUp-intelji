package Producto;

public class Perecedero extends Producto {
    //Atributos
    private int diasACaducar;

    //Metodos

    //Metodo Constructor
    public Perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    //Metodos Geter & Seters
    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    //Sobre escritura de Metodo

    @Override
    public double Calcular(double cantidad) {

        if (this.Precio*cantidad ==1){
            return ((this.Precio*cantidad)/4);
        }

        if (this.Precio*cantidad ==2){
            return ((this.Precio*cantidad)/3);
        }

        if (this.Precio*cantidad ==3){
            return ((this.Precio*cantidad)/2);
        }

        return (this.Precio*cantidad);
    }


    //Metodo ToString

    @Override
    public String toString() {
        final StringBuilder sb ;
        sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("Dias hasta que se caduque el producto : ").append(this.diasACaducar);

        return sb.toString();
    }
}
