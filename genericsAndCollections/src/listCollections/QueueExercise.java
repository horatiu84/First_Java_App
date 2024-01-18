package listCollections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExercise {
    public static void main(String[] args) {
        Queue<Character> someQueue = new ArrayDeque<>();

        someQueue.add('c');
        someQueue.add('f');
        someQueue.add('b');

        System.out.println(someQueue);
    }
}
