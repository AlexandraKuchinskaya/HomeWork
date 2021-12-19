package HomeWork2.loops;

import java.util.Arrays;

public class exercise1_1_1 {
    public static void main(String[] args) {
        System.out.println(args [0]);
        int number = Integer.parseInt(args [0]);
        int result = 1;

        for (int i = 1; i<=number; i++){
            System.out.print(i);
            if (i!=number) {
                System.out.print("*");
            }
            result= result*i;

        }
        System.out.println("=" + result);
    }
}
