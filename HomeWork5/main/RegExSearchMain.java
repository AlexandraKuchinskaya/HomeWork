package HomeWork5.main;

import HomeWork5.dto.RegExSearch;
import HomeWork5.dto.SearchEngineWithoutRegister;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static java.nio.file.Path.of;

public class RegExSearchMain {
    public static void main(String[] args) {
        String warAndPeace = null;

        try {
            Path reader = of("Война и мир_книга.txt");
            warAndPeace = Files.readString(reader);
        } catch (FileNotFoundException e) {
            System.out.println("Ввели неверный путь к файлу");

        } catch (IOException e) {
            System.out.println("Проблемы с файлом");
        }

        RegExSearch search1= new RegExSearch();
        SearchEngineWithoutRegister decoratorSearch = new SearchEngineWithoutRegister(search1);

        long count1 = decoratorSearch.search(warAndPeace, "война");
        long count2 = decoratorSearch.search(warAndPeace, "и");
        long count3 = decoratorSearch.search(warAndPeace, "мир");

        System.out.println("война " + count1);
        System.out.println("и " + count2);
        System.out.println("мир " + count3);

    }
}
