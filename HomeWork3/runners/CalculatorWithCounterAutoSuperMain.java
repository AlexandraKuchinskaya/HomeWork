package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoSuper;



public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calcCounterAutoSuper = new CalculatorWithCounterAutoSuper();
        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double a = calcCounterAutoSuper.multiplication(15, 7);
        double b = calcCounterAutoSuper.division(28, 5);
        double c = calcCounterAutoSuper.sum(4.1, a);
        double d = calcCounterAutoSuper.stepen(b, 2);

        double result = calcCounterAutoSuper.sum(c,d);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result + "\nКоличество использований калькулятора = " + calcCounterAutoSuper.getCountOperation());
    }
}
