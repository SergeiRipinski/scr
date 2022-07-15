package Home_Work_1;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("Введенное число " + num + " четное");
        } else {
            System.out.println("Введенное число " + num + " не четное");
        }

    }
}
