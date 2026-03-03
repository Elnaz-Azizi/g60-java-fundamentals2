package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    static void main() {

        // 1. CURRENT DATE & TIME
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.now();


        System.out.println("Current Date: " + today);
        System.out.println("Current Time: " + now);

        // 2. CREATING SPECIFIC DATES
        LocalDate specificDate = LocalDate.of(2023, 12, 25);
        LocalTime specificTime = LocalTime.of(14, 30);
        LocalDateTime appointment = LocalDateTime.of(2024, 6, 1, 10, 30);

        System.out.println("My Appointment: " + appointment);

        System.out.println("Specific Date: " + specificDate);

        //3. MANIPULATION (Plus/Minus)

        LocalDate tomorrow = today.plusDays(1);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate lastYear = today.minusYears(1);

        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("Next Month: " + nextMonth);

        // 4. PARSING FROM A STRING
        LocalDate parsedDate = LocalDate.parse("2023-12-25");
        System.out.println("Parsed Date: " + parsedDate);

        // 5. CUSTOM FORMATTING
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee, dd MMMM yyyy HH:mm");
        String formattedTime = nowDateTime.format(formatter);
        System.out.println("Pretty Date: " + formattedTime);
    }
}
