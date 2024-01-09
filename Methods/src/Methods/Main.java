package Methods;


public class Main {
    public static void main(String[] args) {



        greet();
        add(2,5);

        System.out.println(multiply(2,10));

        System.out.println("This is from Calculator class : "+Calculator.addC(4,10));

    }

    //EXERCISE 1

        /*
        Create a method to greet the user with a given name.

        Steps:

        1. Create a class named Greeter.

        2. Inside the Greeter class, create a static method named greet that takes no parameters.

        3. In the greet method, print "Hello, User!".

        4. Add a main method.

        5. In the main method, call the greet method.
                 */

    public static void greet() {
        System.out.println("Hello user!");
    }

    //EXERCISE 2

    /*
    Exercise: Method with Input Parameters
    Create a method that takes two integers as input parameters and prints their sum.

    Steps:

    1. Create a class named Adder.

    2. Inside the Adder class, create a static method named add that takes two int parameters.

    3. In the add method, calculate the sum of the two input parameters and print the result.

    4. Add a main method.

    5. In the main method, call the add method with two integers as arguments.
     */

    public static void add(int a, int b) {
        System.out.println("Sum is : " + (a+b) );
    }

    //EXERCISE 3

    /*
    Exercise: Method with Return Type and Return Statement
    Create a method that takes two integers as input parameters and returns their product.

    Steps:

    1. Create a class named Multiplier.

    2. Inside the Multiplier class, create a static method named multiply that takes two int parameters and returns an int.

    3. In the multiply method, calculate the product of the two input parameters and return the result.

    4. Add a main method.

    5. In the main method, call the multiply method with two integers as arguments and print the result.
     */

    public static int multiply(int a, int b){
        return a*b;
    }


    //EXERCISE 4

    /*
        Exercise: Invoking Methods from Another Class
    Create a method in one class and invoke it from another class.

    Steps:

    1. Create a class named Calculator.

    2. Inside the Calculator class, create a static method named add that takes two int parameters and returns an int.

    3. In the add method, calculate the sum of the two input parameters and return the result.

    4. Create another class named Main.

    5. Add a main method to the Main class.

    6. In the main method of the Main class, call the add method from Calculator with two integers as arguments and print the result.

     */

}

