public class Dog extends Animal implements IPettable {
    public static int dogToHumanYearMultiplier = 7;

    // Custom Constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    public static void outputDog(Dog dog) {
        System.out.printf("A %s year old Dog called %s!%n", dog.age, dog.name);
    }

    public int getAgeInHumanYears() {
        return this.age * Dog.dogToHumanYearMultiplier;
    }

    @Override
    public void makeSound() {
        System.out.printf("%s just barked!", this.name);
    }

    @Override
    public void pet() {
        System.out.printf("Petted %s!", this.name);
    }
}
