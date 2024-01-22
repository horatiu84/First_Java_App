package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsExample {

    /*
    Use the stream API to perform multiple intermediate operations on a list of strings.

    Steps:

    1. Create a class named IntermediateOperationsExample with a main method.

    2. In the main method, create a List of strings.

    3. Use the stream API to filter out strings with fewer than 6 characters, convert them to uppercase, and collect the results in a new list.


     */

    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Romania","Germany","Italy","France","China","Iran","Irak");

        List<String> filtredCountries = countries.stream()
                .filter(n->n.length()>6)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filtredCountries);
    }
}
