package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;


public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calcMath = new CalculatorWithMathCopy();

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double a = calcMath.multiplication(15,7);
        double b = calcMath.division(28,5);
        double c = calcMath.sum(4.1, a);
        double d =calcMath.stepen(b, 2);
                double result = calcMath.sum( c, d);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);

    }
}
