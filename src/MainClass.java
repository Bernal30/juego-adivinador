import java.util.Scanner;
import com.empresa.adivinator.calculos.SecretNumber;

public class MainClass {
    public static void main(String[] args ) {

        String userName;
        int userNumber;
        int userTry = 1;

        //comunicación con el usuario a través de la consola (no olvidar el scanner.close();)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bienvenido al juego el Adivinador!, ¿Cuál es su nombre? ");
        //nombre del usuario
        userName = scanner.next();
        //número de usuario
        System.out.print(userName + ", intente adivinar el número entre 1 y 100, eliga un número: ");
        userNumber = scanner.nextInt();

        //instancia de objeto numero secreto
        SecretNumber secretNumber = new SecretNumber();

        System.out.println("Número de usuario: " + userNumber);

        //comprobar número secreto en consola
        System.out.println("El numero aleatorio es: " + secretNumber.getRandomNumber());

        //logica del juego
        while (true) {
            if (userNumber == secretNumber.getRandomNumber()) {
                //si el usuario acerta
                System.out.println("Acertaste!, el número es "
                        + secretNumber.getRandomNumber() +
                        ", lo hiciste en " + userTry + " intento(s).");
                break;
            } else if (userNumber > secretNumber.getRandomNumber()) {
                System.out.print("El número secreto es menor, intentelo otra vez: ");
                userNumber = scanner.nextInt();
            } else {
                System.out.print("El número secreto es mayor, intentelo otra vez: ");
                userNumber = scanner.nextInt();
            }
            userTry++;
        }
        scanner.close();
    }
}
