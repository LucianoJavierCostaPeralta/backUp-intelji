package Paquete1;

public class Clase1 {
    //Atributo

    //Modificador de acceso PUBLIC
    //Al poner el atributo public
    /*Puede ser usado tanto en su clase madre
    * clases del mismo packete o clases de otros
    * paquetes*/
   public int atributo1;

   //Modificador de acceso PRIVATE
    /*Al poner el atributo PRIVATE
    * Puede ser usado unicamente en su clase madre
    * No puede ser utilizado en otras clases del
    * mismo paquete . Menos en clases de otros
    * Paquetes*/
    private int atrinuto2 ;

    //Modificador de acceso Por Defecto

    /* Al no poner ni el atributo PRIVANE o PULBIC
    Se entiende que es por defecto es decir .
    Puede ser usado tanto en su clase madre ,como
    en clases de su mismo packete */

    int atributo3 ;
}
