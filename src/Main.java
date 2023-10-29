import java.util.ArrayList;
import java.util.List;

public class Main {
    // Generics

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Pair<Integer, Float> pair = new Pair<>(22, 2f);
        Pair<Integer, ?> pair2 = new Pair<>(20, "Test");
        // The ? represents a wildcard type
    }
}