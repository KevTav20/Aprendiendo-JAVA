import java.util.Scanner;

public class AplicacionBancaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombreDelCliente = "Tony Stank";
        double saldoDisponible = 1599.99;
        String tipoCuenta = "Corriente";
        int opcion = 0;
        double retirar = 0;
        double deposito = 0;

        System.out.println("*********************************" + "\nNombre del cliente " + nombreDelCliente + "\nTipo de Cuneta: " + tipoCuenta + "\nSaldo Disponible: " + saldoDisponible + "\n*********************************");


        while (opcion != 9) {
            System.out.println("** Escriba el numero de la opcion deseada" + "\n1 - Consultar saldo" + "\n2 - Retirar" + "\n3 - Depositar" + "\n9 - Salir");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actual es: " + saldoDisponible);
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar?");
                    retirar = entrada.nextDouble();
                    if ( retirar > saldoDisponible){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldoDisponible -= retirar;
                        System.out.println("\nSaldo restante");
                    }
                    System.out.println("El saldo actual es: " + saldoDisponible);
                    break;
                case 3:
                    System.out.println("Cuanto desea depositar");
                    deposito = entrada.nextDouble();
                    saldoDisponible += deposito;
                    System.out.println("El saldo actual es: " + saldoDisponible);
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    break;
            }
        }
    }
}
