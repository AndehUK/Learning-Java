public class Cat extends Animal implements IPettable {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.printf("%s just meowed!", this.name);
    }

    @Override
    public void pet() {
        System.out.printf("Petted %s!", this.name);
    }
}
