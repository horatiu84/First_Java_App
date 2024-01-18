package listCollections;

public class BagExemple {
    public static void main(String[] args) {
        Bag<String> stringBag = new Bag<>();
        stringBag.addItem("Orez");
        stringBag.addItem("Ulei");
        stringBag.addItem("Paine");
        System.out.println(stringBag.getItems());


        Bag<Integer> integerBag = new Bag<>();
        integerBag.addItem(5);
        integerBag.addItem(10);
        integerBag.addItem(25);
        System.out.println(integerBag.getItems());
        integerBag.removeItem(10);
        System.out.println(integerBag.getItems());

    }
}
