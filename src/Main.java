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
    }
}
