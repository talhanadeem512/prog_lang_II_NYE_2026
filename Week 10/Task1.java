import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> guests = new HashSet<>();

        System.out.println("Enter guest names (type 'exit' to stop):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("exit")) break;
            guests.add(name);
        }

        List<String> sortedGuests = new ArrayList<>(guests);
        Collections.sort(sortedGuests);

        for (String guest : sortedGuests) {
            System.out.println(guest);
        }
        scanner.close();
    }
}