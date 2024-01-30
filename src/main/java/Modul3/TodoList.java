package Modul3;
import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        if (tasks.isEmpty()) {
            System.out.println("Lista zadań jest pusta.");
        } else {
            System.out.println("Lista zadań:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void remove(int number) {
        if (number >= 1 && number <= tasks.size()) {
            tasks.remove(number - 1);
            System.out.println("Zadanie numer " + number + " zostało usunięte.");
        } else {
            System.out.println("Nieprawidłowy numer zadania.");
        }
    }
}
