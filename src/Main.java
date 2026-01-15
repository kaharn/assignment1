public class Main {
    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();

        // CREATE
        studentDAO.insertStudent("Kakhar", 19, 3.5);
        studentDAO.insertStudent("Nassyrkhan", 20, 3.8);

        // READ
        System.out.println("=== STUDENTS FROM DATABASE ===");
        studentDAO.getAllStudents();

        // UPDATE
        studentDAO.updateStudentGpa(1, 3.9);
    }
}
