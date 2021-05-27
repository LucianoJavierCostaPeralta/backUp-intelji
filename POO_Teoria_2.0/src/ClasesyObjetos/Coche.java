package ClasesyObjetos;

public class Coche {
    //Atributos
    String color ;
    String marca ;
    int km ;

    public static void main(String[] args) {//Metodo main
        Coche coche1 = new Coche();//Creo objeto de la clase "Coche"

        //LLenamos los atributos del objeto
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        //Imprimimos los datos del objeto
        System.out.println("El coche uno tiene :" +
                "\nColor : "+coche1.color+
                "\nMarca : "+coche1.marca+
                "\nKm : "+coche1.km);

        //Creamos un segundo Objeto de la Clase "Coche"
        Coche coche2 = new Coche();

        //LLenamos los Atributos de Objeto 2
        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;

        //Imprimimos los Datos del Objeto2
        System.out.println("\nEl coche dos tiene : " +
                "\nColor : "+coche2.color+
                "\nMarca : "+coche2.marca+
                "\nKm : "+coche2.km);



    }
}
