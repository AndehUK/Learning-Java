import java.util.*;

public class Main {
    // ArrayList, Maps and Sets (Collections)

    public static void main(String[] args) {
        String[] questions = new String[2];
        questions[0] = "How many States does the USA have?";
        questions[1] = "What is the Capital of the United Kingdom?";

        List<String> questionsList = new ArrayList<String>(); // No need to define the length
        questionsList.add("What language is spoken in Germany?");
        questionsList.add("How many States does the USA have?");
        questionsList.add("What is the Capital of the United Kingdom?");

        // Lists -> You can add entries dynamically

        // questionsList.remove("What language is spoken in Germany"); -> Remove by value
        // questionsList.remove(0); -> Remove by index

        System.out.println(questionsList.size());
        System.out.println(questionsList.get(0)); // -> Cannot use [index], you must use .get(index) for lists

        // You cannot define ArrayLists using primitive data types
        // However there are wrapper classes available to use instead
        // int -> Integer

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(42);
        numbers.add(1234);


        // Maps map a Key to a specific value called key-value pairs
        // All keys must be unique
        Map<String, String> countryToCapital = new HashMap<String, String>();
        countryToCapital.put("Germany", "Berlin");
        countryToCapital.put("France", "Paris");
        countryToCapital.put("Italy", "Rome");
        countryToCapital.put("USA", "Washington DC");

        System.out.println(countryToCapital.get("Germany"));
        System.out.println("Contains Key: Germany? " + countryToCapital.containsKey("Germany"));
        System.out.println("Contains Key: London? " + countryToCapital.containsValue("London"));
        countryToCapital.remove("France");
        System.out.println("Has France been removed? " + !countryToCapital.containsKey("France"));

        // Sets, a collection that contains no duplicate values
        // Returns a boolean value when adding, true means value was added, false means the value already exists
        Set<String> usernames = new HashSet<String>();
        usernames.add("Andeh");
        usernames.add("ExHiraku");
        usernames.add("Hiraku");
        boolean addedFirst = usernames.add("AndehUK");
        boolean addedSecond = usernames.add("Andeh");
        System.out.println("Successfully added AndehUK? " + addedFirst);
        System.out.println("Successfully added Andeh? " + addedSecond);


        // Possible Errors
        // Uncomment statements below to see Errors

        // IndexOutOfBoundException
        // If you try and pass an Index that does not exist for a list
        //System.out.println(questionsList.get(10));

        // Not an Exception, but returns a "null" value
        // If you pass a Key into a Map that does not exist
        // The return value is going to be null which could cause some problems down the line
        System.out.println(countryToCapital.get("Test"));
    }
}
