import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

        double minNumber = findMinNumber();
        System.out.println("Najmniejsza liczba to: " + minNumber);
    }

    private static double findMinNumber() {
        Scanner scanner = new Scanner(System.in);

        double minNumber = Double.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Podaj liczbę " + i + ": ");
            double currentNumber = scanner.nextDouble();

            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        }

        scanner.close();

        return minNumber;
    }
}
