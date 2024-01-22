import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*Now -> Date Time*/
        /*---------------------------------*/
        // Prints the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("date 1 " + date1);

        // Prints the current data and time
        LocalDateTime date2 = LocalDateTime.now();
        System.out.println("date 2 " + date2);

        // Prints the current date-time globally
        Instant date3 = Instant.now();
        System.out.println("date 3 " + date3);
        /*=--------------------------------*/



        /* ISO 8601 Text -> Date Time*/
        /*---------------------------------*/
        // Prints the current date
        LocalDate date4 = LocalDate.parse("2024-01-21");
        System.out.println("date 4 " + date4);

        LocalDateTime date5 = LocalDateTime.parse("2024-01-21T12:53:00");
        System.out.println("date 5 " + date5);


        Instant date6 = Instant.parse("2024-01-21T12:53:00.000Z");
        System.out.println("date 6 " + date6);

        // Prints the current local date-time in global format
        Instant date7 = Instant.parse("2024-01-21T12:53:00-03:00");
        System.out.println("date 7 " + date7);

        /*---------------------------------*/




        /*Custom Format Date -> Date-time*/
        /*---------------------------------*/
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date8 = LocalDate.parse("21/01/2024", formatter1);
        System.out.println("date 8 " + date8);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime date9 = LocalDateTime.parse("21/01/2024 12:53:00", formatter2);
        System.out.println("date 9 " + date9);

        LocalDate date10 = LocalDate.of(2024, 1, 21);
        System.out.println("date 10 " + date10);

        LocalDateTime date11 = LocalDateTime.of(2024, 1, 21, 12, 53, 0);
        System.out.println("date 11 " + date11);

        /*---------------------------------*/

        /*Custom text -> DateTime*/
        /*---------------------------------*/
        LocalDate date12 = LocalDate.parse("2024-01-21");
        LocalDateTime date13 = LocalDateTime.parse("2024-01-21T12:53:00");
        Instant date14 = Instant.parse("2024-01-21T12:53:00.000Z");

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("date 12 " + date12.format(formatter3));
        System.out.println("date 12 " + formatter3.format(date12));

        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("date 13 " + date13.format(formatter4));
        System.out.println("date 13 " + date13.format(formatter3));

        System.out.printf("date 14 " + date14);

        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("America/Sao_Paulo"));
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        System.out.println("date 14 " + formatter5.format(date14));
        System.out.println("date 14 " + formatter6.format(date14));

        DateTimeFormatter formatter7 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("date 14 " + date11.format(formatter7));

        DateTimeFormatter formatter8 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("date 14 " + formatter8.format(date14));
        /*---------------------------------*/



        /*Date Time operations*/
        /*---------------------------------*/
        LocalDate date16 = LocalDate.parse("2024-01-21");
        LocalDateTime date15 = LocalDateTime.parse("2024-01-21T12:53:00");
        Instant date17 = Instant.parse("2024-01-21T01:53:00.000Z");

        LocalDate result1 = LocalDate.ofInstant(date17, ZoneId.of("America/Recife"));
        System.out.println("date 17 " + result1);

        /*for (String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }*/


        // get information
        System.out.println("date 15 " + date15.getYear());
        System.out.println("date 15 " + date15.getMonth());
        System.out.println("date 15 " + date15.getDayOfMonth());
        System.out.println("date 15 " + date15.getDayOfWeek());
        System.out.println("date 15 " + date15.getDayOfYear());


        // Operations
        System.out.println("date 15 " + date15.plusYears(6));
        System.out.println("date 15 " + date15.plusMonths(6));
        System.out.println("date 15 " + date15.plusDays(6));
        System.out.println("date 15 " + date15.plusHours(6));
        System.out.println("date 15 " + date15.plusMinutes(6));
        System.out.println("date 15 " + date15.plusSeconds(6));
        System.out.println("date 15 " + date15.plusNanos(6));

        System.out.println("date 15 " + date15.minusYears(10));
        System.out.println("date 15 " + date15.minusMonths(6));
        System.out.println("date 15 " + date15.minusDays(6));
        System.out.println("date 15 " + date15.minusHours(6));
        System.out.println("date 15 " + date15.minusMinutes(6));

        /*Instant date18 = Instant.parse("2024-01-01T012:53:00.000Z");
        System.out.println("date 18 " + date18.minus(7, ChronoUnit.DAYS));*/

        LocalDateTime date19 = LocalDateTime.parse("2004-01-01T12:53:00");

        Duration duration1 = Duration.between(date19, LocalDateTime.now());
        System.out.println("date 19 " + duration1.toDays());
    }
}