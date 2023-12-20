package ibs.helloworld;

import java.util.Arrays;

public class Test14 {
    public static void main(String[] args) {
        int array[] = new int[15];
        int minimum = 0;
        int maximum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 40) - 20;

            if(minimum > array[i]){
                minimum = array[i];
            }
            if (maximum < array[i]){
                maximum = array[i];
            }
        }
        System.out.println((Arrays.toString(array)));
        System.out.print("Максимальный элемент массива: " + maximum + "\n");
        System.out.print("Минимальный элемент массива: " + minimum + "\n");

        int resultMax = Math.max(minimum, maximum);
        System.out.println("Наибольший по модулю элемент: " + resultMax);
    }
}
