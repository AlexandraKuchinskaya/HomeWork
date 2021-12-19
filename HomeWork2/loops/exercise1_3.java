package HomeWork2.loops;

import java.util.Scanner;

public class exercise1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        double number = in.nextDouble();
        System.out.println("Введите степень:");
        int stepen = in.nextInt();
        double result = 1;

        if (stepen < 0) {
            System.out.println("Степень не может быть отрицательной. Введите положительную степень числа");
        } else {

            for (int i = 1; i <= stepen; i++) {

                result = result * number;
                if (i == stepen) {
                    System.out.print(number + "^" + stepen);
                }
            }
            System.out.print("= " + result);

        }
    }
}
