package Ejerciccio1;

public class Cuenta {
   private String titulo ;
   private double cantidad ;

    public Cuenta(String titulo) {
        this.titulo = titulo;
    }

    public Cuenta(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar (double cantidad){
        if (cantidad >=0){
            this.cantidad = this.cantidad+cantidad;
        }

    }

    public void  retirarDinero (double cantidad){
       double resta =0;

       if (cantidad >=0){
           resta = this.cantidad - cantidad;
       }

       if (resta < 0){
           this.cantidad = 0;
       }

    }
}
