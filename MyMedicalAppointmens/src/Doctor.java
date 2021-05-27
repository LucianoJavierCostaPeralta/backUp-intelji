public class Doctor {
    //Atributo
    int id ;
    String name ;
    String especialidad ;

    Doctor(){
        System.out.println("Construyendo el objetp Doctor");
    }

    Doctor(String name){
        System.out.println("el nombre del doctor asignado es : "+name);
    }

    //Comportamiento / Metodo

    public void showName (){
        System.out.println(name);
    }

}
