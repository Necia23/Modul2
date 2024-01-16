import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        printTriangle();
    }

    private static void printTriangle() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj wysokość trójkąta (liczba całkowita większa od 0): ");
        int height = scanner.nextInt();


        if (height > 0) {

            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Wysokość trójkąta musi być liczbą całkowitą większą od 0.");
        }

        scanner.close();
    }
}
