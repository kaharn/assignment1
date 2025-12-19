public class Institution {
    private String name;
    private String city;
    private int studentsCount;

    // Constructor
    public Institution(String name, String city, int studentsCount) {
        this.name = name;
        this.city = city;
        this.studentsCount = studentsCount;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    // Method
    public String getInfo() {
        return "Institution: " + name + ", City: " + city + ", Students: " + studentsCount;
    }
}
