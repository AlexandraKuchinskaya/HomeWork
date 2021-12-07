package HomeWork1;

public class ExerciseOne6_1 {
    public static void main(String[] args) {
        int a = -42;  // двоичный код -42 = 11010110
        int b = -15;  // двоичный код -15 = 11110001
        int c = 30;
        int d = a >>> c;  // двоичный код 3 =00000011
        int f = b >>> c;  // двоичный код 3 =00000011
        a >>>=c; // двоичный код
        b >>>=c; // двоичный код

        System.out.println(d);
        System.out.println(f);
        System.out.println(a);
        System.out.println(b);

    }
}
