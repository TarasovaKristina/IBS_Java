package ibs.helloworld;

import java.util.Arrays;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте размер массиву: ");
        int size = in.nextInt();
        double array[] = new double[size];
        double sum = 0;
        System.out.println("Заполните массив вещественными числами ");
        for ( int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
            sum += array[i];
        }
            double average = sum / array.length;
        for ( int i = 0; i < array.length; i++) {
            array[i] = array[i] * average;
        }
        System.out.println("Элемент массива * на среднее арифметическое элементов массива = " + (Arrays.toString(array)));
        }

    }


