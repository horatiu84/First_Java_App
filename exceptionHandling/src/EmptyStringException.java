public class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }

    public EmptyStringException() {
        super();
    }

    public EmptyStringException(Exception e) {
        super(e);
    }

    /*
    Create a method that throws a custom checked exception when a provided string is empty.

Steps:

1. Create a custom checked exception class EmptyStringException that extends Exception.

2. Create a class CheckedVsUnchecked

3. In there, create a method validateString that takes a String parameter.

4. Inside the method, check if the string is empty.

5. If the string is empty, throw an EmptyStringException with a relevant message.

6. You can now see it shows the red squiggly line, because it is a checked exception. It didn’t do this for the method that was throwing the IllegalArgumentException, because that exception is unchecked.

7. Solve it by adding a throws clause to the method signature for validateString.
     */
}
