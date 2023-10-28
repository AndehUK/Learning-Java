public class Dog {
    // Adding some fields to the Dog class
    public String picture;
    public String name;
    public int age;

    // Default Constructor
    public Dog() {}

    // Custom Constructor
    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println(this.name + " just barked!");
    }
}
