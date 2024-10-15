import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nombre= "tony star";
        String tipocuenta = "corriente";
        double saldo = 1599.99;
        int opcion=0;
        System.out.println("*****************************");
        System.out.println("\nNombre del cliente: "+ nombre);
        System.out.println("tipo de cuenta: " + tipocuenta);
        System.out.println("saldo disponible es: " +saldo +"$");
        System.out.println("\n*****************************");


        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1 -consultar saldo
                2- retirar
                3- Depositar
                9- Salir
                """;
        Scanner teclado=new Scanner(System.in);
        while (opcion !=9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("el saldo es:"+ saldo);
                    break;
                case 2:
                    System.out.println("cual es el valor a retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar){
                        System.out.println("saldo insuficiente");
                    }else {
                        saldo= saldo -valorARetirar;
                        System.out.println("el saldo actualizado es: "+ saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿cual es el valor a depositar?");
                    double valorADepositar = teclado.nextDouble();
                    if (valorADepositar> 0){
                        System.out.println("usted a depositado:"+ valorADepositar);
                        double nuevoSaldo = saldo + valorADepositar;
                        System.out.println("su nuevo saldo es:"+ nuevoSaldo);}else {
                        System.out.println("error");
                    }
                    break;
                case 9:
                    System.out.println("adios");
                default:
                    System.out.println("opcion no valida");
            }

        }


    }
}
