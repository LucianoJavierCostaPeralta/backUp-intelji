package Producto;

public class Principal {
    public static void main(String[] args) {

        //Arreglo de Objetos
        Producto listaProducto [] = new Producto[3];
        listaProducto[0] = new Producto("Producto1",150);
        listaProducto[1] = new Perecedero("Producto2",100,5);
        listaProducto[2] = new NoPerecedero("Producto3",200,"Tipo1");


        double suma = 0; //Ponemos a 0 el acumulador

        //Realizamos la acumulacion atravez de un for
        for (int i= 0 ; i < listaProducto.length;i++){
            suma+=listaProducto[i].Calcular(5);
        }


        //Mostramos el precio

        System.out.println("El precio del producto es $ "+suma);
    }
}
