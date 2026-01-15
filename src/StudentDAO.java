import java.sql.*;
public class StudentDAO {

    // CREATE
    public void insertStudent(String name, int age, double gpa) {
        String sql = "INSERT INTO students(name, age, gpa) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setDouble(3, gpa);
            ps.executeUpdate();

            System.out.println("Student inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ
    public void getAllStudents() {
        String sql = "SELECT * FROM students";

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getInt("age") + " | " +
                                rs.getDouble("gpa")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateStudentGpa(int id, double newGpa) {
        String sql = "UPDATE students SET gpa = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDouble(1, newGpa);
            ps.setInt(2, id);
            ps.executeUpdate();

            System.out.println("Student updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Student deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
