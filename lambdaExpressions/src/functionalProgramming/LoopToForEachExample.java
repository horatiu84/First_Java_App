package functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    /*
    Rewrite a for loop that prints each string in a list using the forEach method.

    Steps:

    1. Create a class named LoopToForEachExample with a main method.

    2. In the main method, create a List of strings.

    3. Consider the following for loop:

            for (String s : strings) {
                System.out.println(s);
            }

    4. Replace the for loop with the forEach method and a lambda expression.
         */

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ion","Vasile","Maria","Dan","Stefan","Diana");

        //using lambda expresions
        names.forEach(s -> System.out.println(s));

        // using stream
        names.stream().forEach(System.out::println);


        /*
    2. In the main method, create a List of integers.

    3. Use the stream API to square each number in the list and then calculate the sum using the reduce method.
         */
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);
        int sumOfSquares = num.stream()
                .map(n->n*2)
                .reduce(0,Integer::sum);
        System.out.println(sumOfSquares);
    }
}
