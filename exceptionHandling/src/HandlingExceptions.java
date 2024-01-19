public class HandlingExceptions {
    /*
    Call the validateNumber method from the previous exercise inside a try/catch block and handle the IllegalArgumentException.

    Steps:

    1. Create a class HandlingExceptions.

    2. In there, create a main method.

    3. Inside the main method, call the validateNumber method inside a try/catch block.

    4. Catch the IllegalArgumentException and print its message.
     */

    public static void main(String[] args) {
        try {
            ThrowingExceptions.validate(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Done!");
    }
}
