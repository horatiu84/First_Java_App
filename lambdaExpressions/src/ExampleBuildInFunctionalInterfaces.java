import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExampleBuildInFunctionalInterfaces {
    public static void main(String[] args) {
        SupplierExemple se = new SupplierExemple();
        se.get();


        Supplier<String> s1 = () -> "Hello!";
        System.out.println(s1.get());


        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Hello from the consumer!");

        Predicate<String> p1 = s -> s.length() <5;
        System.out.println(p1.test("Hello everybody!"));

        Function<String, Integer> f1 = s -> s.length();
        System.out.println(f1.apply("hello"));


    }
}
