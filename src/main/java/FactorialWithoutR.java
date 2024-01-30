import java.util.Scanner;
public class FactorialWithoutR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną większą od zera: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Podana liczba musi być większa od zera.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println("Silnia z " + n + " wynosi: " + factorial);
        }
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
