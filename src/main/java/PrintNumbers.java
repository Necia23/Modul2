import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {

        printNumbers();
    }

    private static void printNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną większą lub równą zeru: ");
        int userNumber = scanner.nextInt();

        if (userNumber >= 0) {

            for (int i = 0; i <= userNumber; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Podana liczba musi być naturalną większą lub równą zeru.");
        }

        scanner.close();
    }
}
