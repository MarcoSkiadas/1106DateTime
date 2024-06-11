package org.example;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor

public class Animal {
    private String name;
    private LocalDate birthday;
}
