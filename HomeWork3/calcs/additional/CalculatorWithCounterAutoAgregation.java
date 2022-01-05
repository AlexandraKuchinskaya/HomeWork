package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    private final CalculatorWithOperator calc1;
    private final CalculatorWithMathCopy calc2;
    private final CalculatorWithMathExtends calc3;

    private long counter;
    public void incrementCountOperation() {
        counter++;
    }

    public long getCountOperation() {
        return counter;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calc) {
        this.calc1 = calc;
        this.calc2 =null;
        this.calc3 = null;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calc) {
        this.calc1 = null;
        this.calc2 = calc;
        this.calc3 = null;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calc) {
        this.calc1 = null;
        this.calc2 =null;
        this.calc3 = calc;
    }

    public double stepen(double number, double stepen) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.stepen(number, stepen);
        } else if (calc2 != null) {
            return calc2.stepen(number, stepen);
        }
        return calc3.stepen(number, stepen);
    }


    public double modul(double a) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.modul(a);
        } else if (calc2 != null) {
            return calc2.modul(a);
        }
        return calc3.modul(a);
    }


    public double coren(double a) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.coren(a);
        }else if (calc2 != null) {
            return calc2.coren(a);
        }
        return calc3.coren(a);
    }


    public double sum(double a, double b) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.sum(a, b);
        }else if (calc2 != null) {
            return calc2.sum(a, b);
        }
        return calc3.sum(a, b);
    }


    public double minus(double a, double b) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.minus(a, b);
        }else if (calc2 != null) {
            return calc2.minus(a, b);
        }
        return calc3.minus(a, b);
    }


    public double multiplication(double a, double b) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.multiplication(a, b);
        }else if (calc2 != null) {
            return calc2.multiplication(a, b);
        }
        return calc3.multiplication(a, b);
    }


    public double division(double a, double b) {
        incrementCountOperation();
        if (calc1 != null) {
            return calc1.division(a, b);
        }else if (calc2 != null) {
            return calc2.division(a, b);
        }
        return calc3.division(a, b);
    }
}
