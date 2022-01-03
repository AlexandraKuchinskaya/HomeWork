package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithOperator<soutp> implements ICalculator {
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
        if (stepen < 0) {
            System.out.println("Степень не может быть отрицательной. задайте положительную степень числа");
        } else if (stepen == 1){
            number = number;
        } else {

            for (int i = 2; i <= stepen; i++) {

                number = number * number;
                }
            }
        return number;
    }

    public double modul (double a) {
        return (a<0) ? (a* (-1)) : a;
    }

    public double coren (double a) {
        return Math.sqrt(a);
    }
}
