package HomeWork5.main;

import HomeWork5.dto.EasySearch;
import HomeWork5.dto.RegExSearch;
import HomeWork5.dto.SearchEnginePunctuationNormalizer;
import HomeWork5.dto.api.ISearchEngine;


import java.util.Arrays;
import java.util.Scanner;

public class TestISearchEngine {
    public static void main(String[] args) {

        ISearchEngine easySearch = new EasySearch();
        ISearchEngine regExSearch = new RegExSearch();
        ISearchEngine searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(new EasySearch());

        testSearch(easySearch);

        System.out.println("______________" );

        testSearch(regExSearch);

        System.out.println("______________" );

        testSearch(searchEnginePunctuationNormalizer);

    }

    public static void testSearch(ISearchEngine engine) {
        Scanner consol = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = consol.nextLine();
        System.out.println("Введите слово");
        String word = consol.nextLine();
        System.out.println("Количество использования слова " + word+" с учетом регистра:"+ engine.search(text, word));
    }
}
