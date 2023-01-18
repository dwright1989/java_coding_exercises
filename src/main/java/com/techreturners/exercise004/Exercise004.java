package com.techreturners.exercise004;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    private LocalDateTime dateTime;

    public Exercise004(LocalDate date) {
        LocalDateTime localDateTime = date.atStartOfDay();
        this.dateTime = localDateTime.plusSeconds(1000000000);
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }
}
