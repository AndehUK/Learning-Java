public class Main {
    // Boolean and Logical Operators

    public static void main(String[] args) {
        // Boolean and Logical Operators

        boolean aTruthyValue = true;
        boolean aFalsyValue = false;

        // Local Operators:
        // && (AND)
        // || (OR)
        // ! (NOT / NEGATION)

        boolean possible = aTruthyValue && aFalsyValue; // False, this will only be true if both values are truthy;
        System.out.println(possible);
        boolean maybePossible = aTruthyValue || aFalsyValue; // True, this will be true if at least 1 value is truthy;
        System.out.println(maybePossible);
        boolean invertedTruthy = !aTruthyValue; // False
        System.out.println(invertedTruthy);
        boolean invertedFalsy = !aFalsyValue; // True
        System.out.println(invertedFalsy);
    }
}