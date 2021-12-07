package HomeWork1;

import java.util.Arrays;

public class ExerciseTwo {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c =8;
        int one =a+b/c;
        int two =(a+b)/c;
        int three = (a + b++)/c;
        int four = (a + b++)/--c;
        int five = (a * b>>b++)/--c;
        int six = (a+7 > 20 ? 68 : 22 * b >>b++) / --c;
        // int seven = (a+7 > 20 ? 68 >=68 : 22 *b >> b++) / --c;
        // Арифметический оператор "/" (деление) работает с числовыми типами дааных (int, long, short, char, byte, float, doable).
        // Вначале выполняется операция, которая в скобках. Результат выполнения оператора сравнения (>=) будет соответствовать типу boolean.
        // Следовательно данное выражение неправильное.
        boolean eight =6-b>3 && 12*12 <=119;
        boolean nine = true && false;


        System.out.println("Подпункт 2.1. Ответ: " +one);
        System.out.println("Подпункт 2.2. Ответ: " +two);
        System.out.println("Подпункт 2.3. Ответ: " +three);
        System.out.println("Подпункт 2.4. Ответ: " +four);
        System.out.println("Подпункт 2.5. Ответ: " +five);
        System.out.println("Подпункт 2.6. Ответ: " +six);
        System.out.println("Подпункт 2.8. Ответ: " +eight);
        System.out.println("Подпункт 2.9. Ответ: " +nine);

    }
}
