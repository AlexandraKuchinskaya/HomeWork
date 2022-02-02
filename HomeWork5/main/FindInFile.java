package HomeWork5.main;

import HomeWork5.dto.RegExSearch;
import HomeWork5.dto.SearchEngineWithoutRegister;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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

        boolean search= true;
        RegExSearch regExSearch = new RegExSearch();
        SearchEngineWithoutRegister decoratorSearch = new SearchEngineWithoutRegister(regExSearch);

        do {
            System.out.println("Выбирете файл, с которым будете работать. Если не будете работать с файлами, введите null");
            String fileName =console.nextLine();
            System.out.println("Ведите слово,которое хотите найти");
            String word =console.nextLine();

            if (fileName == null || fileName.isEmpty()) {
                search = false;
                continue;
            }

            String text = null;

            try {
                Path reader = of(filePath + "\\" + fileName);
                text = Files.readString(reader);
            }
            catch (FileNotFoundException e) {
                System.out.println("Ввели неверный путь к файлу" );

            } catch (IOException e) {
                System.out.println("Проблемы с файлом" );
            }

            Long count = decoratorSearch.search(text, word);

            try {
                FileWriter fileWriter = new FileWriter(filePath + "\\result.txt");
                fileWriter.append ("Имя файла - " + fileName + ", слово - " + word + ", количество найденых слов - " + count);
                fileWriter.close();
            }
            catch (Exception e) {
                System.out.println("Ошибка");
            }

        } while (search);
    }
}


