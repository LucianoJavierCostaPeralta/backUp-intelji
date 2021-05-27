import javax.swing.*;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        int arrglo [] = {4,1,5,2,3};
        int dato ;
        boolean bandera = false ;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a buscar en el arreglo "));

        //BUSQUEDA SECUENCIAL
        int i = 0 ;

        while (i<5 && bandera == false){
            if (arrglo[i] == dato){
                bandera = true ;
            }
            i++;

        }

        if (bandera == false){
            JOptionPane.showMessageDialog(null,"El numero no se encuentra en el arreglo ");
        }
        else {
            JOptionPane.showMessageDialog(null,"El numero se encuentra en la posicion : "+(i-1));

        }


    }
}
