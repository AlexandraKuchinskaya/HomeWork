package HomeWork5.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.file.Path.of;

public class AllUsedWords {
    public static void main(String[] args) {

        // 2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.
        //		Более подробное описание задачи, для понимания чего я хочу:
        //		Для решения данной задачи необходимо прочитать текстовый файл
        //		и поместить текст из данного текстового файла в строку.
        //		Далее данную строку необходимо обработать таким образом
        //		чтобы из неё можно было бы считывать слова. Далее каждое полученное слово поместить в Set.
        //		Благодаря возможностям Set'ов в итоге мы получим коллекцию содержащую набор слов
        //		который был использован при написании данного текста.
        //		В конце выводим в консоль количество использованных слов.

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


        Pattern patern = Pattern.compile("[[0-9][a-zA-Z][А-я][Ёё]]+-?[[0-9][a-zA-Z][А-я][Ёё]]*");
        Matcher matcher = patern.matcher(warAndPeace);

        Set<String> data = new HashSet<>();

        int countWords = 0;

        while (matcher.find()) {
            countWords++;
            data.add(matcher.group());
        }

        System.out.println("Количество использованных слов: " + countWords);
        System.out.println("Количество использованных уникальных слов: " + data.size());

        //System.out.println(warAndPeace);

    }
}
