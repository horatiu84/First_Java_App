public class Animal {
    /*
    Exercise: super() and this()
Create a class hierarchy with two levels and use super() and this() in the constructors to initialize fields.

Steps:

1. Create a class named Animal with private fields species (String) and age (int).

2. Create a constructor in the Animal class that takes a String parameter for the species and an int parameter for the age.

3. Assign the constructor parameters to the corresponding fields.

4. Create a class named Dog that inherits from Animal.

5. Add a private field breed (String) to the Dog class.

6. Create a constructor in the Dog class that takes a String parameter for the breed, a String parameter for the species, and an int parameter for the age.

7. Use the super() call in the Dog constructor with three parameters to call the Animal constructor with the species and age parameters.

8. Use the this keyword to assign the breed parameter to the corresponding field.

9. Add another constructor in Dog that doesn’t take any arguments. Call the constructor with three parameters with the this() call. Provide default values for the dog’s species, age and breed.

10. Create a class named SuperThisExample with a main method.

11. In the main method, create an instance of the Dog class using the custom constructor and the default constructor.
     */

    private String species;
    private int age;

    public Animal(String species,int age) {
        this.species = species;
        this.age = age;
    }
}
