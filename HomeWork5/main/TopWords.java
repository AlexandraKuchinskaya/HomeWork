package HomeWork5.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.file.Path.of;

public class TopWords {
    public static void main(String[] args) {

        // 2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List.
        // Отсортировать по количеству. Распечатать в консоль.
        //		Пример: Война - 200 раз, Мир - 100 раз и так далее. Знаки препинания, пробелы и переводы строк - это не слова.
        //		Более подробное описание задачи, для понимания чего я хочу:
        //		Для решения данной задачи необходимо прочитать текстовый файл
        //		и поместить текст из данного текстового файла в строку.
        //		Далее данную строку необходимо обработать таким образом
        //		чтобы из неё можно было бы считывать слова.
        //		Далее каждое полученное слово поместить как ключ в Map,
        //		а количество повторений в тексте ставить как значение.
        //		Для того чтобы это работало вам необходимо постоянно проверять наличие ключа в Map,
        //		и если нужный нам ключ уже присутсвует в нашей коллекции
        //		то мы должны увеличить уже имеющееся значение в коллекции на еденицу.
        //		После наполнения данной коллекции мы получим набор слов и их количество в тексте.
        //		Далее нам нужно придумать как отсортировать получившуюся коллекцию
        //		но к сожалению непосредственно эту коллекцию отсортировать не получится,
        //		придётся создавать для этого List и наполнять лист Entry из Map.
        //		В итоге из получившегося отсортированного набора данных вывести первые N записей.

        Scanner console = new Scanner(System.in);

        String warAndPeace = null;

        try {
            Path reader = of("Война и мир_книга.txt");
            warAndPeace = Files.readString(reader);
        } catch (FileNotFoundException e) {
            System.out.println("Ввели неверный путь к файлу");

        } catch (IOException e) {
            System.out.println("Проблемы с файлом");
        }

        //System.out.println(warAndPeace);

        Pattern patern = Pattern.compile("[[0-9][a-zA-Z][А-я][Ёё]]+-?[[0-9][a-zA-Z][А-я][Ёё]]*");
        Matcher matcher = patern.matcher(warAndPeace);

       Map<String, Integer> topWordsMap = new HashMap<>();

       int countKeys = 0;

       while (matcher.find()) {
            String word = matcher.group();
            if (topWordsMap.containsKey(word)) {
                countKeys = topWordsMap.get(word) +1;
                topWordsMap.put(word, countKeys);
            } else {
                topWordsMap.put(word, 1);
            }
        }

       System.out.println("Введите топ сколько слов вы хотите увидеть?");
        int countTop = console.nextInt();

       List <Map.Entry <String, Integer>> topWordsList = new ArrayList<>(topWordsMap.entrySet());
       Collections.sort(topWordsList, new Comparator<Map.Entry<String, Integer>>() {
           @Override
           public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               return o2.getValue()-o1.getValue();
           }
       });

        System.out.println("Топ " + countTop + " часто встречаемых слов");

        for (int i = 0; i < countTop; i++) {
            System.out.println((i + 1) + ". " + topWordsList.get(i));

        }
    }
}
