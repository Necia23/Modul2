package Calculator;

import java.util.Scanner;

public class Calculator {

    public void start() {
        displayInstructions();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String operation = getOperationFromUser();
            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Koniec programu.");
                break;
            }

            int firstNumber = getNumberFromUser();
            int secondNumber = getNumberFromUser();

            switch (operation) {
                case "+":
                    System.out.println("Wynik dodawania: " + add(firstNumber, secondNumber));
                    break;
                case "-":
                    System.out.println("Wynik odejmowania: " + subtract(firstNumber, secondNumber));
                    break;
                case "*":
                    System.out.println("Wynik mnożenia: " + multiply(firstNumber, secondNumber));
                    break;
                case "/":
                    if (isMoreThan0(secondNumber)) {
                        System.out.println("Wynik dzielenia: " + divide(firstNumber, secondNumber));
                    } else {
                        System.out.println("Nie można dzielić przez 0. Spróbuj ponownie.");
                    }
                    break;
                default:
                    System.out.println("Nieprawidłowa operacja. Spróbuj ponownie.");
            }
        }

        scanner.close();
    }

    private void displayInstructions() {
        System.out.println("Witaj w kalkulatorze!");
        System.out.println("Dostępne operacje: +, -, *, /");
        System.out.println("Aby zakończyć program, wpisz 'exit'.");
    }

    private String getOperationFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj operację (+, -, *, /): ");
        return scanner.nextLine();
    }

    private int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Podaj liczbę większą od 0: ");
            while (!scanner.hasNextInt()) {
                System.out.println("To nie jest liczba. Wpisz liczbę całkowitą.");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (!isMoreThan0(number));
        return number;
    }

    private boolean isMoreThan0(int number) {
        return number > 0;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int divide(int a, int b) {
        return a / b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }
}
