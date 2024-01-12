import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDate ld1 = LocalDate.of(2000,4,1);
        LocalDate ld2 = LocalDate.parse("2023-01-01");

        System.out.println(ld+ " " + ld1 + " " + ld2);

       LocalDate ld3 =  ld.plusDays(5);
       System.out.println(ld3);

        System.out.println(ld3.getDayOfMonth());

        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(6,30,12);
        LocalTime lt3 = LocalTime.parse("12:59:59");

        System.out.println(lt1 + " " + lt2 + " " + lt3);

        LocalTime lt4 =  lt1.plusHours(1);
        System.out.println(lt4);

        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2015,6,12,15,10,32);

        LocalDateTime ldt3 = LocalDateTime.parse("2004-11-30T22:10:12");

        System.out.println(ldt1 + "\n "  + ldt2 + "\n " + ldt3);

        LocalDateTime ldt4 = ldt1.minusWeeks(2);
        System.out.println(ldt4);



    }
}