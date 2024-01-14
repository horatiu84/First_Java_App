public class Vehicle {

    /*
    Create a class hierarchy with three levels and use constructors to initialize fields at each level.

Steps:

1. Create a class named Vehicle with a private field brand (String).

2. Create a constructor in the Vehicle class that takes a String parameter for the brand and assigns it to the corresponding field.

3. Create a class named Car that inherits from Vehicle.

4. Add a private field model (String) to the Car class.

5. Create a constructor in the Car class that takes a String parameter for the brand and a String parameter for the model.

6. Use the super() keyword in the Car constructor to call the Vehicle constructor with the brand parameter.

7. Assign the model parameter to the corresponding field.

8. Create a class named ElectricCar that inherits from Car.

9. Add a private field batteryCapacity (int) to the ElectricCar class.

10. Create a constructor in the ElectricCar class that takes a String parameter for the brand, a String parameter for the model, and an int parameter for the battery capacity.

11. Use the super() keyword in the ElectricCar constructor to call the Car constructor with the brand and model parameters.

12. Assign the battery capacity parameter to the corresponding field.

13. Create a class named ConstructorsInheritanceExample with a main method.

14. In the main method, create an instance of the ElectricCar class using the custom constructor.
     */

    private String brand;
    public Vehicle(){
        System.out.println("In constructor Vehicle");
    }

    public Vehicle(String brand) {
        this.brand = brand;
    }
}
