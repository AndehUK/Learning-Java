public class Main {
    // Classes and Objects

    public static void main(String[] args) {
        // Using the "Default Constructor"
        Dog doggo = new Dog();

        // Using our "Custom Constructor"
        Dog teddy = new Dog("teddy.png", "Teddy", 1);
        Dog jake = new Dog("jake.png", "Jake", 1);

        teddy.bark();
        jake.bark();
    }
}