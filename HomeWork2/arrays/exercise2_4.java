package HomeWork2.arrays;

import HomeWork2.utils.arraysUtils;

import java.util.Arrays;

public class exercise2_4 {
    public static void main(String[] args) {
        int[] data = arraysUtils.arrayRandom(5, 100);
        System.out.println("Массив: ");
        output(data);
        System.out.println("\nСумма четных положительных элементов массива:");
        one (data);
        System.out.println("\nМаксимальный из элементов массива с четными индексами:");
        two (data);
        System.out.println("\nЭлементы массива, которые меньше среднего арифметического:");
        three(data);
        System.out.println("\nДва наименьших (минимальных) элемента массива:");
        four (data);
        System.out.println("\nСжать массив, удалив элементы, принадлежащие интервалу:");
        five (data);
        System.out.println("\nСумма цифр массива:");
        six (data);



    }

    public static void output(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print("[");
            for (int item : data) {
                System.out.print(item);
                if (i != data.length - 1) {
                    System.out.print(", ");
                }
                i++;
            }
        }
        System.out.print("]\n");
    }

    //2.4.1. Сумма четных положительных элементов массива
    public static void one(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0 && data[i] > 0) {
                sum = sum + data[i];
            }
        }
        System.out.println(sum);
    }

    //2.4.2. Максимальный из элементов массива с четными индексами
    public static void two(int[] data) {
        int max = 0;
        for (int i = 0; i < data.length; i++) {
            int number = data[i];
            if (i % 2 != 0) {
                if (max < number) {
                    max = number;
                }
            }
        }
        System.out.println(max);
    }

    //2.4.3. Элементы массива, которые меньше среднего арифметического
    public static void three(int[] data) {
        int sum = 0;
        int number = data.length;

        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        for (int i = 0; i < data.length; i++) {
            double sredneeZnachenie = sum / number;
            if (data[i] < sredneeZnachenie) {
                System.out.println("i = " + data[i]);
            }
        }
    }

    //2.4.4. Найти два наименьших (минимальных) элемента массива
    public static void four (int []data){
        int min = 50;//так как в int[] data = arraysUtils.arrayRandom(5, 50); мы указали, что максимальное рандомное число =50.
        int min2=50;
        for (int i = 0; i < data.length; i++) {
            if (min>data [i]) {
                min=data[i];
            }
            if (data[i] !=min) {
                min2=data[i];
            }
        }
        System.out.println(min + ","+ min2);
    }

    //2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
    public static void five (int[] data){
        int a = 20; //интервал от 20
        int b = 40; // интервал до 45
        int j=0;
        for (int i = 0;i< data.length;i++) {
            if (data [i] <a || data [i]>b) {
                data [j++] = data [i];
            }
        }
        while (j<data.length) {
            data [j++]=0;
        }
        System.out.println("" + Arrays.toString(data));
    }

    // 2.4.6. Сумма цифр массива
    public static void six (int[] data){
        int a =0;
        int sum =0;
        for (int i = 0; i < data.length; i++) {
            a=data [i];
            while (a>0) {
             sum=sum+a%10;
             a /=10;
            }
        }
        System.out.println("sum = " + sum);


    }
}




