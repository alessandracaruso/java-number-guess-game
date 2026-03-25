import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;

        System.out.println("Indovina il numero (tra 1 e 100)");

        while (userGuess != numberToGuess) {
            System.out.print("Inserisci il tuo numero: ");
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Troppo basso!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Troppo alto!");
            } else {
                System.out.println("Hai indovinato!");
            }
        }

        scanner.close();
    }
}