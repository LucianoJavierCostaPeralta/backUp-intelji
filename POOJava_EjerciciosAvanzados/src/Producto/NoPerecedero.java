package Producto;

public class NoPerecedero extends Producto {
    //Atributo
    private String tipo;

    //Metodos

    //Metodo Constructor
    public NoPerecedero(String name, double precio, String tipo) {
        super(name, precio);
        this.tipo = tipo;
    }

    //Metodos Geters & Seters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Sobre escritura de Metodo "mostrarDatos"
    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+
                "\nTipo : "+tipo;
    }
}
