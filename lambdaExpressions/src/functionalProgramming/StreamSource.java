package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSource {
    public static void main(String[] args) {
        //Creating a stream from a collection
        List<String> names = Arrays.asList("Wallnut","Mandarin","Snow flake");
        Stream<String> namesStream = names.stream();

        //Creating a stream from an array
        String[] namesArray = {"Walnut","Snow flake"};
        Stream<String> namesArrayStream = Arrays.stream(namesArray);

        //Creating a stream using the Stream.iterate() method
        Stream<Integer> infineteStream = Stream.iterate(0, n->n+1);

        //Creating a stream  the Stream.generate() method
        Stream<Double> randomNumbersStream = Stream.generate(Math::random);
    }
}
