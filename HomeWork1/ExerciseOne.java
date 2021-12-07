package HomeWork1;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ExerciseOne {
    public static void main(String[] args) {
        int a = 42;  // двоичный код 42 = 00101010
        int b = 15;  // двоичный код 15 = 00001111
        int c =~a;  // двоичный код -43 = 11010101
        int d =~b;  // двоичный код -16 = 11110000


        System.out.println(c);
        System.out.println(d);

    }
}
