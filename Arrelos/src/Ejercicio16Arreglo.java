import javax.swing.*;
import java.util.Scanner;
/*Queremos desarrollar una aplicacion que nos ayude a grestionar las notas de un centro
* educativo .Cada grupo (o clase ) esta compuesto por 5 alumnos . Se pide leer las notas
* del primer , segundo , tercer trimestre de un grupo . Debemos mostrar al final :
* La nota media del grupo en cada trimestre  , y la media del alumno que se encuentre
* en la posicion N (N se lee por teclado ) */

public class Ejercicio16Arreglo {
    public static void main(String[] args) {
        //Creamos 3 arreglos de 5 elementos
        float primerTrimestre [] = new float[5];
        float segundoTrimestre [] = new float[5];
        float tercerTrimestre [] = new float[5];
        //Acumuladores de notas . Para poder optener el promedio de cada cuatrimestre
        float sumaPrimerTrimestre = 0 , sumaSegundoTrimestre = 0 , sumaTercerTrimestre = 0 ,sumaAlumno = 0 ;
        float promedioPrimerTrimestre , promedioSegundoTrimestre , promedioTercerTrimestre , promedioAlumno ;
        int posicion ;

        //Digita las 5 notas del primerTrimestre []
        JOptionPane.showMessageDialog(null,"Digite las notas del Primer trimestre ");
        for (int i = 0 ; i < 5 ; i++){

            primerTrimestre[i] = Float.parseFloat(JOptionPane.showInputDialog(i+".Alumno \nSu nota es "));

            sumaPrimerTrimestre += primerTrimestre[i];
        }

        //Digita las 5 notas del segundoTrimestre[]
        JOptionPane.showMessageDialog(null,"Digite las notas del Segundo trimestre ");
        for (int i = 0 ; i < 5 ; i++){

            segundoTrimestre[i] = Float.parseFloat(JOptionPane.showInputDialog(i+".Alumno \nSu nota es "));

            sumaSegundoTrimestre += segundoTrimestre[i];
        }

        //Digita las 5 notas del tercerTrimestre []
        JOptionPane.showMessageDialog(null,"Digite las notas del Tercer trimestre ");
        for (int i = 0 ; i < 5 ; i++){

           tercerTrimestre[i] = Float.parseFloat(JOptionPane.showInputDialog(i+".Alumno \nSu nota es "));

           sumaTercerTrimestre += tercerTrimestre[i];
        }

        //Sacamos el promedio de cada trimestre

        promedioPrimerTrimestre = sumaPrimerTrimestre / 5;
        promedioSegundoTrimestre = sumaSegundoTrimestre / 5;
        promedioTercerTrimestre = sumaTercerTrimestre / 5 ;

        //El usuario digita la posicion del alumno

        do {
           posicion = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion del alumno entre (0 - 4)\nPara optener el promedio "));
        }while (posicion < 0 || posicion > 4);

        //Sacamos la suma de las notas del alumno

        sumaAlumno = primerTrimestre[posicion] + segundoTrimestre[posicion] + tercerTrimestre[posicion];
        promedioAlumno = sumaAlumno / 3 ;

        //Imprimimos todos los resultados

        JOptionPane.showMessageDialog(null,"Los resultados requerido son ." +
                "\nPromedio  Primer Trimestre : "+promedioPrimerTrimestre+
                "\nPromedio Segundo Trimestre :"+promedioSegundoTrimestre+
                "\nPromedio Tercer  Trimestre : "+promedioTercerTrimestre+
                "\nPromedio Alumno : "+promedioAlumno);





    }

}
