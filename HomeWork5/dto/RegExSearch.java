package HomeWork5.dto;

import HomeWork5.dto.api.ISearchEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    // Написать класс RegExSearch реализующий интерфейс ISearchEngine.
    // Реализовать поиск при помощи класса Matcher.
    // Данный класс ищет слова с учётом регистра.
    private boolean register;

    public RegExSearch() {
        register = false;
    }

    public RegExSearch(boolean register) {
        this.register = register;
    }

    /**
     * Метод ищет слова в тексте и возращает количество раз, которое слово встретилось в тексте
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return возвращает информации о количестве раз, которое встречается слово в тексте.
     */
    @Override
    public long search(String text, String word) {
        Pattern patern;

        if (register) {
            patern = Pattern.compile("[[a-zA-Z][А-я][Ёё]]+-?[[a-zA-Z][А-я][Ёё]]*");
        } else {
            patern = Pattern.compile("[[a-zA-Z][А-я][Ёё]]+-?[[a-zA-Z][А-я][Ёё]]*", Pattern.CASE_INSENSITIVE);
        }

        Matcher matcher = patern.matcher(text);

            Map<String, Integer> words = new HashMap<>();


            while (matcher.find()) {
                String findWord = matcher.group();
                if (words.containsKey(findWord)) {
                    int countKeys = words.get(findWord) + 1;
                    words.put(findWord, countKeys);
                } else {
                    words.put(findWord, 1);
                }
            }
            return words.getOrDefault(word, 0);
    }
}

