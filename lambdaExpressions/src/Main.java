public class Main {
    public static void main(String[] args) {
       Calculator c1 = (x,y) -> x+y;
       Calculator c2 =(x,y) -> x-y;
        System.out.println(c1.calculate(3,5));
        System.out.println(c2.calculate(3,5));
        Calculator c3 = (x,y) -> {
            System.out.println("Hello from the lambda expression!");
            return x*y;
        };
        System.out.println(c3.calculate(3,5));

        Printer p1 = s -> System.out.println("Printer says: " +s);

       p1.print("Boom");

       NumberProvider num = () -> 42;
        System.out.println(num.provide());

        int res1 = execute(3,5,c1);
        int res2 = execute(3,5,c2);
        int res3 = execute(3,5,c3);

        int res5 = execute(3,5,(n1,n2)->n1/n2);
        System.out.println(res1 + " " + res2 + " " + res3+" " + res5);
    }

    public static int execute(int nr1,int nr2, Calculator calculator) {
        return calculator.calculate(nr1,nr2);
    }
}