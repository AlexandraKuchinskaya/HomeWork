package HomeWork5.main;

import HomeWork5.dto.EasySearch;
import HomeWork5.dto.SearchEngineWithoutRegister;
import HomeWork5.dto.api.ISearchEngine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static java.nio.file.Path.of;

public class EasySearchMain {
    //5. Используя реализации интерфейса ISearchEngine вывести информацию
    // как часто встречаются слова "война", "и" (как союз), "мир" вне зависимости от регистра.

    public static void main(String[] args) {
        String warAndPeace = null;

        try {
            Path reader = of("Война и мир_книга.txt");
            warAndPeace = Files.readString(reader);
        }
        catch (FileNotFoundException e) {
            System.out.println("Ввели неверный путь к файлу" );

        } catch (IOException e) {
            System.out.println("Проблемы с файлом" );
        }

        EasySearch search1 = new EasySearch();
        SearchEngineWithoutRegister search2 = new SearchEngineWithoutRegister(search1);

        Long count1 = search2.search(warAndPeace, "война");
        Long count2 = search2.search(warAndPeace, "и");
        Long count3 = search2.search(warAndPeace, "мир");

        System.out.println("война " + count1);
        System.out.println("и " + count2);
        System.out.println("мир " + count3);

    }

}
