package interfaces;

public interface Prey {
    void runAndHide();


    // conflicting methods

    default void run(){
        System.out.println("Pray is running!");
    }
}
