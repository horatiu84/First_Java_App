public class AnotherAnimal {
    /*
        Exercise: Apply Inheritance and the Three Pillars of OOP with Getters and Setters
    We’re going to create a simple class hierarchy to practice with inheritance and the three pillars of OOP: encapsulation, inheritance, and polymorphism. We’ll be using the following classes: Animal, Bird, and Parrot. We’ll use private fields and public getters and setters for encapsulation.

    Steps:

    1. Create a class named Animal with a private String field called sound.

    2. Add a constructor to initialize the sound field in the Animal class.

    3. Add a public getter and setter for the sound field.

    4. Create a method makeSound in the Animal class that prints the sound value using the getter.

    5. Create a class named Bird that inherits from Animal.

    6. Add a constructor to the Bird class that sets the sound value to "Chirp" using the setter.

    7. Override the makeSound method in the Bird class to print "Bird sound: " followed by the sound value using the getter.

    8. Create a class named Parrot that inherits from Bird.

    9. Add a constructor to the Parrot class that sets the sound value to "Squawk" using the setter.

    10. Create a class named Main with a main method.

    11. In the main method, create objects of type Animal, Bird, and Parrot.

    12. Invoke the makeSound method on each object.

    13. Can you predict the output?


     */

    private String sound;

    public AnotherAnimal(String sound) {
        setSound(sound);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(getSound());
    }
}
