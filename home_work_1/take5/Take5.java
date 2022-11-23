package home_work_1.take5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Take5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("У вас рабочий день?");
        boolean weekday = console.nextBoolean();
        System.out.println("У вас отпуск?");
        boolean vacation = console.nextBoolean();

        if (sleepIn(weekday, vacation)) {
            System.out.println("Продолжаем спать");
        } else {
            System.out.println("Идём работать");
        }

        System.out.println("____________");

        if (sleepIn(true, false)) {
            System.out.println("Продолжаем спать");
        } else {
            System.out.println("Идём работать");
        }

        System.out.println("_______________");
        console = new Scanner(System.in);
        System.out.println("Введите дату (в формате dd-MM-yyyy)");
        String date = console.nextLine();

        LocalDate inputDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        weekday = inputDate.getDayOfWeek().getValue() > 0
                && inputDate.getDayOfWeek().getValue() < 6;

        vacation = inputDate.getMonth().getValue() == 7;

        if (sleepIn(weekday, vacation)) {
            System.out.println("Продолжаем спать");
        } else {
            System.out.println("Идём работать");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
//        if(!weekday || vacation){
//            return true;
//        } else {
//            return false;
//        }
        return !weekday || vacation;

    }
}
