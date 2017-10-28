package HometaskNumber18;
import java.util.Scanner;

public class MyFirstEnum {
    public enum Months {
        JANUARY(1, 31),
        FEBRUARY(2, 28),
        MARCH(3, 31),
        APRIL(4, 30),
        MAY(5, 31),
        JUNE(6, 30),
        JULY(7, 31),
        AUGUST(8, 31),
        SEPTEMBER(9, 30),
        OCTOBER(10, 31),
        NOVEMBER(11, 30),
        DECEMBER(12, 31);

        public int days;
        public int number;

        Months(int n, int d) {
            days = d;
            number = n;
        }

        int getDays() {
            return days;
        }

        int getNumber() {
            return number;
        }

    }
    public static int daysInTheMonth(int num, int y) {
        for (Months m : Months.values()) {
            if (num == m.getNumber()) {
                num = m.getDays();
            }
            if (num == 2 && y % 4 == 0) {
                num = 29;
            }
        }
        return num;
    }

    public static String nameOfMonth(int num) {
        String nameOf = "";
        for (Months months : Months.values()) {
            if (num == months.getNumber()) {
                nameOf = months.toString();
            }
        }
        return nameOf;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input number of month");
        int numMon = scanner.nextInt();
        System.out.println("Please, input year");
        int year = scanner.nextInt();
        System.out.println("There are " + daysInTheMonth(numMon, year) + " days in " + nameOfMonth(numMon) + " " + year);
    }

}

