public class Cat extends Animal{

    // Hiding
    // hiding a static member of a parent class with a static
    // member of the same name in child class

    public static String type = "Cat";
    public void eat() {
        System.out.println("Cat is eating");
    }
}
