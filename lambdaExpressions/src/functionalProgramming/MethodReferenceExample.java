package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodReferenceExample {
    /*
    Convert a list of strings to uppercase using a method reference.

    Steps:

    1. Create a class named MethodReferenceExample with a main method.

    2. In the main method, create a List of strings.

    3. Use the stream API and a method reference to convert each string in the list to uppercase

    4. Use collect to get the results in a new list.
     */

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Something","anything","everything","thing");
        Stream<String> namesUpercase = names.stream().map(String::toUpperCase);
        List<String> namesListUpercase = namesUpercase.toList();
        System.out.println(namesListUpercase);

        /*
        Use the stream API to filter a list of integers and then square the remaining numbers.

Steps:

    1. Create a class named StreamExample with a main method.

    2. In the main method, create a List of integers.

    3. Use the stream API to filter out even numbers

    4. Next, square each remaining number.

    5. Use collect to get the results in a new list.
         */

        Stream<Integer> filteredNumbers = names.stream()
                .map(String::length)
                .filter(nr->nr%2!=0)
                .map(nr->nr*nr);
        System.out.println(filteredNumbers.toList());

    /*
    Count the number of even numbers in a list of integers using the stream API.

    Steps:

    1. Create a class named TerminalOperationsExample with a main method.

    2. In the main method, create a List of integers.

    3. Use the stream API to count the number of even numbers in the list.


     */

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long evenNumbers = numbers.stream()
                .filter(n->n%2==0)
                .count();
        System.out.println(evenNumbers);

    }

}
