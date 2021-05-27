import javax.swing.*;

public class BusquedaBinaria {
    public static void main(String[] args) {
        int arreglo [] = {1,2,3,4,5};
        int dato ,inferior,superior,mitad,i;
        boolean bandera = false ;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar en el arreglo "));

        //BUSQUEDA BINARIA

        inferior = 0 ;
        superior = 5 ;
        i = 0;
        mitad = (inferior+superior)/2;

        while (inferior<=superior && i<5){
            if (arreglo[mitad] == dato){

                bandera = true ;
                break;
            }

            if (arreglo[mitad] > dato){
                superior = mitad ;
                mitad = (inferior+superior)/2;
            }

            if (arreglo[mitad] < dato){
                inferior = mitad ;
                mitad = (inferior+superior)/2;
            }

            i++;
        }


        if (bandera == true ){
            JOptionPane.showMessageDialog(null,"El numero fue encontrado en la posicion "+mitad);
        }
        else {
            JOptionPane.showMessageDialog(null,"El numero no se encuentra en el arreglo ");
        }



    }
}
