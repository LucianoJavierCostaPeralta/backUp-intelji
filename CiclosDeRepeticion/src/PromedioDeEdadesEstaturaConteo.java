import javax.swing.*;

public class PromedioDeEdadesEstaturaConteo {
    public static void main(String[] args) {
        int  edad , sumaEdad =0 ,contadorMayor18 =0 , contadorAltura175 = 0;
        float  altura , sumaAltura =0 , mediaEdad, mediaAltura;

        //Ingreso por teclado altura y edad de 5 alumnos
        for (int i =1 ; i<=5 ; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Almuno "+i+"\nIngrese su edad "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno"+i+"\nIngrese su estatura "));

            //Suma de edades
            sumaEdad += edad;

            //Suma de estaturas
            sumaAltura += altura;

            //Contador de Mayores de 18
            if (edad > 18){
                contadorMayor18++;
            }

            //Contador altura mayor a 1.75
            if (altura > 1.75){
                contadorAltura175++;
            }


        }

        //MediaEdad
        mediaEdad = (float) sumaEdad/5 ;
        mediaAltura = (float) sumaAltura / 5 ;

        JOptionPane.showMessageDialog(null,"El promedio de la edad es "+mediaEdad+
                "\nEl promedio de la altura es "+mediaAltura+
                "\nEl total de alumnos mayores de 18 años es "+contadorMayor18+
                "\nEl total de alumnos , con altura mayor a 1.75 es "+contadorAltura175);
    }
}
