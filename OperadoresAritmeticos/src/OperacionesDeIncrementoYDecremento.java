public class OperacionesDeIncrementoYDecremento {
    public static void main(String[] args) {
        int x = 5 ,y ;
        /*Incremento x++ = x+1;
        Decremento x-- = x-1;
        y = x++; Primero hace y=x Asigna el valos de x a y
        Luego aumenta 1 a x es decir x+1
        y = ++x
        Primero  aumentamos a x en 1 x+1 y luego asignamos
        el valor de x a y
        * */
        y = x--;
        System.out.println(y);
        System.out.println(x);


    }
}
