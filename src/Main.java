import java.util.ArrayList;
import java.util.List;

public class Main {
    // Inheritance and Polymorphism

    // Inside the other classes in this package, I have started using formatted strings.
    // This is because it creates an intermediate object as a result of multiple strings
    // being concatenated, essentially creating a new instance in memory every time
    // you do the operation.

    public static void main(String[] args) {
        Dog teddy = new Dog("Teddy", 4);
        Dog jake = new Dog("Jake", 5);

        Dog.outputDog(jake);

        Cat itchy = new Cat("Itchy", 10);
        Cat scratchy = new Cat("Scratchy", 10);

        Bird chirp = new Bird("Chirp", 2);

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

        Animal animal = new Dog("Tilly", 12);
        animal.makeSound();
        // Will use the Dog class' overridden version despite being typed as an Animal

        List<IPettable> newPets = new ArrayList<IPettable>();
        newPets.add(chirp);
        pets.add(jake);
        pets.add(teddy);

        for (IPettable pet : newPets) {
            pet.pet();
        }
    }
}