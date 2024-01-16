import java.util.Scanner;

public class GreaterThanZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();

        if (number >=0) {
            System.out.println("Fałsz. Liczba nie jest mniejsza od zera.");
        } else if (number < 0) {
            System.out.println("Prawda. Liczba jest mniejsza od zera");
        }

        scanner.close();
    }
}

