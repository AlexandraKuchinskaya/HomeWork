package HomeWork2.loops;

import java.util.Arrays;
import java.util.Scanner;

public class exercise1_2 {
    public static void main(String[] args) {

        //Если работать через консоль

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println(a);

            int result = 1;

            while (a > 0) {
                System.out.print(a % 10);
                if (a / 10 > 0) {
                    System.out.print("*");
                }
                result = result * (a % 10);
                a = a / 10;
            }
            System.out.print("=" + result);
        }
        if (scanner.hasNextDouble()) {
            System.out.println("Вы ввели не целое число");
        } else {
            System.out.println("Вы ввели не число");
        }


    }
}

