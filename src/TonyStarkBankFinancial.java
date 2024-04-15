import java.util.Scanner;

public class TonyStarkBankFinancial {


    public static void main(String[] args) {

        //Nombre del cliente:Tony Stark
        //Tipo de cuenta: Corriente
        //Saldo disponible : 1599.99$

        //Escriba el número de la opción deseada
        //1-Consultar saldo
        //2-Retirar
        //3-Depositar
        //9-salir

        System.out.println("Bienvenido a Tony StarkBank!");

        //variables
        String nombre = " Tony Stark";
        String tipoDecuenta = "corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("**********************");
        System.out.println("\nNombre del cliente " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDecuenta);
        System.out.println("Su saldo disponible es: " + "$" + saldo);
        System.out.println("**********************");


        String menu = """
                ***Escriba el número de la opción deseada***
                1-Consultar saldo
                2-Retirar
                3-Depositar
                9-salir
                """;

        //ciclo de repetición que se repite siempre hasta que no se digite la opcion 9 de salir

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println("menu");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" El saldo actualizado es: " + "$" + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que deseas retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo) {
                        System.out.println(" Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println(" El saldo actualizado es : " + "$" + saldo);
                    }
                    break;

                case 3:
                    System.out.println("¿Cuál es el valor que deseas depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo = saldo + valorADepositar;
                    System.out.println(" El saldo actualizado es : " + "$" + saldo);
                    break;
                case 9:
                    System.out.println(" Saliendo del programa , Gracias por utilizar nuestros servicios en Tony StarkBank");
                    break;

                default:
                    System.out.println("Opción no válida");


            }
        }
    }
}
