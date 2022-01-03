package HomeWork3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double a= 4.1;
        double b = 15*7;
        double c = 28.0/5.0;

        double result =a+ b + (c*c);
        System.out.println("Результат "+result );  //140.46
    }
}
