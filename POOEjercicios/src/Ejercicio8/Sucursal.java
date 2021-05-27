package Ejercicio8;

public class Sucursal {
    //Atributo
    private  int numeroSucursal;
    private String direccion;
    private String ciudad;

    //Metodos

    //Metodo Constructor

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    //Metodos Geters


    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    //Metodo MostrarDatos
    public String mostrarDatosSucursal (){
        return "\nNumeroSucursal : "+numeroSucursal+
                "\nDireccion : "+direccion+
                "\nCiudad : "+ciudad;
    }

    //Metodo calcular Precio
    public double calcularPrecio(Paquete t) {
        double precio;
        precio = t.getPeso();//Envio  prioridad Normal

        if (t.getPrioridad() == 1) {//Envio prioridad Alta
            precio += 10;
        }
        if (t.getPrioridad() == 2) {//Envio prioridad Expres
            precio += 20;
        }

        return precio;
    }
}
