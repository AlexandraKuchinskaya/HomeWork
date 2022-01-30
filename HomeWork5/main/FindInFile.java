package HomeWork5.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Path.of;

public class FindInFile {
    public static void main(String[] args) throws IOException {
        //7. Написать новый класс с точкой входа.
        // При запуске программы пользователь должен передать адрес папки,
        // из которой мы будет считывать текстовые файлы.
        // Наполнить данную директорию книгами, 100 книг мнинимум.
        // При запуске пользователю в консоль выдать список txt файлов
        // и предложить выбрать текст, с которым мы будем работать.
        // Пользователь, выбрав текст вводит то, что он хочет найти в этом тексте.
        // После каждого ввода осуществляется поиск. Вводит пока не надоест.
        // Результат всех его поисков должен накапливаться в файла result.txt
        // в формате «Имя файла – слово – количество»

        Scanner console = new Scanner(System.in);

        System.out.println("Введите адрес папки, из которой мы будет считывать текстовые файлы");
        String filePath = console.nextLine();

        File file = new File(filePath);

        System.out.println("Список txt файлов:");


        File[] listOfFiles = file.listFiles();
        for (File item : listOfFiles) {
            System.out.println(item.getName());
        }

        //System.out.println("Выбирете файл, с которым будете работать, если не будете работать с файлами, введите null");

        //String text =console.nextLine();

        //System.out.println("Вводите то слово, которое вы хотите найти в этом тексте");
       // String word = console.nextLine();

        try {
            File resultFile = new File(filePath + "\\result.txt");
            if (resultFile.createNewFile()) {
                System.out.println("файл result.txt создан");
            } else {
                System.out.println("файл result.txt уже существует ");
            }
        } catch (Exception e) {
            System.err.println(e);
        }


    }
}


