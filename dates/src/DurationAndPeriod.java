import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DurationAndPeriod {
    public static void main(String[] args) {
        // Duration : amount of time less than a day
        // expressed in (nano)seconds

        Duration d1 = Duration.ofNanos(10000000);
        Duration d2 = Duration.ofSeconds(100,1000);

        Duration d3 = Duration.ofDays(7);

        Duration d4 = d3.plus(d1);


        // Period : amount of time more than a day

        Period p1 = Period.of(10,2,3);
        Period p2 = Period.ofWeeks(12);

        System.out.println(p1.getDays());

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime oneHourFromNow = now.plus(Duration.ofHours(1));

        System.out.println(now + " + 1 hour " + oneHourFromNow);

        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = today.minusYears(1);
        LocalDate oneYearAgo2 = today.minus(Period.ofYears(1));

        System.out.println(today + " one year ago: " + oneYearAgo);
        System.out.println(today + " one year ago: " + oneYearAgo2);

        // format with custom pattern
        System.out.println("FORMAT : ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM/dd/yy");
        System.out.println(dtf.format(now));
        System.out.println(dtf.format(today));

        LocalDate ld = LocalDate.parse("February/20/21",dtf);
        System.out.println(ld);
        System.out.println(ld.format(DateTimeFormatter.ISO_WEEK_DATE));

//        DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder();
//        DateTimeFormatter dtf1 = dtfb.appendLiteral("This date is")
//                                .appendValue(ChronoField.DAY_OF_MONTH)
//                                .appendLiteral("/")
//                                .appendValue(ChronoField.MONTH_OF_YEAR)
//                                .toFormatter();
//        System.out.println(ld.format(dtf1));
    }
}
