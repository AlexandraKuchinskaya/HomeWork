package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathCopy<soutp> implements ICalculator {
    public double sum (double a, double b) {
        return a+b;
    }

    public double minus (double a, double b) {
        return a-b;
    }

    public double multiplication (double a, double b) {
        return a*b;
    }

    public double division (double a, double b) {
        return (b == 0)? null : a/b;
    }

    public double stepen(double number, double stepen) {
        return Math.pow(number, stepen);
    }

    public double modul (double a) {
        return Math.abs(a);
    }

    public double coren (double a) {
        return Math.sqrt(a);
    }
}
