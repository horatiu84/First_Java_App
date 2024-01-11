package exercises;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "ion";
        person.address = "Calan";
        person.age = 15;

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.address);

        Counter.increment();
        System.out.println(Counter.count);
    }
}
