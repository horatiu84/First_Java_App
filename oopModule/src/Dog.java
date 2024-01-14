public class Dog extends Animal {

    // Overriding the eat() method form Animal class
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    //Overloading
    public void eat(String food) {
        System.out.println("Dog is eating "  + food);
    }
    public void bark() {
        System.out.println("Woof woof!");
    }



}
