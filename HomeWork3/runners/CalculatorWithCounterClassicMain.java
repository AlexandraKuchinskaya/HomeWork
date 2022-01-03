package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterClassic;


public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calcCounter = new CalculatorWithCounterClassic();
        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double a = calcCounter.multiplication(15, 7);
        calcCounter.incrementCountOperation();
        double b = calcCounter.division(28, 5);
        calcCounter.incrementCountOperation();
        double c = calcCounter.sum(4.1, a);
        calcCounter.incrementCountOperation();
        double d = calcCounter.stepen(b, 2);
        calcCounter.incrementCountOperation();


        double result = calcCounter.sum(c,d);
        calcCounter.incrementCountOperation();
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result + "\nКоличество использований калькулятора = " + calcCounter.getCountOperation());
    }
}
