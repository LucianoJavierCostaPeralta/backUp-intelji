package MetodoParametroyArgumento;

public class Operacion {
    //Atributos
    int suma ;
    int resta ;
    int multiplicacion ;
    int division ;

    //Metodos

    //Metodo Sumar

    public void sumar (int numero1 , int numero2){
        suma = numero1 + numero2;

    }

    //Metodo Restar
    public void restar (int numero1 , int numero2){
        resta = numero1 - numero2 ;

    }

    //Metodo Multiplicar
    public void multiplicar (int numero1 , int numero2){
        multiplicacion = numero1 * numero2;
    }

    //Metodo Dividir
    public void dividir (int numero1 , int numero2){
        division = numero1 / numero2;
    }

    //Metodo MostrarDatos
    public void mostrarDatos (){
        System.out.println("\nLa suma es : "+suma+
                "\nLa resta es : "+resta+
                "\nLa multiplicacion es : "+multiplicacion+
                "\nLa division es : "+division);
    }
}
