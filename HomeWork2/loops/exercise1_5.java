package HomeWork2.loops;

public class exercise1_5 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения");
        printRow(2, 5);
        System.out.print("\n");
        printRow(6,9);
    }

    public static void printRow (int from, int to) {
        for (int number =1; number <=10; number++) {
            for (int i=from; i<=to; i++){
                int result = i*number;
                System.out.print(i + "*" +number + "=" + result+ "\t");
            }
            System.out.print("\n");
        }

    }


    ///       for (int number =1; number <=10; number++) {
    ///          for (int i=2; i<=5; i++){
    ///             int result = i*number;
    ///             System.out.print(i + "*" +number + "=" + result+ "\t");
    ///        }
    ///        System.out.print("\n");
    ///    }

    ///   System.out.print("\n");

    ///   for (int number =1; number <=10; number++) {
    ///      for (int i=6; i<10; i++){
    ///         int result = i*number;
    ///          System.out.print(i + "*" +number + "=" + result+ "\t");
    ///      }
    ///      System.out.print("\n");
    ///   }





}
