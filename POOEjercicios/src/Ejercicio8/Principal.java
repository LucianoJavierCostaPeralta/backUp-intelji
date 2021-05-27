package Ejercicio8;

import java.util.Scanner;

public class Principal {

    public static  int buscarPaquete (Paquete t[] ,int numeroPaquete , int contadorPaquete){

        int indice = 0 ;
        boolean enconotrado = false;

        for (int i = 0 ; i < contadorPaquete ; i ++){

            if (t[i].getNumeroPaquete() == numeroPaquete){
                enconotrado = true;
                indice = i;
            }

            if (enconotrado == false){
                indice = -1;
            }

        }
        return  indice;
    }


    public static  int buscarSucursal (Sucursal t[] ,int numeroSucursal , int contadorSucursal){

        int indice = 0 ;
        boolean enconotrado = false;

        for (int i = 0 ; i < contadorSucursal ; i ++){

            if (t[i].getNumeroSucursal() == numeroSucursal){
                enconotrado = true;
                indice = i;
            }

            if (enconotrado == false){
                indice = -1;
            }

        }
        return  indice;
    }

    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int numeroSucursal , numeroPaquete , prioridad , opcion,indiceSucursal, indicePaquete;
        int contadorSucursal = 0 , contadorPaquete = 0 ;
        String direccion , ciudad , dni ;
        double peso,precioPaquete;
        Sucursal sucursal [] = new Sucursal[50];//Objeto Clase Sucursal
        Paquete paquete [] = new Paquete[100];//Objeto Clase Paquete

        //Menu
        do {
            System.out.println("\t*MENU*");
            System.out.println("1.Crear una nueva sucursal");
            System.out.println("2.Enviar paquete");
            System.out.println("3.Conssultar sucursal");
            System.out.println("4.Consultar paquete ");
            System.out.println("5.Mostrar todas las sucursales");
            System.out.println("6.Mostrar todos los paquetes ");
            System.out.println("7.Salir");
            System.out.print("Digite la opcion del Menu : ");
            opcion = entreda.nextInt();

            switch (opcion){
                case 1 :
                    System.out.print("\nDigite el numero de Sucursal : ");
                    numeroSucursal = entreda.nextInt();
                    entreda.nextLine();
                    System.out.print("Digite la direccion : ");
                    direccion = entreda.nextLine();
                    System.out.print("Digite la ciudad : ");
                    ciudad = entreda.nextLine();
                    sucursal[contadorSucursal] = new Sucursal(numeroSucursal,direccion,ciudad);
                    contadorSucursal++;
                    break;
                case 2 : System.out.print("\nDigite el numero de Sucursal : ");
                         numeroSucursal = entreda.nextInt();

                         indiceSucursal = buscarSucursal(sucursal,numeroSucursal,contadorSucursal);
                         if (indiceSucursal == -1){
                             System.out.println("\nLa sucursal no exixte ");
                         }
                         else{
                             System.out.print("\nDigite el numero del paquete : ");
                             numeroPaquete = entreda.nextInt();
                             entreda.nextLine();
                             System.out.print("Digite el DNI del que envia el quete : ");
                             dni = entreda.nextLine();
                             System.out.print("Digite el peso del paquete : ");
                             peso =  entreda.nextDouble();
                             System.out.print("Digite la prioridad (0= Normal , 1 : Alta , 2 : Expres)  : ");
                             prioridad = entreda.nextInt();

                             paquete[contadorPaquete] = new Paquete(numeroPaquete,dni,peso,prioridad);

                             precioPaquete = sucursal[indiceSucursal].calcularPrecio(paquete[contadorPaquete]);
                             System.out.print("\nEl precio es $ "+precioPaquete);
                             contadorPaquete++;
                         }
                    break;
                case 3 :
                    System.out.print("\nDigite el numero de Sucursal : ");
                    numeroSucursal = entreda.nextInt();

                    indiceSucursal = buscarSucursal(sucursal,numeroSucursal,contadorSucursal);
                    if (indiceSucursal == -1){
                        System.out.println("\nLa sucursal no exixte ");
                    }
                    else{
                        System.out.println("Los datos de la Sucursal son : ");
                        System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
                    }
                    break;
                case 4 :
                    System.out.print("\n Digite el numero de Paquete : ");
                    numeroPaquete = entreda.nextInt();
                    indicePaquete = buscarPaquete(paquete,numeroPaquete,contadorPaquete);
                    if (indicePaquete == -1){
                        System.out.print("\nEl Paquete no exixte ");
                    }
                    else{
                        System.out.println("Los datos del paquete son :");
                        System.out.print(paquete[indicePaquete].mostrarDatosPaquete());
                    }
                    break;
                case 5 :
                    for (int i = 0 ; i < contadorSucursal ; i ++){
                        System.out.println("\n Los dato de la sucursal . Numero "+(i+1)+" : ");
                        System.out.println(sucursal[i].mostrarDatosSucursal());
                    }
                    break;
                case 6 :
                    for (int i = 0 ; i < contadorPaquete ; i ++){
                        System.out.println("\n Los datos del paquete . Nueoro "+(i+1)+" : ");
                        System.out.println(paquete[i].mostrarDatosPaquete());
                    }
                    break;
                case 7 : break;
                default: System.out.println("Error , la opcion no se encuentra en el menu ."); break;
            }

            System.out.println(" ");
        }while (opcion != 7);
    }
}
