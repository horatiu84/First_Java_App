public class Exercises {
    public static void main(String[] args) {
        // Exercise 1

        /*
        Exercise: String Class
        Create two String objects and print their values.

        Steps:

        1. Create a class named StringExample.

        2. Add a main method.

        3. In the main method, create two String objects with different values. Give them the variable names str1 and str2.

        4. Print the values of the two String objects.


         */

        String str1 = "Hello";
        String str2 = " Vasile";
        System.out.println(str1 + str2);

        // EXERCISE 2

        /*
        Use different methods available on the String class and print the results.

        Steps:

        1. Create a class named StringMethods.

        2. Add a main method.

        3. In the main method, create a String object with the value Hello, World!

        4. Print the following things:

        Length of the String
        Uppercase and lowercase version of the String
        Substring from character 7 to 12 of the String
        Replace world with Java
        5. Print the results of the method calls.
         */
        String greeting = "Hello, World!";
        System.out.println(greeting.length());
        System.out.println(greeting.substring(7,12));
        System.out.println(greeting.replace("World","Java"));



        // EXERCISE 3

        /*
        Show that String objects are immutable by trying to modify one and printing the result.

        Steps:

        1. Create a class named Immutability.

        2. Add a main method.

        3. In the main method, create a String object with a value.

        4. Try to modify the String object by using a method like toUpperCase.

        5. Print the original String object and the modified String object.

        6. Understand that the original object didn’t change.


         */

        String imm = "value";
        System.out.println(imm);
        imm = imm.toUpperCase();
        System.out.println(imm);


        // EXERCISE 4

        /*
        Exercise: Comparing Strings
        Compare two strings using the equals and compareTo methods and print the results.

        Steps:

        1. Create a class named CompareStrings.

        2. Add a main method.

        3. In the main method, create two String objects with different values.

        4. Compare the two String objects using the equals methods.

        5. Print the results of the comparison.

        6. Modify the values to be the same, and verify that false changes to true.
         */

        String comp1 = "Ion";
        String comp2 = "Vasile";

        System.out.println(comp1.equals(comp2));

        comp2= "Ion";
        System.out.println(comp1.equals(comp2));

        // EXERCISE 5

        /*
        Create two strings with the same value, compare them, concatenate them, and reverse them using StringBuilder.

        Steps:

        1. Create a class named StringBuilderExample.

        2. Add a main method.

        3. In the main method, create two StringBuilder objects with the same value.

        4. Compare the two StringBuilder objects using the equals method.

        5. Concatenate the two StringBuilder objects using the append method.

        6. Reverse one of the StringBuilder objects using the reverse method.

        7. Print the results of each operation.


         */

        StringBuilder s1 = new StringBuilder("Oras");
        StringBuilder s2 = new StringBuilder("Oras");
        System.out.println(s1.toString().equals(s2.toString()));
        System.out.println(s1.append(s2));
        System.out.println(s1.reverse());
    }
}
