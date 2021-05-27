package Parcial2Prog2;




public class metodo {

    public String nodosProximos(String v) {

        int indice = busquedaIndex(v);
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < vertices.length; i++) {

            if (matrizPesos[indice][i] != 0) {
                string.append(vertices[i]);
            }
        }
        return string.toString();  // Esto tambien se podria modificar retornando en forma de lista
    }
}