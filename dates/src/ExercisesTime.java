import java.time.*;
import java.time.format.DateTimeFormatter;

public class ExercisesTime {
    public static void main(String[] args) {
        // EXERCISE 1

        /*
        Exercise: LocalDate
        Create a LocalDate object representing a specific date and print it.

        Steps:

        1. Create a class named LocalDateExample. Please note, you can get stuck very easily if you give your class names the same name as the built-in Java object. So make sure to not call it LocalDate, LocalTime, etc.

        2. In the main method, create a LocalDate object representing your date of birth. Make sure to import LocalDate.

        3. Print the LocalDate object.
         */

        LocalDate myBday = LocalDate.of(1984,9,25);
        System.out.println(myBday);


        //EXERCISE 2

        /*
        Create a LocalTime object representing a specific time and print it.

        Steps:

        1. Create a class named LocalTimeExample.

        2. In the main method, create a LocalTime object representing a meeting time at 1.30PM (13.30).

        3. Print the LocalTime object.
         */

        LocalTime meeting = LocalTime.of(13,30);
        System.out.println(meeting);

        //EXERCISE 3

        /*
        Create a LocalDateTime object representing a specific date and time and print it.

        Steps:

        1. Create a class named LocalDateTimeExample.

        2. In the main method, create a LocalDateTime object representing a time and date for an event. On November 21 of 2023 at 6PM (18.00).

        3. Print the LocalDateTime object.
         */

        LocalDateTime event = LocalDateTime.of(2023,12,31,23,59);
        System.out.println("Before new year : " + event);

        //EXERCISE 4

        /*
        Create a ZonedDateTime object for an overseas event, calculate the duration between two LocalTime objects, and the period between two LocalDate objects.

        Steps:

        1. Create a class namedZonedDateTimeDurationPeriodExample

        2. In the main method, create a ZonedDateTime object for an overseas event.

        3. Calculate the duration between two LocalTime objects. One representing 9AM and the other representing 5PM.

        4. Calculate the period between two LocalDate objects. One being January 1st 2023 and the other December 31 2023.

        5. Print all the results.
         */

        ZonedDateTime extraEvent =ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Egypt"));
        System.out.println(extraEvent);

        LocalTime mornig = LocalTime.of(9,0);
        LocalTime evening = LocalTime.of(17,0);

        Duration d = Duration.between(evening,mornig);
        System.out.println(d);

        LocalDate start = LocalDate.of(2023,1,1);
        LocalDate end = LocalDate.of(2023,12,31);
        Period p = Period.between(start,end);
        System.out.println(p);

        // EXERCISE 5

        /*
        Format a LocalDateTime object and parse a date string into a LocalDate object.

        Steps:

        1. Create a class named DateTimeFormattingParsingExample.

        2. In the main method, create a LocalDateTime object representing the current time.

        3. Format the LocalDateTime object using a DateTimeFormatter with a specific pattern.

        4. Parse a date string for November 21, 2023 into a LocalDate object using a DateTimeFormatter with a specific pattern.

        5. Print the formatted date and the parsed date.


         */

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");

        System.out.println(df.format(now));

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String someDate = "2023-11-21";
        LocalDate parsedDate = LocalDate.parse(someDate,df2);
        System.out.println(parsedDate);
    }
}
