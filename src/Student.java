public class Student extends Person {
    private int age;
    private double gpa;

    // Constructor
    public Student(String name, int age, double gpa) {
        super(name);
        this.age = age;
        this.gpa = gpa;
    }

    // Getters and Setters
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

    // Method
    @Override
    public String getInfo() {
        return "Student: " + name + ", Age: " + age + ", GPA: " + gpa;
    }

    // ===== Assignment 2 required overrides =====

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
        if (Double.compare(student.gpa, gpa) !=
