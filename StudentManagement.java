import java.util.Scanner;

class Student {
    int rollno;
    String name;
    int age;
    double mark;
    

    Student(int rollno, String name, int age, double mark) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.mark = mark;
       
    }

    void displayStudentDetails() {
        System.out.println("Name of the student: " + name);
        System.out.println("Roll no: " + rollno);
        System.out.println("Age of student: " + age);
        System.out.println("Marks: " + mark);
        System.out.println(); // spacing
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Roll no: ");
            int rollno = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Marks: ");
            double mark = scanner.nextDouble();

            students[i] = new Student(rollno, name, age, mark);
            
        }

        System.out.println("\nDisplaying student details:");
        for (Student stu : students) {
            stu.displayStudentDetails();
        }

        scanner.close();
    }
}
