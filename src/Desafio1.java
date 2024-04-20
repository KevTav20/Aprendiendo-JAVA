import java.util.Random;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int intentos = 0;

        System.out.println("Bienvenido a adivine el numero\nEste juego consiste en adiviniar un numero que esta entre el 1 y el 100");
        //System.out.println(numeroAleatorio);
        String numeroIntentos = intentos > 1 ? "intentos" : "intento";

        while (intentos !=5){


            System.out.println("Ingrese un numero");
            int numero = entrada.nextInt();
            if (numero == numeroAleatorio){
                System.out.println("Has acertado en " + (intentos + 1) + " " + numeroIntentos);
            }else if (intentos == 4){
                System.out.println("Haz alcanzado el numero de intentos, gracias por participar");
            } else if (numero < numeroAleatorio) {
                System.out.println("El numero ingresado es mayor al numero Secreto");
            } else if (numero > numeroAleatorio) {
            System.out.println("El numero ingresado es menor al numero Secreto");
            }else {
                System.out.println("El numero ingresado es incorrecto, intente de nuevo");
            }
            intentos++;
        }

    }
}
