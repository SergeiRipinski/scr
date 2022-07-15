package Home_Work_1;

import java.util.Scanner;
public class Task4_6 {
    public static void main(String[] args) {
            System.out.println("Введите год");
            Scanner scan = new Scanner(System.in);
            int year = scan.nextInt();
            if (year % 400 == 0){
                System.out.println("Этот год високосный");
            }
            else {
                System.out.println("Этот год не високосный");
            }
    }
}


