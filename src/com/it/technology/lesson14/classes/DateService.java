package com.it.technology.lesson14.classes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public final class DateService {

    public String findDayOfWeek(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        return dayOfWeek.name().toLowerCase();
    }
    public String findNextTuesdayDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
    }
}
