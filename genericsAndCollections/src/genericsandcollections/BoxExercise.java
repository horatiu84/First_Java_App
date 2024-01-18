package genericsandcollections;

public class BoxExercise {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(10);

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello");

        System.out.println(stringBox.getContent());
        System.out.println(integerBox.getContent());
    }
}
