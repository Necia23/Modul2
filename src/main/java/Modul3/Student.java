package Modul3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private int age;
    private double height;
    private String name;
    private String lastName;

    public Student(int age, double height, String name, String lastName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Student other) {
        int lastNameComparison = this.lastName.compareTo(other.getLastName());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        return Integer.compare(this.age, other.getAge());
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(20, 170, "John", "Doe"));
        students.add(new Student(22, 175, "Alice", "Smith"));
        students.add(new Student(21, 160, "Bob", "Johnson"));
        students.add(new Student(19, 180, "Emma", "Brown"));
        students.add(new Student(23, 165, "Michael", "Lee"));

        System.out.println("Lista przed sortowaniem:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);

        System.out.println("\nLista po sortowaniu:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
