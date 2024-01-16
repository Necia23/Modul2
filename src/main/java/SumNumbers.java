import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        int sum = sumNumbers();
        System.out.println("Suma liczb od 0 do podanej liczby to: " + sum);
    }

    private static int sumNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną większą lub równą zeru: ");
        int userNumber = scanner.nextInt();

        if (userNumber >= 0) {
            int sum = 0;

            for (int i = 0; i <= userNumber; i++) {
                sum += i;
            }

            scanner.close();

            return sum;
        } else {
            System.out.println("Podana liczba musi być naturalną większą lub równą zeru.");
            scanner.close();
            return -1;
        }
    }
}
