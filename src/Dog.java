public class Dog extends Animal {
    public static int dogToHumanYearMultiplier = 7;

    // Custom Constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    public static void outputDog(Dog dog) {
        System.out.println("A " + dog.age + " year old Dog called " + dog.name + "!");
    }

    public int getAgeInHumanYears() {
        return this.age * Dog.dogToHumanYearMultiplier;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " just barked!");
    }
}
