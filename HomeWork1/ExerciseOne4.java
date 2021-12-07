package HomeWork1;

import java.util.Arrays;

public class ExerciseOne4 {
    public static void main(String[] args) {
        int a = 42;  // двоичный код 42 = 00101010
        int b = 15;  // двоичный код 15 = 00001111
        int c = 2;
        int d = a >> c;  // двоичный код 10 = 00001010
        int f = b >> c;  // двоичный код 3 = 00000011
        a >>=c; // двоичный код 10 = 00001010
        b >>=c; // двоичный код 3 = 00000011


        System.out.println(d);
        System.out.println(f);
        System.out.println(a);
        System.out.println(b);



    }
}
