class Student {
    private String name;
    private static int studentCount = 0;

    public Student(String name) {
        this.name = name;
        studentCount++;
    }

    public String getName() {
        return name;
    }

    public static void printStudentCount() {
        System.out.println("Total students created: " + studentCount);
    }
}

public class StudentProgram {
    public static void main(String[] args) {
        Student.printStudentCount();

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Carol");

        System.out.println(s1.getName());
        System.out.println(s2.getName());
        System.out.println(s3.getName());
        Student.printStudentCount();
    }
}