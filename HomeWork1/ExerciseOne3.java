package HomeWork1;

public class ExerciseOne3 {
    public static void main(String[] args) {
        int a = 42;  // двоичный код 42 = 00101010
        int b = 15;  // двоичный код 15 = 00001111
        int c = a ^ b; // двоичный код 37 = 00100101
        a ^=b; // двоичный код 37 = 00100101

        System.out.println(c);
        System.out.println(a);

    }
}
