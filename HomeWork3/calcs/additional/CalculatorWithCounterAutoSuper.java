package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long counter;
    public void incrementCountOperation() {
        counter++;
    }
    public long getCountOperation() {
        return counter;
    }

    @Override
    public double stepen(double number, double stepen) {
        incrementCountOperation();
        return super.stepen(number, stepen);
    }

    @Override
    public double modul(double a) {
        incrementCountOperation();
        return super.modul(a);
    }

    @Override
    public double coren(double a) {
        incrementCountOperation();
        return super.coren(a);
    }

    @Override
    public double sum(double a, double b) {
        incrementCountOperation();
        return super.sum(a, b);
    }

    @Override
    public double minus(double a, double b) {
        incrementCountOperation();
        return super.minus(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        incrementCountOperation();
        return super.multiplication(a, b);
    }

    @Override
    public double division(double a, double b) {
        incrementCountOperation();
        return super.division(a, b);
    }

}
