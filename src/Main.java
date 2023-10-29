import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Main {
    // Lambda Expressions and the Supplier Class
    // Lambdas are functional interfaces
    // Lambdas allow you to save the execution for when you call .get() on the lambda expression

    // Supplier<Type> typeSupplier = (type[] args) -> method()

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        Supplier<LocalDateTime> dateSupplier = () -> LocalDateTime.now();

        System.out.println(dateTime);
        System.out.println(dateSupplier.get());

        System.out.println("Waiting for 3 seconds!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(dateTime);
        System.out.println(dateSupplier.get());
    }
}