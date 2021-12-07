package HomeWork1;

public class ExerciseOne5_1 {
    public static void main(String[] args) {
        int a = -42;  // двоичный код -42 = 11010110
        int b = -15;  // двоичный код -15 = 11110001
        int c = 2;
        int d = a << c;  // двоичный код -168 = 10101100
        int f = b << c;  // двоичный код -60 = 11000100
        a <<=c;
        b <<=c; // двоичный код -60 = 11000100

        System.out.println(d);
        System.out.println(f);
        System.out.println(a);
        System.out.println(b);

    }
}
