package ibs.helloworld;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 9, 38, 60};
        int a = array[0];
        array[0] = array[4];
        array[4] = a;
        System.out.println(array[array.length-3] + array[array.length-5]);
        // Не знаю как правильно. Так же можно присвоить переменные и сумировать их
        // int first = array[array.length-3];
        // int second = array[array.length-5];
        // int sum = first + second;
        //System.out.println(sum);
    }
}