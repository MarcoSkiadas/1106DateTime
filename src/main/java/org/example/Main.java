package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime twoWeeksAhead = now.plusWeeks(2);
        System.out.println(now);
        System.out.println(twoWeeksAhead);

        LocalDateTime randomDate = LocalDateTime.of(2024, 6, 13, 15, 0);

        if(randomDate.isBefore(now)) {
            System.out.println("This datum is before now: "+randomDate);
        }
        else {
            System.out.println("This datum is before 13.06 15.00h: "+now);
        }

        long hoursBetween = ChronoUnit.HOURS.between(now, twoWeeksAhead);
        System.out.println(hoursBetween);


    Animal animal1 = new Animal("Bello", LocalDate.of(2020, 6, 13));

    LocalDate today = LocalDate.now();
    // Calculate next birthday
    LocalDate nextBirthday = animal1.getBirthday().withYear(today.getYear());

    // If the next birthday is before or equal to today's date, add one year
        if (!nextBirthday.isAfter(today)) {
        nextBirthday = nextBirthday.plusYears(1);
    }

    // Calculate the number of days until the next birthday
    long daysUntilNextBirthday = ChronoUnit.DAYS.between(today, nextBirthday);

    // Output the result
        System.out.println("Days until next birthday: " + daysUntilNextBirthday);
}
}