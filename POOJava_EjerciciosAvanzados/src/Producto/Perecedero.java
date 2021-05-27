package Producto;

public class Perecedero  extends Producto{
    //Atributos
    private int diasCaducar;

    //Metodos

    //MetodoConstructor
    public Perecedero(String name, double precio, int diasCaducar) {
        super(name, precio);
        this.diasCaducar = diasCaducar;
    }


    //Metodos Geter & Seters
    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }


    //Sobre escritura de Metodo "Calcular"
    @Override
    public double Calcular(int cantidad) {
        double precioTotal =this.precio*cantidad;

        switch (diasCaducar){
            case 1 : precioTotal=(precioTotal/4);
            break;

            case 2 : precioTotal=(precioTotal/3);
            break;

            case 3 : precioTotal=(precioTotal/2);
            break;



        }

        return (precioTotal);
    }


    //Sobre escritura de Metodo "mostrarDatos"

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+
                "\nDias a Caducar : "+diasCaducar;
    }
}
