package Home_Work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        // 81 в двоичной системе счисления = 0101 0001

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        // 64 в двоичной системе счисления = 0100 0000

        int ResultAnd = num1 & num2;
        //используем побитовый оператор И, результат в двоичном коде 0100 0000 (64)
        int ResultOr = num1 | num2;
        //используем побитовый оператор ИЛИ, результат в двоичном коде 0101 0001 (81)

        System.out.println("Result of 'AND' operation is: " + ResultAnd);
        System.out.println("Result of 'OR' operation is: " + ResultOr);

        //Home_Work 1.4
        //float a = 42.5F;
        //float b = 2;
        //float ResultFloat = a & b;
        // Operator & cannot be applied to float; побитовые операторы применимы только к целочисленным значениям.

    }
}
