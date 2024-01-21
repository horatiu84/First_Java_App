@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);

    default void hi(){
        System.out.println("Hi!");
    }
}
