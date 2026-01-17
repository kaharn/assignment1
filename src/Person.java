public abstract class Person {

    protected String name;

    public Person(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    // Polymorphic
    public abstract String getInfo();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}