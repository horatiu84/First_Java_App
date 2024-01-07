package variables;

public class ExampleCasting {
    public static void main(String[] args) {
        long l = 123;
        int x = (int) l;

        double d = 3.2;
        float f = (float) d;


        // this will be a problem
        byte b = -23;
        char c = (char) b;
        System.out.println(c);

        int i = c;
        System.out.println(i); // 65513

        // maximul value of a char is 65535

        char maxChar = 65535;
        int number = maxChar+5;
        char pr = (char) number;
        System.out.println( (int)(pr) ); // 4
    }
}
