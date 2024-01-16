import java.util.Scanner;

    public class Factorial {
        public static void main(String[] args) {
            calculateFactorial();
        }

        private static void calculateFactorial() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj liczbę naturalną większą od zera: ");
            int userNumber = scanner.nextInt();

            if (userNumber > 0) {
                long factorial = calculateFactorial(userNumber);
                System.out.println("Silnia z " + userNumber + " to: " + factorial);
            } else {
                System.out.println("Podana liczba musi być naturalną większą od zera.");
            }

            scanner.close();
        }

        private static long calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculateFactorial(n - 1);
            }
        }
    }
