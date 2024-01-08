package primitiveobjects;

public class Person {
    // Exercise 1
    /*
        Create a simple Person class containing primitive data types and print the values.

    Steps:

    1. Create a Person class with String and int fields for name and age.

    2. Create a class Main and give it a main method

    3. Create a Person object in the main method, and set the name and age values.

    4. Print the name and age of the person in the main method.

     */


    public String name;
    public int age;

    public void greet() {
        System.out.println("Hi, I'm " + name);
    }

}
