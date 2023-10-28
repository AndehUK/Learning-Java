public class Arrays {
    public static void main(String[] args) {
        String[] questions = new String[3]; // Created a new array of strings with a maximum length of 3
        questions[0] = "How many States does the USA have?";
        questions[1] = "What is the capital of the United Kingdom?";
        questions[2] = "What is the chemical symbol for Iron?";

        String[] answers = new String[3];
        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";

        System.out.println(questions[0]);
        System.out.println(answers[0]);

        // Override value at index:
        questions[0] = "This is an example question!";
        answers[0] = "This is an example answer!";
        System.out.println(questions[0]);
        System.out.println(answers[0]);

        // ArrayIndexOutOfBoundsException (Uncomment Line Below)
        // System.out.println(questions[3]);
    }
}
