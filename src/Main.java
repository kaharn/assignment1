import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n===== ASSIGNMENT 3 MENU =====");
            System.out.println("1. Add student");
            System.out.println("2. Show all students");
            System.out.println("3. Update student GPA");
            System.out.println("4. Delete student");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();

                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();

                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();

                    studentDAO.insertStudent(name, age, gpa);
                    break;

                case 2:
                    studentDAO.getAllStudents();
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter new GPA: ");
                    double newGpa = scanner.nextDouble();

                    studentDAO.updateStudentGpa(id, newGpa);
                    break;

                case 4:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = scanner.nextInt();

                    studentDAO.deleteStudent(deleteId);
                    break;

                case 0:
                    running = false;
                    System.out.println("Program finished.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}