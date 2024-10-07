import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        int inputCount = 3;
        Random rand = new Random();
        int computerNumber = rand.nextInt(100) + 1;

        System.out.println("Sayı tahmin oyununa hoş geldin! 1-100 arasında bir sayı tahmin et. 3 deneme hakkın var.");
        Scanner keyboard = new Scanner(System.in);

        while (inputCount > 0) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            int userGuess = getUserInput(keyboard);

            if (userGuess == computerNumber) {
                System.out.println("Tebrikler! Doğru tahmin.");
                return;
            } else {
                inputCount--;
                if (userGuess < computerNumber) {
                    System.out.println("Yanlış! Daha yüksek bir sayı seçmelisiniz. Kalan hak: " + inputCount);
                } else {
                    System.out.println("Yanlış! Daha düşük bir sayı seçmelisiniz. Kalan hak: " + inputCount);
                }

                if (inputCount == 0) {
                    System.out.println("Oyun bitti! Doğru sayı: " + computerNumber);
                }
            }
        }
    }

    public static int getUserInput(Scanner scanner) {
        int guess = 0;
        while (true) {
            try {
                guess = Integer.parseInt(scanner.nextLine());
                if (guess < 1 || guess > 100) {
                    System.out.println("Lütfen 1 ile 100 arasında bir sayı giriniz.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
            }
        }
        return guess;
    }
}
