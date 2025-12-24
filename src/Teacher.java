public class Teacher extends Person {

    private String subject;
    private int experienceYears;

    // Constructor
    public Teacher(String name, String subject, int experienceYears) {
        super(name);
        this.subject = subject;
        this.experienceYears = experienceYears;
    }

    // Getters and Setters
    @Override
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    // Method
    @Override
    public String getInfo() {
        return "Teacher: " + name +
                ", Subject: " + subject +
                ", Experience: " + experienceYears + " years";
    }

    // ===== Assignment 2 required overrides =====

    @Override
    public String toString() {
        return getInfo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;

        Teacher teacher = (Teacher) o;

        if (experienceYears != teacher.experienceYears) return false;
        if (!name.equals(teacher.name)) return false;
        return subject.equals(teacher.subject);
    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + subject.hashCode();
        result = 31 * result + experienceYears;
        return result;
    }
}