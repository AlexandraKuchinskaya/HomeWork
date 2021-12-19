package HomeWork2.arrays;

import HomeWork2.utils.arraysUtils;

import java.util.Arrays;

public class exercise2_2 {
    public static void main(String[] args) {
        int [] data = arraysUtils.arrayFromConsole();
        output(data);
        System.out.println("_______");
        outputSecondElement (data);
        System.out.println("_______");
        reverseOutput (data);

    }

    // 2.2.1. Вывести все элементы в консоль.
    public static void output(int [] data) {
        // вывод массива с помощью цикла for
        System.out.println("Вывод массива с помощью For: " );
        for (int i = 0; i < data.length; i++) {
            System.out.println(data [i] + "");
        }


    // вывод массива с помощью цикла for each
    System.out.println("Вывод массива с помощью ForEach: " );
        for (int chisla:data) {
            System.out.println(chisla);
        }

    // вывод массива с помощью цикла while
        System.out.println("Вывод массива с помощью While: " );
        int i=0;
        while (i<data.length) {
            System.out.println("i = " + data [i]);
            i++;
        }

    // вывод массива с помощью цикла do... while
        System.out.println("Вывод массива с помощью Do...While: " );
        int a=0;
        do {
            System.out.println("a = " + data [a]);
            a++;
        } while (a<data.length);
    }


    //2.2.2. Вывести каждый второй элемент массива в консоль. индекс 0 - первый элемент массива. индекс 1 - второй элемент массива.
    // Цикл for each не используется для вывода каждого второго элемента массива.
    // For each — это разновидность цикла for, которая используется, когда нужно обработать все элементы массива или коллекции.

    public static void outputSecondElement (int [] data) {
        // вывод каждого второго элемента массива с помощью цикла for
        System.out.println("Вывод каждого второго элемента массива с помощью For: " );
        for (int i = 0; i < data.length; i++) {
            if (i%2 !=0) {
                System.out.println(data[i] + "");
            }
        }

        // вывод каждого второго элемента массива с помощью цикла  while
        System.out.println("Вывод каждого второго элемента массива с помощью While: " );
        int i =0;
        while (i<data.length) {
            if (i%2 != 0) {
                System.out.println("i = " + data[i]);
            }
            i++;
        }
        // вывод каждого второго элемента массива с помощью цикла do... while
        System.out.println("Вывод каждого второго элемента массива с помощью Do...While: " );
        int a=0;
        do {
            if (a%2 != 0) {
            System.out.println("a = " + data [a]);}
            a++;
        } while (a<data.length);
    }

    // 2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    // For each цикл не исользуется для вывода массива в обратном порядке
    public static void reverseOutput (int [] data) {
        // вывод  массива в обратном порядке с помощью цикла for
        System.out.println("Вывод массива в обратном порядке с помощью For: " );
        for (int i =data.length-1; i >=0 ; i--) {
                System.out.println(data[i]);
        }
        // вывод массива в обратном порядке с помощью цикла while
        System.out.println("Вывод массива в обратном порядке с помощью While: " );
        int i=data.length;
        while (--i>=0) {
            System.out.println("i = " + data [i]);

        }

        // вывод массива в обратном порядке с помощью цикла do... while
        System.out.println("Вывод массива в обратном порядке с помощью Do...While: " );
        int a=data.length-1;
        do {
            System.out.println("a = " + data [a]);
        } while (--a>=0);
    }

}


