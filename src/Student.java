public class Student extends Person {
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        super(name);
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getInfo() {
        return "Student: " + name + ", Age: " + age + ", GPA: " + gpa;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (Double.compare(student.gpa, gpa) != 0) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + Double.hashCode(gpa);
        return result;
    }
}