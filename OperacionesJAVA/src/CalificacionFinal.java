import java.util.Scanner;

public class CalificacionFinal {
    public static void main(String[] args) {

        Scanner entreda = new Scanner(System.in);
        float participacion , primerexamen , segundoexamen , examenfinal , notafinal ;

        //El usuario ingresa por teclado sus notas

        System.out.print("Digite la nota de participacion : ");
        participacion = entreda.nextFloat();
        System.out.print("Digite la note del primer examen : ");
        primerexamen = entreda.nextFloat();
        System.out.print("Digite la nota del segundo examen : ");
        segundoexamen = entreda.nextFloat();
        System.out.print("Digite la nota del examen final : ");
        examenfinal = entreda.nextFloat();

        //Optenemos el porcentaje de cada examen
        /*Participacion 10%
        primer examen 25% y el segundo examen 25%
        examen final 40% */

        participacion *= 0.10f;
        primerexamen *= 0.25f;
        segundoexamen *= 0.25;
        examenfinal *= 0.40f;

        //Sumamos las notas
        notafinal = participacion + primerexamen + segundoexamen + examenfinal;

        System.out.println("La nota final es :  "+notafinal);


    }
}
