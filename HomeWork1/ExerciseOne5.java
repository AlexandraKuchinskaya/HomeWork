package HomeWork1;

public class ExerciseOne5 {
    public static void main(String[] args) {
        int a = 42;  // двоичный код 42 = 00101010
        int b = 15;  // двоичный код 15 = 00001111
        int c = 2;
        int d = a << c;  // двоичный код 168 = 10101000
        int f = b << c;  // двоичный код 60 = 00111100
        a <<=c;
        b <<=c;

        System.out.println(d);
        System.out.println(f);
        System.out.println(a);
        System.out.println(b);

    }
}
