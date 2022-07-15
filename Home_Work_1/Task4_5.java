package Home_Work_1;

import java.util.Scanner;
public class Task4_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите символ в консоль");
        String line = in.nextLine();
        char a = line.charAt(0);
        if (Character.isDigit(a))
            System.out.println(a + " Это цифра");
        else if (Character.isLetter(a))
            System.out.println(a + " Это буква");
    }

}

