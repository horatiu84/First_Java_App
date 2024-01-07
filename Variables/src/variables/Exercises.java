package variables;

public class Exercises {
    public static void main(String[] args) {
        // EXERCISE 1

        /*
        Assign two integer values and print them.

        Steps:

        1. Create a new class for this exercise, add a main method.

        2. In the main method:

        a. Declare two int variables a and b.
        b. Assign values to a and b.
        c. Print the values of a and b.
         */

        int a = 5;
        int b = 10;
        System.out.println("a : " + a + " and b is : " + b);


        // EXERCISE 2

        /*
        Assign two floating-point values and print their sum.

        Steps:

        1. Create a new class for this exercise, add a main method.

        2. Declare two float variables x and y.

        3. Assign values to x and y.

        4. Calculate the sum of x and y and store the result in a variable sum. What should the type of the variable be?

        5. Print the result.
         */

        float x = 2.3f;
        float y = 4.5f;
        float sum = y+x;

        System.out.println(sum);


        // EXERCISE 3

        /*
                Assign two strings and print their concatenation.

        Steps:

        1. Create a new class for this exercise, add a main method.

        2. Declare two String variables str1 and str2.

        3. Assign values Hello and World to str1 and str2 respectively.

        4. Concatenate str1 and str2 and store the result in a variable named result. What should the type be?

        5. Print the concatenated string.


         */

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;
        System.out.println(str3);

        // EXERCISE 4

        /*
        Initialize an integer array and print its elements.

        Steps:

        1. Create a new class for this exercise, add a main method.

        2. Declare an int array numbers.

        3. Assign the values 1 - 5 to the array.

        4. Print the elements of the array.
         */

        int[] arr = {1,2,3,4,5};
        System.out.println("Array elements:");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //EXERCICE 5

        /*
        Assign two integer values, multiply them, and print the result.

        Steps:

        1. Create a new class for this exercise, add a main method.

        2. Declare two int variables a and b.

        3. Assign values to a and b.

        4. Multiply a and b and store the result in a variable.

        5. Print the result.


         */

        int c = 5;
        int d = 10;
        int prod = c*d;
        System.out.println("Product is: " + prod);

        //EXERCISE 6

        /*
        Assign a string value and print its length.

        Steps:

        1. Create a new class for this exercise, add a main method.

        2. Declare a String variable text.

        3. Assign the value Java Programming to text.

        4. Find the length of text and store this in a variable. Give the variable a sensible name. The type should be an int, since it’s a non-floating point number.

        5. Print the length.

         */
        String text = "Java Programming";
        int lengText = text.length();
        System.out.println("Length of text is : " + lengText);


        // EXERCISE 7

        /*
        Initialize a string array and print its elements.

        Steps:

        1. Create a new class for this exercise, add a main method.

        2. Declare a String array fruits.

        3. Assign your four favorite fruits to the array.

        4. Print the elements of the array.


         */

        String[] fruits = {"banana","apple","kaki","kiwi"};
        System.out.println("My favorite fruits are : ");
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);



        // EXERCISE 8

    /*
    Assign two double values, divide them, and print the result.

    Steps:

    1. Create a new class for this exercise, add a main method.

    2. Declare two double variables x and y.

    3. Assign values to x and y.

    4. Divide x by y and store the result in a variable.

    5. Print the result.

     */

        double nr1 = 15;
        double nr2 = 7;
        double res = nr1/nr2;
        System.out.println("Result is " + res);

        // EXERCISE 9

        /*
        Assign a double value, convert it to an int, and print the result.

        Steps:

        1. Create a new class for this exercise, add a main method.

        2. Declare a double variable number.

        3. Assign a value to number.

        4. Cast the double to an int

        5. Print the result.
         */

        double numb1 = 5.0;
        int numbInt1 = (int) numb1;
        System.out.println(numbInt1);


    }
}
