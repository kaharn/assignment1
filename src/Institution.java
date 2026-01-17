import java.util.ArrayList;
import java.util.List;

public class Institution {

    private int id;                 // DB primary key
    private String name;
    private String city;
    private int studentsCount;

    // Polymorphism
    private List<Person> people = new ArrayList<>();

    // Constructor for DB
    public Institution(int id, String name, String city, int studentsCount) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.studentsCount = studentsCount;
    }

    // Constructor without id
    public Institution(String name, String city, int studentsCount) {
        this.name = name;
        this.city = city;
        this.studentsCount = studentsCount;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    // Info method
    public String getInfo() {
        return "Institution{id=" + id +
                ", name='" + name +
                "', city='" + city +
                "', students=" + studentsCount + "}";
    }

    // Polymorphism methods
    public void addPerson(Person person) {
        people.add(person);
    }

    public void showPeople() {
        for (Person p : people) {
            System.out.println(p.getInfo());
        }
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
