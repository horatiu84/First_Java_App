package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumValueExample {
    /*
    Exercise: Find Maximum Value using Stream API
    Find the maximum value in a list of integers using the stream API.

    Steps:

    1. Create a class named MaximumValueExample with a main method.

    2. In the main method, create a List of integers.

    3. Use the stream API to find the maximum value in the list.


     */

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,2,15,11,52,25);
        int max = numbers.stream().reduce(0,Integer::max);
        Optional<Integer> max2 = numbers.stream().max(Integer::max);
        System.out.println(max);
    }
}
