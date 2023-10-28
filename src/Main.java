import java.util.ArrayList;
import java.util.List;

public class Main {
    // Inheritance and Polymorphism

    public static void main(String[] args) {
        Dog teddy = new Dog("Teddy", 4);
        Dog jake = new Dog("Jake", 5);

        Cat itchy = new Cat("Itchy", 10);
        Cat scratchy = new Cat("Scratchy", 10);

        itchy.makeSound();
        teddy.makeSound();
        jake.makeSound();
        scratchy.makeSound();


        // Polymorphism
        List<Animal> pets = new ArrayList<Animal>();
        pets.add(teddy);
        pets.add(jake);
        pets.add(itchy);
        pets.add(scratchy);

        pets.get(1).makeSound();

        Animal pet = new Dog("Tilly", 12);
        pet.makeSound();
        // Will use the Dog class' overridden version despite being typed as an Animal
    }
}