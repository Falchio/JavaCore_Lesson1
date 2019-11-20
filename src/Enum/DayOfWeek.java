package Enum;


public enum DayOfWeek {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);

    String russianTitle;
    int indexNumber;


    public String getRussianTitle() {
        return russianTitle;
    }

    public int getIndexNumber() {
        return indexNumber;
    }


    DayOfWeek(String russianTitle, int indexNumber) {
        this.russianTitle = russianTitle;
        this.indexNumber = indexNumber;
    }


    public String getWorkingHours(DayOfWeek thisDay) {
        String result = "";

        if (thisDay.indexNumber > 7) {
            result = "Вы указали неверный номер дня";
        } else if (thisDay.indexNumber > 5) {
            result = "Сегодня выходной";
        } else {
            result = "Осталось отработать: " + ((5 - thisDay.indexNumber) * 8 + 8) + " часа(ов)";
        }

        return result;
    }

}
