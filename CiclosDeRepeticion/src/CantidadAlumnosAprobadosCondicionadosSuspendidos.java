import javax.swing.*;

public class CantidadAlumnosAprobadosCondicionadosSuspendidos {
    public static void main(String[] args) {
        float nota ;
        int aprobados = 0 , condicionados = 0  , suspendidos = 0 ;

        for (int i = 1 ; i <=6 ; i++){

            do {
                nota = Float.parseFloat(JOptionPane.showInputDialog("Almunmo "+i+"\nDigite una nota entre 0 y 10 "));


            }while (nota<0 || nota >10);

            //Tratamiento
            if (nota == 4 ){
                condicionados++;
            }
            else if (nota >= 5){
                aprobados++;
            }
            else {
                suspendidos++;

            }
        }





        JOptionPane.showMessageDialog(null,
                "Cantidad de alumnos " +
                        "\nAprobados  "+aprobados+
                "\nCondicionados  "+condicionados+
                "\nSuspendidos  "+suspendidos);

    }
}
