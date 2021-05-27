import java.util.Arrays;

public class VARIABLES {
    public static void main(String[] args) {
        int pizzas = 6 ;
        int personas = 3 ;
        int pizzasporpersonas = pizzas / personas ;
        //Implementacion de variables con el modo printf
        System.out.printf("Si hay %d pizzas y %d de personas , a cada una le toca %d pizzas\n",
                pizzas,personas,pizzasporpersonas);

        //Uso de la clase String y double
        String auto = "Ferrari";
        double velocidad = 90.3;
        System.out.printf("El auto %s va a %.2f km/h\n",auto,velocidad);

        //Operacion con tipos de variable
        int precioleche = 14 ;
        double preciojamon = 35.6;
        int preciohuevo = 23;
        double preciototal = precioleche + preciojamon + preciohuevo ;
        System.out.printf("El precio total es : %.2f",preciototal);









    }
}
