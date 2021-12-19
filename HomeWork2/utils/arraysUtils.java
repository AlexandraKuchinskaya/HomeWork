package HomeWork2.utils;

import java.util.Random;
import java.util.Scanner;

public class arraysUtils {
    /**
     * запрашиваем массив через консоль
     * @return введенный массив
     */
    public static int [] arrayFromConsole () {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");

        int[] data = new int[console.nextInt()];


        for (int i = 0; i < data.length; i++) {
            System.out.println("Введите число");
            data[i] = console.nextInt();
        }

        return data;
    }

    /**
     * создать массив указанного массива с рандомными числами (до определенного числа)
     * @param size размер массива
     * @param maxValueExclusion ограничение максимального рандомного числа в массиве
     * @return введенный массив
     */
    public static int [] arrayRandom (int size, int maxValueExclusion){

        int[] data = new int[size];

        Random rnd = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = rnd.nextInt (maxValueExclusion);
        }

        return data;

    }
}
