package Home_Work_1;

import java.util.Scanner;
public class Task5 {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Сегодня будний день?");
        System.out.println("Если да, напиши y, если нет, то напиши n.");
        String day = console.next();
        System.out.println("Ты в отпуске? Если да, напиши y, если нет, напиши n.");
        String vac = console.next();

        boolean weekday = day.equals("y");
        boolean vacation = vac.equals("y");

        if (sleepIn(weekday, vacation)) {
            System.out.println("Можешь спать!");
        } else {
            System.out.println("Пора идти на работу");
        }
    }
}