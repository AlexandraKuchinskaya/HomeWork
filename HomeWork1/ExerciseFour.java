package HomeWork1;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("У вас сегодня рабочий день?");
        String answer = in.nextLine();
        String answer1 = "Да";
        String answer2 = "Нет";
        boolean weekday;


        if (answer.equals(answer1)) {
            weekday = true;
        } else if (answer.equals(answer2)) {
            weekday = false;
        } else {
            System.out.println("Ввели не корректный ответ.");
            return;

        }

        System.out.print("У вас отпуск?");
        String answer3 = in.nextLine();
        String answer4 = "Да";
        String answer5 = "Нет";
        boolean vacation;

        if (answer3.equals(answer4)) {
            vacation = true;
        } else if (answer3.equals(answer5)) {
            vacation = false;
        } else {
            System.out.println("Ввели не корректный ответ.");
            return;
        }
        System.out.println("Можно спать дальше?");



    String totalAnswer = sleepIn(weekday, vacation) ?"Да":"Нет";

        System.out.println(totalAnswer);
    }

    public static boolean sleepIn(boolean Weekday, boolean Vacation) {
        return !Weekday || Vacation;


    }
}


















