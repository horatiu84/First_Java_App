public class InvalidAgeException extends Exception {

    public InvalidAgeException(){
        super();
    }

    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException(Exception e) {
        super(e);
    }

    /*
    Create a custom checked exception, create a method that might throw it, call this method and deal with the exception.

Steps:

1. Create a custom checked exception class InvalidAgeException that extends Exception.

2. Create a class CustomCheckedException.

3. In there, create a method validateAge that takes an int age parameter and throws InvalidAgeException.

4. Inside the method, check if the age is less than 0 or greater than 120.

5. If the age is invalid, throw an InvalidAgeException with a relevant message.

6. Add a throws clause to the method signature for validateAge.

7. In the main method, call the validateAge method inside a try/catch block.

8. Catch the InvalidAgeException and print its message.
     */
}
