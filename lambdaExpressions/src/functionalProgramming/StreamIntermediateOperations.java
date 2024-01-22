package functionalProgramming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Walnut","Mandarin","Snowflake","Bobby","Roxy");

        // filter: filters the stream based on a predicate
        Stream<String> namesStartingWithB = names.stream().filter(name -> name.startsWith("B"));
        // if we want to use it, we need to transform the stream into a list
        List<String> streamToList = namesStartingWithB.toList();
        System.out.println(streamToList);

        //map : applies a function to each element in the stream
        Stream<Integer> nameLengths = names.stream().map(String::length);
        System.out.println(nameLengths.toList());

        //flatMap : applies a function to each element in the stream and flattens the resulting stream
        List<List<String>> nestedNames = Arrays.asList(Arrays.asList("Bobby","Django"),Arrays.asList("Horas","Johan","Mara"));
        Stream<String> flatNames = nestedNames.stream().flatMap(Collection::stream);
        System.out.println(flatNames.toList());

        // peak : performs an action on each element in the stream without modifying the stream
        Stream<String> namesWithPeek = names.stream().peek(System.out::println);

        // limit : limits the stream to a certain number of elements
        Stream<String> firstThreeNames = names.stream().limit(3);
        System.out.println(firstThreeNames.toList());

        //skip: skips the first n elements in the stream
        Stream<String> namesWithoutFirstTwo = names.stream().skip(2);
        System.out.println(namesWithoutFirstTwo.toList());

        //distinct: removes duplicate elements from the stream
        Stream<String> distinctNames = names.stream().distinct();

        //sorted: sorts the elements in the stream according to a comparator
        Stream<String> sortedNames = names.stream().sorted(Comparator.naturalOrder());
        System.out.println(sortedNames.toList());

    }
}
