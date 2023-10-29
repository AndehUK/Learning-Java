public class Main {
    // Strings and String Methods

    public static void main(String[] args) {
        String sentence = "I am learning Java!";
        System.out.println(sentence);
        System.out.println("Length of sentence is " + sentence.length() + " characters!"); // 19

        // Upper and Lower Case
        System.out.println("Shouting: " + sentence.toUpperCase());
        System.out.println("Whispering: " + sentence.toLowerCase());

        // indexOf
        System.out.println("The word 'Java' is found at position: " + sentence.indexOf("Java"));

        // Replace
        System.out.println(sentence.replace("Java", "C++"));

        // Is the string empty?
        String s = "";
        boolean empty = s.isEmpty();
        System.out.println("'" + s + "' => Is this string empty? " + empty);

        // startsWith and endsWith
        System.out.println("Does the sentence start with an 'I'? " + sentence.startsWith("I"));
        System.out.println("Does this sentence end with a '?'? " + sentence.endsWith("?"));

        // contains
        System.out.println("Does this sentence contain the word 'Java'? " + sentence.contains("Java"));

        // charAt
        System.out.println("The character at index '10' is: '" + sentence.charAt(10) + "'");

        // substring
        s = sentence.substring(10);
        System.out.println("The sentence substringed at index 10 is: " + sentence.substring(10));
    }
}
