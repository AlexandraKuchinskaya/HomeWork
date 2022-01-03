package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long counter;

    public void incrementCountOperation() {
        counter++;
    }

        public long getCountOperation() {
        return counter;
        }

}
