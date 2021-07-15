package ru.job4j.condition;

public class MultipleSwitchWeek {

    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедальник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Sunday" -> 6;
            case "Восскресенье", "Saturday" -> 7;
            default -> -1;
        };
    }
}
