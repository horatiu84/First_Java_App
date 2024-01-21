public class LambdaExample {
    /*
        Implement the NumericOperator interface using a lambda expression to perform addition.

    Steps:

    1. In a class named LambdaExample with a main method, create a lambda expression that implements the NumericOperator interface.

    2. Use the lambda expression to perform addition on two integers.
     */

    public static void main(String[] args) {
        NumericOperator operator = (a,b) -> a+b;
        System.out.println(operator.operate(5,10));

        /*
            Implement the NumericOperator interface using a lambda expression to find the maximum of two integers.

    Steps:

    1. In the LambdaExample class, create another lambda expression that implements the NumericOperator interface.

    2. Use the lambda expression to find the maximum of two integers.

         */

        NumericOperator max = (a,b) -> (a>b) ? a : b;
        System.out.println(max.operate(5,10));


        /*
        Implement the StringFormatter interface using a lambda expression to convert a string to uppercase.

        Steps:

        1. In the LambdaExample class, create a lambda expression that implements the StringFormatter interface.

        2. Use the lambda expression to convert a string to uppercase.


         */

        StringFormatter str = s -> s.toUpperCase();
        System.out.println(str.format("I am happy!"));


    }
}
