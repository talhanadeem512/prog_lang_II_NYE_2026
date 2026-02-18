import java.util.Scanner;

public class WeatherLightningCake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        // Task 1
        
        System.out.print("Enter current temperature (°C): ");
        double temp = sc.nextDouble();

        if (temp < 0) {
            System.out.println("Below freezing");
        } else if (temp < 30) {
            System.out.println("Average");
        } else {
            System.out.println("Too hot");
        }

        System.out.println();

        // Task 2
        
        double seconds;

        do {
            System.out.print("How many seconds after lightning did you hear thunder? ");
            seconds = sc.nextDouble();

            if (seconds < 0) {
                System.out.println("Value cannot be negative. Try again.");
            }

        } while (seconds < 0);

        double distance = seconds * 300; // speed of sound = 300 m/s
        System.out.println("The lightning was approximately " + distance + " meters away.");

        System.out.println();

        // Task 3

        int age;

        do {
            System.out.print("How old are you? (between 1-20): ");
            age = sc.nextInt();

            if (age < 1 || age > 20) {
                System.out.println("Age must be between 1 and 20. Try again.");
            }

        } while (age < 1 || age > 20);

        // For Stars
        for (int i = 0; i < age; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // For Candles
        for (int i = 0; i < age; i++) {
            System.out.print("| ");
        }
        System.out.println();

        // For Cake base
        for (int i = 0; i < age; i++) {
            System.out.print("- ");
        }
        sc.close();
    }
}
