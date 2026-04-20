import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");
        students.add("Eve");

        students.remove(2); // removes 3rd element (index 2)

        System.out.println("Final size: " + students.size());
        for (String name : students) {
            System.out.println(name);
        }
    }
}