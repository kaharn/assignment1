import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDAO {

    private static final Logger logger =
            Logger.getLogger(StudentDAO.class.getName());

    // CREATE
    public void insertStudent(String name, int age, double gpa) {
        String sql = "INSERT INTO students(name, age, gpa) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setDouble(3, gpa);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student inserted successfully");
            }

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error inserting student", e);
        }
    }

    // READ
    public void getAllStudents() {
        String sql = "SELECT * FROM students";

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("ID | NAME | AGE | GPA");
            System.out.println("----------------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getInt("age") + " | " +
                                rs.getDouble("gpa")
                );
            }

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error reading students", e);
        }
    }

    // UPDATE
    public void updateStudentGpa(int id, double newGpa) {
        String sql = "UPDATE students SET gpa = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDouble(1, newGpa);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student GPA updated successfully");
            }

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error updating GPA", e);
        }
    }

    // DELETE
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student deleted successfully");
            }

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error deleting student", e);
        }
    }
}