package listCollections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> someSet = new HashSet<>();

        someSet.add(1);
        someSet.add(2);
        someSet.add(3);
        someSet.add(4);

        System.out.println(someSet);
    }
}
