package HomeWork5.dto;

import HomeWork5.dto.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    /**
     * Метод ищет слова в тексте и возращает количество раз, которое слово встретилось в тексте
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return возвращает информации о количестве раз, которое встречается слово в тексте.
     */
    @Override
    public long search(String text, String word) {
        long count = 0L;
        int index = text.indexOf(word);
        while (index >= 0) {
            count++;
            index= text.indexOf(word,index+1);
        }
        return count;
    }
}
