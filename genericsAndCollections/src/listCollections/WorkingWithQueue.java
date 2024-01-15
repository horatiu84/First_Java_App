package listCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class WorkingWithQueue {

    // Queue is a data structures where elements are
    // added in the end and removed at the front!

    public static void main(String[] args) {
        //Queue<String> strings = new ArrayDeque<>();
        Deque<String> strings = new ArrayDeque<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C#");

        strings.push("JavaScript");

        System.out.println(strings);
        strings.pop();
        System.out.println(strings);

        strings.addFirst("JavaScript");
        strings.addLast("Rust");
        System.out.println(strings);
        System.out.println(strings.pollLast());
        System.out.println(strings);
    }
}
