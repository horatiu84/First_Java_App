package interfaces;

public interface Countable {
    default void printInfo(){
        System.out.println("Printing something!");
    }
}
