package banking;

public class Person {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int age;

    public Person(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) {
        this(firstName, null, lastName, age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

    public int getAge() {
        return age;
    }

    public boolean isOlderThan(int age) {
        return this.age > age;
    }

    public void birthday() {
        this.age++;
    }
}
