import java.util.Scanner;

class Student {
    //Attributes
    String name;
    double[] grades;
    
    //Constructor to initialize name and grades
    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }
    
    //Method to calculate the average grade
    double calculateAverage() {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        
        return sum / grades.length;
    }
    
    //Method to display student information
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.print("Grades: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Average Grade: " + calculateAverage());
    }
}

public class Main {
    
    public static void main(String[] args) {

        double[] studentGrades = {85.5, 92.0, 78.5, 88.0, 95.5};
        Student student = new Student("John Doe", studentGrades);

        student.displayInfo();
        
        //Calculate and display average
        System.out.println("\nCalculated Average: " + student.calculateAverage());
    }
}