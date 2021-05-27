package Ejercicio7;

import java.util.Scanner;

public class Principal {
    public static int buscarNumeroCuenta(Cuenta cuentas[],int n){
        int i = 0 , indice = 0 ;
        boolean enconotrado = false;
        //Busqueda secuencial
        while ((i<cuentas.length) && (enconotrado == false)){

            if (cuentas[i].getNumeroCuenta()==n){

                enconotrado = true ;
                indice = i;
            }
            i++;
        }

        if (enconotrado == false){
            indice = -1;
        }

        return indice;

    }
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        String nombre , apellido , dni;
        int numeroCuenta , nCuentas , opcion  , indiceCuenta;
        double saldo,cantidad;
        //Creamos  objetos de clases
        Cuenta cuentas[];
        Cliente cliente;

        System.out.print("Digite el nombre del Cliente : ");
        nombre = entreda.nextLine();
        System.out.print("Digite el apellido del Cliente : ");
        apellido = entreda.nextLine();
        System.out.print("Digite el dni del Cliente  : ");
        dni = entreda.nextLine();
        System.out.print("Ahora digite el numero de cuentas que tiene : ");
        nCuentas = entreda.nextInt();

        cuentas = new Cuenta[nCuentas];//Inicializamos el arreglo de objetos de la clase "Cuenta"

        for (int i = 0 ; i < cuentas.length ; i++){

            System.out.println("\nDigite los datos para la cuenta  "+(i+1)+" . ");
            System.out.print("Digite el numero de la cuenta : ");
            numeroCuenta = entreda.nextInt();
            System.out.print("Digite el saldo de la cuenta : ");
            saldo = entreda.nextDouble();

            cuentas[i] = new Cuenta(numeroCuenta,saldo);
        }

        //Inicializamos el objeto "cliente" de la clase "Cliente"
        cliente = new Cliente(nombre,apellido,dni,cuentas);

        //Creamos el menu

        do {
            System.out.println("\n.MENU.");
            System.out.print("\n1. Ingresar dinero en cuenta .");
            System.out.print("\n2. Retirar dinero en cuenta .");
            System.out.print("\n3. Consulatar saldo en cuenta .");
            System.out.print("\n4. Salir .");
            System.out.print("\nDigite la opcion de menu : ");
            opcion = entreda.nextInt();

            switch (opcion){
                case 1 :
                    System.out.print("\nDigite el numero de cuenta :  ");
                    numeroCuenta = entreda.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas,numeroCuenta);

                    if (indiceCuenta == -1){
                        System.out.println("\nEl numero de cuenta ingresado no exixte .");

                    }
                    else {
                        System.out.print("\nDigite la cantidad de dinero a ingresar : ");
                        cantidad = entreda.nextDouble();
                        cliente.ingresar_Dinero(indiceCuenta,cantidad);
                        System.out.println("\nIngreso realizado correctamente .");
                        System.out.println("Saldo disponible : "+cliente.consultarSaldo(indiceCuenta));

                    }
                    break;
                case 2 : System.out.print("\nDigite el numero de cuenta :  ");
                    numeroCuenta = entreda.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas,numeroCuenta);

                    if (indiceCuenta == -1){
                        System.out.println("\nEl numero de cuenta ingresado no exixte .");

                    }
                    else {
                        System.out.print("\nDigite la cantidad de dinero que desea retirar : ");
                        cantidad = entreda.nextInt();

                        if (cantidad > cliente.consultarSaldo(indiceCuenta)){
                            System.out.println("Saldo insuficiente .");
                        }
                        else {

                            cliente.retirar_Dinero(indiceCuenta,cantidad);
                            System.out.println("Retiro realizado correctamente .");
                            System.out.println("\nRetiro realizado correctamente .");
                            System.out.println("Saldo disponible : "+cliente.consultarSaldo(indiceCuenta));
                        }

                    }
                    break;
                case 3 : System.out.print("\nDigite el numero de cuenta :  ");
                    numeroCuenta = entreda.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas,numeroCuenta);

                    if (indiceCuenta == -1){
                        System.out.println("\nEl numero de cuenta ingresado no exixte .");

                    }
                    else{
                        System.out.println("Saldo disponible : "+cliente.consultarSaldo(indiceCuenta));
                    }
                    break;
                case 4 : break;
                default: System.out.println("Error , se confundio de opcion de menu ");


            }

            System.out.println(" ");
        }while (opcion != 4);
    }
}
