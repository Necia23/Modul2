package Modul3;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = sumArray(numbers);
        System.out.println("Suma elementów tablicy wynosi: " + sum);
    }

    public static int sumArray(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }
}
