package HomeWork5.dto;

import HomeWork5.dto.api.ISearchEngine;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngineWithoutRegister implements ISearchEngine {
    //4.4* Написать декоратор для ISearchEngine который будет позволять искать данные без учёта регистра.
    //		Более подробное описание задачи, для понимания чего я хочу:
    //		Тут можно пойти на хитрость, данный класс может просто приводить весь текст
    //		и передаваемое слово к нижнему регистру
    //		но тут возникает вопрос как данный класс может помочь для RegExSearch.
    //		Класс RegExSearch в своей реализации использует регулярные выражения
    //		и в случае с регулярными выражениями есть возможность указать свойство CASE_INSENSITIVE
    //		для выражение и оно и так станет не чувствительно к регистру.
    //		Для того чтобы тут что-то оптимизировать можно воспользоваться оператором instanceof
    //		и вычислить таки какого класса нам передали объект ISearchEngine.
    //		Данная практика является нежелательной но при этом в некоторых случаях очень эффективной.

    ISearchEngine engine;

    public SearchEngineWithoutRegister(ISearchEngine engine) {
        this.engine = engine;
    }

    @Override
    public long search(String text, String word) {
        String newText;
        String newWord;
        if (engine instanceof EasySearch) {
            newText = text.toLowerCase();
            newWord =word.toLowerCase();
            return engine.search(newText, newWord);
        }
        else {

            RegExSearch regExSearch = new RegExSearch(true);
            return regExSearch.search(text,word);

            /*
            Pattern patern = Pattern.compile("[[a-zA-Z][А-я][Ёё]]+-?[[a-zA-Z][А-я][Ёё]]*", Pattern.CASE_INSENSITIVE);
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

 */
        }
    }
}
