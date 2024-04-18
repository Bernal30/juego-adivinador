
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args ) {

        String userName;
        int userNumber;
        int userTrys;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bienvenido al juego el Adivinador!, ¿Cuál es su nombre? ");
        //nombre del usuario
        userName = scanner.next();
        //número de usuario
        System.out.print(userName + ", elige un número entre 1 y 100: ");
        userNumber = scanner.nextInt();


    }
}
