public enum Planet {
    /*
    Create an enum named Planet that represents the planets in our solar system with their respective distances from the sun in astronomical units (AU).

        Steps:

        1. Create an enum named Planet.

        2. Add private fields name (String) and distanceFromSun (double) to the Planet enum.

        3. Create a constructor for the Planet enum that takes a String parameter for the name and a double parameter for the distance from the sun.

        4. Assign the constructor parameters to the corresponding fields.

        5. Add enum constants for each planet (or at least 2) in our solar system, providing their names and distances from the sun.

        6. Create a class named EnumsWithFieldsExample with a main method.

        7. In the main method, print the Planet enum constants along with their distances from the sun using a loop.
     */

    MERCURY("Mercury",50.25),
    MARS("Mars",75.2),
    EARTH("Earth", 100.55);

    private final String name;
    private final double distanceFromSun;

    Planet(String name,double distanceFromSun){
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

    public String getName() {
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }
}
