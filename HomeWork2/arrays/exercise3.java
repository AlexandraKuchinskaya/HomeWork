package HomeWork2.arrays;

import HomeWork2.utils.arraysUtils;

import java.util.Arrays;

public class exercise3 {
    public static void main(String[] args) {
        int [] data ={4,3,2,1};

        boolean isSorted = false;
        int a;
        while (!isSorted) {
            isSorted=true;
            for (int i = 0; i < data.length -1; i++) {
                if (data [i]> data[i+1]){
                    isSorted=false;

                    a=data[i];
                    data [i]= data[i+1];
                    data [i+1]=a;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
