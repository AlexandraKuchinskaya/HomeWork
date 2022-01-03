package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double a = calc.multiplication(15, 7);
        double b = calc.division(28, 5);
        double c = calc.sum(4.1, a);
        double d = calc.stepen(b, 2);

        double result = calc.sum(c,d);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
