import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private float[] marks = new float[3];

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        rollNumber = scanner.nextInt();
        System.out.println("Enter marks in 3 subjects: ");
        for (int i = 0; i < 3; i++) {
            marks[i] = scanner.nextFloat();
        }
    }

    public float calculateAverage() {
        float sum = 0;
        for (float mark : marks) {
            sum += mark;
        }
        return sum / 3;
    }

    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Marks: ");
        for (float mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks: " + calculateAverage());
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.inputDetails();
        student.displayDetails();
    }
}
