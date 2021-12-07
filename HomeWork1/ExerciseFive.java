package HomeWork1;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Введите имя: " );
        String name = in.nextLine();
        String name1 = "Вася";
        String name2 = "Анастасия";

        if (name.equals(name1)) {
            System.out.printf("Привет! \nЯ тебя так долго ждал");
        } else if (name.equals(name2)) {
            System.out.printf("Я тебя так долго ждал!");
            } else {
                System.out.printf("Добрый день, а вы кто?");
            }
        }
    }











