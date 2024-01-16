import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {

        printFibonacciSequence();
    }

    private static void printFibonacciSequence() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną większą od zera: ");
        int userNumber = scanner.nextInt();

        if (userNumber > 0) {

            for (int i = 0; i < userNumber; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        } else {
            System.out.println("Podana liczba musi być naturalną większą od zera.");
        }

        scanner.close();
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}