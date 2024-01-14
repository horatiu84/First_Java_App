public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        //Polymorphism

        Animal dog1 = new Dog();
        // on dog1 we can access just the methodes in the Animal class

        dog.eat();
        cat.eat();
        dog1.eat();
        dog.bark();
        ((Dog) dog).bark();

        //Overloading
        dog.eat("meat!");


        System.out.println(Cat.type);


        AnotherAnimal someAnimal = new AnotherAnimal("pleosc");
        Bird bird = new Bird();
        Parrot parrot = new Parrot();

        someAnimal.makeSound();
        bird.makeSound();
        parrot.makeSound();
    }
}