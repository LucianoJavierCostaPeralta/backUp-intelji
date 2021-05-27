package Ejercicio2;

import java.util.Map;

public class Raices {
    //Atributos
    private double a ;
    private double b ;
    private  double c ;

    //Metodo Constructor
    public Raices(double a, double b, double c) {



        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void raices (){

        double x1 = ((-b)+(Math.sqrt(getDiscriminante()))/(2*a));
        double x2  =((-b)-(Math.sqrt(getDiscriminante()))/(2*a));

        System.out.println("Solucion X1 : "+x1);
        System.out.println("Solucion X2 : "+x2);
    }


    private void raiz (){

        double x = ((-b)/(2*a));
        System.out.println("Solucion x1 : "+x);
    }

    private  double getDiscriminante (){
        return Math.pow(b,2)-(4*a*c);
    }

    private boolean tieneRaices (){

        return  getDiscriminante()>=0;
    }

    private  boolean tieneRaiz (){

        return getDiscriminante()==0;
    }


    public void calcular (){
        if (tieneRaices()){
            raices();
        }
        else if (tieneRaiz()){
            raiz();
        }
        else{
            System.out.println("No tiene soluciones ");
        }
    }


}
