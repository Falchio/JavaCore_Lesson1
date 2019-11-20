package Enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int numberOfDay = 0;
        DayOfWeek thisDay = DayOfWeek.MONDAY;


        System.out.println("Введите номер дня недели или название дня недели:");
        input = scanner.nextLine();


        if (isNumber(input)) {
            numberOfDay = Integer.valueOf(input);
            for (DayOfWeek day : DayOfWeek.values()) {
                if (numberOfDay == day.indexNumber) {
                    thisDay = day;
                    break;
                }
            }
        } else {
            for (DayOfWeek day : DayOfWeek.values()) {
                if (input.toLowerCase().equals(day.russianTitle.toLowerCase())) {
                    numberOfDay = day.indexNumber;
                    thisDay = day;
                    break;
                }
            }
        }


        if (numberOfDay != 0) {
            System.out.println(thisDay.getWorkingHours(thisDay));
        } else {
            System.out.println("Вы ввели неверные данные");
        }


    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }


}
