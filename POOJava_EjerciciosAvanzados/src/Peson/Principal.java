package Peson;

public class Principal {
    public static void main(String[] args) {
        Student student  =  new Student("Luciano","El Ing Gaona","Del 2do año",2,1200);
        Staff staff = new Staff("Gaona"," Luciano","UTN",1200);
        System.out.println("El estudiante ." +" "+student.toString()+
                "\n"+staff.getName()+" hanaña a  "+staff.getAddress()+
                "\n De la couta no paga del mes de Diciembre . El monto es $ " +staff.getPay());

    }
}
