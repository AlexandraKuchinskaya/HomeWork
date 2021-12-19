package HomeWork2.arrays;

import HomeWork2.utils.arraysUtils;

public class exercise2_1_2 {
    public static void main(String[] args) {

        int[] data = arraysUtils.arrayRandom(5, 100);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);

        }
    }
}
