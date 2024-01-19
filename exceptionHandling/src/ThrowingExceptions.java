import java.io.IOException;

public class ThrowingExceptions {
    public static void main(String[] args) throws Exception {
       // divide(2,0);

        validate(-5);
    }

    public static void divide(int a,int b) throws IOException{
        if(b == 0) {
            throw new IOException("Cannot divide by zero!");
        }
        System.out.println(a/b);
    }

    public static void validate(int num)  {
        if (num <0) {
            throw new IllegalArgumentException("Number is negative!");
        }
    }

    /*
    Create a method that throws an IllegalArgumentException if the provided number is negative.

    Steps:

    1. Create a class ThrowingExceptions.

    2. In there, create a method validateNumber that takes an int parameter.

    3. Inside the method, check if the number is negative.

    4. If the number is negative, throw an IllegalArgumentException with a relevant message.
     */
}
