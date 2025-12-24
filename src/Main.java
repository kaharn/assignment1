import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Kakhar", 19, 3.5);
        Student student2 = new Student("Nassyrkhan", 20, 3.8);

        Teacher teacher = new Teacher("Mr. Smith", "Programming", 10);

        Institution university = new Institution("Astana IT University", "Astana", 8000);

        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(teacher.getInfo());
        System.out.println(university.getInfo());

        if (student1.getGpa() > student2.getGpa()) {
            System.out.println(student1.getName() + " has a higher GPA than " + student2.getName());
        } else {
            System.out.println(student2.getName() + " has a higher GPA than " + student1.getName());
        }


        university.addPerson(student1);
        university.addPerson(student2);
        university.addPerson(teacher);

        System.out.println("\n=== ALL PEOPLE ===");
        university.showPeople();

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        System.out.println("\n=== GPA > 3.6 ===");
        students.stream()
                .filter(s -> s.getGpa() > 3.6)
                .forEach(System.out::println);

        System.out.println("\n=== SORTED BY GPA ===");
        students.sort(Comparator.comparingDouble(Student::getGpa));
        students.forEach(System.out::println);
    }
}