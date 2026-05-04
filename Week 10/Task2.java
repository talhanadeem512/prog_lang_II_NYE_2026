import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    static class Student {
        String id;
        String name;
        int grade;

        Student(String id, String name, int grade) {
            this.id = id;
            this.name = name;
            this.grade = grade;
        }

        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
        }
    }

    public static void main(String[] args) {
        Map<String, Student> database = new HashMap<>();
        database.put("S001", new Student("S001", "Alice", 90));
        database.put("S002", new Student("S002", "Bob", 85));
        database.put("S003", new Student("S003", "Charlie", 78));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String inputId = scanner.nextLine();

        if (database.containsKey(inputId)) {
            System.out.println(database.get(inputId));
        } else {
            System.out.println("Error: No student found with ID " + inputId);
        }
    }
}