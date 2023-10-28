public class Bird extends Animal implements IPettable, IFly {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.printf("%s just chirped!", this.name);
    }

    @Override
    public void fly() {
        System.out.printf("%s has gone for a fly!", this.name);
    }

    @Override
    public void pet() {
        System.out.printf("Petted %s!", this.name);
    }
}
