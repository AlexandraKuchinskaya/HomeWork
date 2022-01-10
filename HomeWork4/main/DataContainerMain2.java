package HomeWork4.main;

import HomeWork4.dto.DataContainer;

import java.util.Arrays;

public class DataContainerMain2 {
    public static void main(String[] args) {
        String [] data = {null, null, null, null};
        DataContainer <String> container = new DataContainer<>(data);

        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");

        String text1= container.get(index1);
        String text2= container.get(index2);
        String text3= container.get(index3);
        String text4= container.get(index4);

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);

        container.deleteItem(text1);
        
        System.out.println(container.get (index1));
    }
}
