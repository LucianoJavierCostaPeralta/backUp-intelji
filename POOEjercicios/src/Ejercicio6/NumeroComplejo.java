package Ejercicio6;

public class NumeroComplejo {
    //Atributos
    private  double a ;//Numero real
    private  double b ;// Parte imaginaria

    //Metodos
    //Metodo Constructor
    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //Metodo Geters

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    //Metodo Calcular Suma
    public NumeroComplejo CalcularSuma (NumeroComplejo c){
        NumeroComplejo suma = new NumeroComplejo(a+c.getA(),b+c.getB());

        return suma;
    }

    //Metodo Calcular Producto
    public NumeroComplejo CalcularProducto (NumeroComplejo c){
        NumeroComplejo mult = new NumeroComplejo((a*c.getA()-b*c.getB()),(a*c.getB()+b*c.getA()));
        return mult;
    }

    //Metodo Comprobar igauldad
    public  boolean comprobarIgualdad (NumeroComplejo c ){
        boolean igualdad = false;

        if ((a==c.getA()) && (b==c.getB())){
            igualdad = true;
        }
        return  igualdad;
    }

    //Metodo multl NumComplejo X  Entero

   public NumeroComplejo multPorEntero ( int x){
        NumeroComplejo multe = new NumeroComplejo(a*x ,b*x);
        return multe;
   }

}
