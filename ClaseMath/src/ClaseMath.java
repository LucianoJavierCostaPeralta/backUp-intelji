public class ClaseMath {
    public static void main(String[] args) {
        //RAIZ CUADRADA
   double raiz = Math.sqrt(9);
   // Potencia
    double base = 5 , exponente = 2;
    double resultado = Math.pow(base,exponente);
//REDONDEO
        double numero = 4.75;
        long redondeo = Math.round(numero);
        //NUMERO RANDOM
         int max = 100 , min = 0;
         int dato =  (int)(Math.random()*((max - min)+1));


        System.out.println(raiz);
        System.out.println(resultado);
        System.out.println(redondeo);
        System.out.println(dato);
    }
}
