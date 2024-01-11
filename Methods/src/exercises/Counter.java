package exercises;

public class Counter {
    /*
    Create a class with a static field and method, and access them from another class.

    Steps:

    1. Create a class named Counter.

    2. Inside the Counter class, create a static field named count and a static method named increment.

    3. In the increment method, increment the count field.

    4. Create another class named Main.

    5. In the main method of the Main class, call the increment method and access the count field.
     */


    public static int count = 1;

    public static void increment(){
        count++;
    }
}
