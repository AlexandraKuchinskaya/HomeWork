package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregation;
import HomeWork3.calcs.additional.CalculatorWithCounterAutoComposite;
import HomeWork3.calcs.simple.CalculatorWithOperator;


public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calcComposite = new CalculatorWithCounterAutoComposite();
        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double a = calcComposite.multiplication(15, 7);
        double b = calcComposite.division(28, 5);
        double c = calcComposite.sum(4.1, a);
        double d = calcComposite.stepen(b, 2);

        double result = calcComposite.sum(c,d);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result + "\nКоличество использований калькулятора = " + calcComposite.getCountOperation()+ "\n*******\n");

        CalculatorWithCounterAutoAgregation calcAgregation = new CalculatorWithCounterAutoAgregation( new CalculatorWithOperator());
        double a1 = calcAgregation.multiplication(15, 7);
        double b1 = calcAgregation.division(28, 5);
        double c1 = calcAgregation.sum(4.1, a1);
        double d1 = calcAgregation.stepen(b1, 2);

        double result1 = calcAgregation.sum(c1,d1);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result1 + "\nКоличество использований калькулятора = " + calcAgregation.getCountOperation());

    }
}
