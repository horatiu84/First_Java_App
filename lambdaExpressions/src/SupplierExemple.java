import java.util.function.Supplier;

public class SupplierExemple implements Supplier<String> {

    @Override
    public String get() {
        return "Hello!";
    }
}
