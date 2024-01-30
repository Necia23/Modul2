import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        double average = calculateAverage();
        System.out.println("Średnia z podanych liczb to: " + average);
    }

    private static double calculateAverage() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj pierwszą liczbę: ");
        double num1 = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double num2 = scanner.nextDouble();

        System.out.print("Podaj trzecią liczbę: ");
        double num3 = scanner.nextDouble();


        scanner.close();


        if (num1 > 0 && num2 > 0 && num3 > 0) {

            return (num1 + num2 + num3) / 3;
        } else {

            System.out.println("Wszystkie liczby powinny być większe od 0.");
            return Double.NaN;
        }
    }
}
