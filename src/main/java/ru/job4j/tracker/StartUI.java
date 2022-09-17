package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        LocalDateTime dataTime = new Item().getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = dataTime.format(formatter);
        System.out.println("Текущие дата и время: " + currentDateTimeFormat);
    }
}
