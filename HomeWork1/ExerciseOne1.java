package HomeWork1;

public class ExerciseOne1 {
    public static void main(String[] args) {
        int a = 42;  // двоичный код 42 = 00101010
        int b = 15;  // двоичный код 15 = 00001111
        int c = a & b; // двоичный код 10 = 00001010
        b &=a; // двоичный код 10 = 00001010

        System.out.println(c);
        System.out.println(b);


    }
}
