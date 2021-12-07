package HomeWork1;

public class ExerciseOne4_1 {
    public static void main(String[] args) {
        int a = -42;  // двоичный код -42 = 11010110
        int b = -15;  // двоичный код -15 = 11110001
        int c = 3;
        int d = a >> c;  // двоичный код -6 = 11111010
        int f = b >> c;  // двоичный код -2 = 11111110
        a >>=c; // двоичный код -6 = 11111010
        b >>=c; // двоичный код -2 = 11111110


        System.out.println(d);
        System.out.println(f);
        System.out.println(a);
        System.out.println(b);



    }
}
