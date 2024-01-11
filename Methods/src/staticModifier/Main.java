package staticModifier;

public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtils.pi);
        double res= MathUtils.substract(10,3);

        MathUtils m = new MathUtils();
        System.out.println(m.pi);

        MathUtils m1 = new MathUtils();
        m1.pi = 12;

        System.out.println(m.pi + " " + m1.pi + " " + MathUtils.pi);
        // the value of pi will be changed everywhere!
    }
}
