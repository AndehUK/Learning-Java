public abstract class Animal {
    public String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void birthday() {
        this.age++;
    }

    public abstract void makeSound();
}
