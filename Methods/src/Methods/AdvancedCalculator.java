package Methods;

public class AdvancedCalculator {
    /*
    Exercise: Create a Method to Perform Several Calculations and Invoke It from Another Class
    Create a method that performs several calculations on two input parameters and prints the results. Invoke the method from another class.

    Steps:

    1. Create a class named AdvancedCalculator.

    2. Inside the AdvancedCalculator class, create a static method named performCalculations that takes two int parameters.

    3. In the performCalculations method, calculate the sum, difference, product, and quotient of the two input parameters.

    4. Print the results of the calculations.

    5. Create another class named Main. (Or give it another name if this conflicts with the previous Main class if you’re working in the same package, for example App)

    6. In the main method of the Main class, call the performCalculations method with two integers as arguments.


     */

    public static void performCalculations(int a, int b) {
        System.out.println("Ths sum of the numbers is : " + (a+b));
        System.out.println("Ths difference of the numbers is : " + (a-b));
        System.out.println("Ths product of the numbers is : " + (a*b));
        System.out.println("Ths quotient of the numbers is : " + (a/b));
    }
}
