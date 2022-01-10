package HomeWork4.main;


import HomeWork4.dto.DataContainer;
import HomeWork4.service.comparator.DataContainerIntegerComparator;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] data = {1,77, null, null, 555,null, null, null, 888};
        DataContainer <Integer> container =new DataContainer(data);

        int index1 = container.add(1);
        int index2 = container.add(33);
        int index3 = container.add(8633);
        int index4 = container.add(964);
        System.out.println("index1= " + index1);
        System.out.println("index2= " + index2);
        System.out.println("index3= " + index3);
        System.out.println("index4= " + index4);

        int element1 = container.get(index1);
        int element2 = container.get(index2);
        int element3 = container.get(index3);
        int element4 = container.get(index4);
        System.out.println("element1 " + element1);
        System.out.println("element2= " + element2);
        System.out.println("element3= " + element3);
        System.out.println("element4= " + element4);

        System.out.println("array = " + Arrays.toString(container.getItems()));
        System.out.println(container);

        System.out.println("delete by index= " + container.delete(2));

        System.out.println("delete element = " + container.delete(888));


        Comparator <Integer> comparator = new DataContainerIntegerComparator();

        for (Integer element : container.getData()) {
                System.out.println(element);
        }

        container.sort(comparator);

        // почему не выводит новый отсортированный массив?
        System.out.println("______");
        for (Integer element : container.getData()) {
                System.out.println(element);

        }











    }
}
