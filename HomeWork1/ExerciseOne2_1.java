package HomeWork1;

public class ExerciseOne2_1 {
    public static void main(String[] args) {
        int a = -42;  // двоичный код -42 = 11010110
        int b = -15;  // двоичный код -15 = 11110001
        int c = a | b; // двоичный код -9 = 11110111
        a |=b; // двоичный код -9 = 11110111

        System.out.println(c);
        System.out.println(a);

    }
}
