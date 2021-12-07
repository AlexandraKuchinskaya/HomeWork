package HomeWork1;

public class ExerciseOne6 {
    public static void main(String[] args) {
        int a = 42;  // двоичный код 42 = 00101010
        int b = 15;  // двоичный код 15 = 00001111
        int c = 3;
        int d = a >>> c;  // двоичный код 5 = 00000101
        int f = b >>> c;  // двоичный код 1 = 00000001
        a >>>=c; // двоичный код 5 = 00000101
        b >>>=c; // двоичный код 1 = 00000001

        System.out.println(d);
        System.out.println(f);
        System.out.println(a);
        System.out.println(b);

    }
}
