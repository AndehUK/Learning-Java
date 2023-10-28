public class Main {
    // Access Modifiers

    // public: Can be used anywhere
    // protected: Can be used in the same package
    // private: Completely private to the class it is defined in
    // static: Does not require an object to access
    // final: Essentially a constant variable

    public static void main(String[] args) {
        // Using the "Default Constructor"
        Dog doggo = new Dog();

        // Using our "Custom Constructor"
        Dog teddy = new Dog("teddy.png", "Teddy", 4);
        Dog jake = new Dog("jake.png", "Jake", 5);

        teddy.bark();
        jake.bark();

        System.out.println(teddy.getAge());
        System.out.println(jake.getAge());
        System.out.println(teddy.getAgeInHumanYears());
        System.out.println(jake.getAgeInHumanYears());

        Dog.outputDog(jake);
        Dog.outputDog(teddy);
    }
}