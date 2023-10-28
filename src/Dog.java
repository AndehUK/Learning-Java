public class Dog {
    public static int dogToHumanYearMultiplier = 7;
    // Adding some fields to the Dog class
    public String picture;
    public String name;
    private int age;

    // Default Constructor
    public Dog() {
    }

    // Custom Constructor
    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public static void outputDog(Dog dog) {
        System.out.println("A " + dog.age + " year old Dog called " + dog.name + "!");
    }

    public void bark() {
        System.out.println(this.name + " just barked!");
    }

    public void birthday() {
        this.age++;
    }

    public int getAge() {
        return age;
    }

    public int getAgeInHumanYears() {
        return this.age * Dog.dogToHumanYearMultiplier;
    }
}
