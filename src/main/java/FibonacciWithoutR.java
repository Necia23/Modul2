import java.util.Scanner;

public class FibonacciWithoutR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj długość ciągu Fibonacciego: ");
        int sequenceLength = scanner.nextInt();

        if (sequenceLength <= 0) {
            System.out.println("Długość ciągu musi być większa od zera.");
            return;
        }

        System.out.println("Liczby ciągu Fibonacciego dla " + sequenceLength + ":");
        printFibonacciSequence(sequenceLength);
    }

    public static void printFibonacciSequence(int length) {
        int a = 0;
        int b = 1;
        System.out.print(a + ", " + b);

        for (int i = 2; i < length; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }

        System.out.println();
    }
}
