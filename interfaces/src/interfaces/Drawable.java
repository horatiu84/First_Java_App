package interfaces;

public interface Drawable {
    void draw();

    /*
    Modify the Drawable interface to include a default method erase().

    Steps:

    1. Modify the Drawable interface.

    2. Add a default method erase() that prints "Erasing the drawing."
     */

    default void erase(){
        System.out.println("Erasing the drawing!");
    }

    default void printInfo(){
        System.out.println("Printing something else!");
    }
}
