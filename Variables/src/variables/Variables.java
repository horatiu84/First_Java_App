package variables;

public class Variables {
    public static void main(String[] args) {


        // Primitives example

        byte b = 34;
        short s = 23000;
        int i = 45000;

        // special case for long
        // if we'll put a value that will not fit in an integer
        // we need to tell java and add an L at the end of the value
        long l = 12345678901L;

        float f = 3.2f;
        double d = 3.24567545;


        char c = 'c';
        char v1 = 475;

        boolean b1 = true;

        // arithmetic operators
        double x = 2;
        double y = 3;
        double z = x + y;
        System.out.println(z);
        System.out.println(x-y);
        double d1 =  x/y;
        System.out.println(d1);

        int nr1 = 10;
        int nr2 = 4;
        int res = nr1 % nr2;
        System.out.println("Modulus : " + res);

        //assignment operators
        int nr3 = 7;
        int nr4 = 70;
        nr3 += nr4;
        System.out.println(nr3);

        // unary operators
        int nr5 = 8;
        nr5++;
        System.out.println(nr5);
        int nr6 = 3;
        System.out.println(-nr6); // -3
        System.out.println(nr6);  // 3

        int pre = 5;
        int post = 5;
        System.out.println(++pre);
        System.out.println(post++);
        System.out.println("post : " + post + " ,pre: " + pre);

        // relational operators
        int small = 2;
        int big = 10;
        System.out.println(small == big);
        System.out.println(small >= big);

    }
}