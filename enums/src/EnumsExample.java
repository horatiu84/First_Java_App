public class EnumsExample {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.SUNDAY;
        DayOfWeek day2 = DayOfWeek.FRIDAY;

        if (day == day2) {
            System.out.println("The same day");
        } else {
            System.out.println("Not Same day");
        }

        /*
        Create a basic enum named Weekday that represents the days of the week.

Steps:

1. Create an enum named Weekday.

2. Add enum constants for each day of the week: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, and SUNDAY.

3. Create a class named BasicEnumsExample with a main method.

4. In the main method, print the Weekday enum constants using a loop.
         */

        for (DayOfWeek days : DayOfWeek.values()) {
            System.out.println(days);
        }



        for (Planet planet: Planet.values()) {
            System.out.println(planet.getName() + " is " + planet.getDistanceFromSun() + " AU from the sun");
        }
    }
}