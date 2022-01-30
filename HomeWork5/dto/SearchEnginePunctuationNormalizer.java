package HomeWork5.dto;

import HomeWork5.dto.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    //4.3* Написать декоратор SearchEnginePunctuationNormalizer для ISearchEngine
    // который будет удалять нежелательные символы.
    // Любые знаки препинания, лишние пробелы и например переводы строк.

    private ISearchEngine engine;

    public SearchEnginePunctuationNormalizer(ISearchEngine engine) {
        this.engine = engine;
    }

    @Override
    public long search(String text, String word) {
        String newText = punctuationNormalizer(text);
        return search(newText, word);
    }

    private String punctuationNormalizer (String text) {
        Pattern pattern = Pattern.compile("\\s+|\\p{Punct}+");
        Matcher matcher = pattern.matcher(text);

        String newText = matcher.replaceAll(" ");

        return newText;
    }


}
