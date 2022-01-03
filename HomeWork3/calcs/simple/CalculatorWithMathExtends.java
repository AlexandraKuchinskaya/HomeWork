package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double stepen(double number, double stepen) {
        return Math.pow(number,stepen);
    }

    @Override
    public double modul(double a) {
        return Math.abs(a);
    }

    @Override
    public double coren(double a) {
        return Math.sqrt(a);
    }
}
