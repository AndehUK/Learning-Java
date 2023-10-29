public class Main {
    // Anonymous Classes

    // Anonymous Classes are usually used for Abstract Classes.
    // They essentially allow you to subclass a given class without actually subclassing it.

    public static void main(String[] args) {
        Person andrew = new Person("Andrew", "Mason", 20);

        Person manager = new Person("John", "Doe", 42) {
            @Override
            public String getFullName() {
                return "Manager %s".formatted(super.getFullName());
            }
        };
    }
}