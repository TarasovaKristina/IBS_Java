package ibs.helloworld;

import java.util.Arrays;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте размер массиву: ");
        int size = in.nextInt();
        double doubleArray[] = new double[size];
        double sum = 0;
        int i = 0;
        System.out.println("Заполните массив вещественными числами ");
        for (i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = in.nextDouble();
            sum += doubleArray[i];
        }
            double average = sum / doubleArray.length;
        for (i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = doubleArray[i] * average;
        }
        System.out.println("Элемент массива * на среднее арифметическое элементов массива = " + (Arrays.toString(doubleArray)));
        }

    }


