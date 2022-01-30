package HomeWork5.dto.api;

public interface ISearchEngine {

    //3. Написать интерфейс ISearchEngine. Это будет интерфейс в котором будут методы:
    //	3.1 long search(String text, String word) -
    //	Метод возвращает информации о количестве раз которое встречается слово в тексте.
    //	Первый параметр текст в котором ищем, второй параметр что ищем в тексте.

    long search(String text, String word);
}
