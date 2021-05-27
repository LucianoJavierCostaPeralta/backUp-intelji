package MetodoRetornoDeValores;

public class Operacion {
    //Atributo

    //Metodo Sumar

    public int sumar (int numero1 , int numero2){
        int suma = numero1 + numero2;
        return suma;
    }

    //Metodo Restar
    public int restar (int numero1 , int numero2){
        int resta = numero1 - numero2 ;
        return resta;
    }

    //Metodo Multiplicar
    public int multiplicar (int numero1 , int numero2){
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    //Metodo Dividir
    public int dividir (int numero1 , int numero2){
        int division = numero1 / numero2;
        return division;
    }

    //Metodo MostrarDatos

    public void mostrarDatos (int suma ,int resta , int multiplicacion , int divison){
        System.out.println("\nLa suma es : "+suma+
                "\nLa resta es : "+resta+
                "\nLa multiplicacion es : "+multiplicacion+
                "\nLa division es : "+divison);
    }
}
