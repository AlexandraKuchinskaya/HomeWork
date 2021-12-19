package HomeWork2.arrays;

import HomeWork2.utils.arraysUtils;

public class exercise2_1_1 {
    public static void main(String[] args) {
        int[] data = arraysUtils.arrayFromConsole();
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
}
