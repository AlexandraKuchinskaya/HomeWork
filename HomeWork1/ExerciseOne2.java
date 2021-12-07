package HomeWork1;

public class ExerciseOne2 {
    public static void main(String[] args) {
        int a = 42;  // двоичный код 42 = 00101010
        int b = 15;  // двоичный код 15 = 00001111
        int c = a | b; // двоичный код 47 = 00101111
        a |=b; // двоичный код 47 = 00101111

        System.out.println(c);
        System.out.println(a);

    }
}
