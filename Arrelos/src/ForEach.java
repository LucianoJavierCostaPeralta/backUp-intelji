public class ForEach {
    public static void main(String[] args) {

        String [] nombre = {"Alejandro","Leandro","Santiago"};



        //NombredeArreglo.length

        for (int i = 0 ; i < nombre.length;i++){
            System.out.println("Nombres : "+nombre[i]);
         }

        System.out.println();

        //for each

        for (String i: nombre){
            System.out.println("Nombre : "+i);
        }
    }
}
