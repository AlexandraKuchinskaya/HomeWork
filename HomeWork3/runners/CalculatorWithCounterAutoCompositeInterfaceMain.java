package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import HomeWork3.calcs.additional.CalculatorWithCounterAutoSuper;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calcCounterAutoAgregationInterface = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double a = calcCounterAutoAgregationInterface.multiplication(15, 7);
        double b = calcCounterAutoAgregationInterface.division(28, 5);
        double c = calcCounterAutoAgregationInterface.sum(4.1, a);
        double d = calcCounterAutoAgregationInterface.stepen(b, 2);

        double result = calcCounterAutoAgregationInterface.sum(c,d);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result + "\nКоличество использований калькулятора = " + calcCounterAutoAgregationInterface.getCountOperation());
    }
}
