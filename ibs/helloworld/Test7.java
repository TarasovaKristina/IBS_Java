package ibs.helloworld;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        int x = 12;
        int y = 5;
        int z = 65;
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте размер массиву: ");
        int size = in.nextInt();
         int array[] = new int[size];
        System.out.println("Заполните массив целыми числами. Введите " + size + " числа");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
            for (int i = 0; i < size; i++) {
                if (array[i] == x || array[i] == y || array[i] == z){
                    System.out.print ("Данное значение имеется в константах - " + array[i] + "\n");
                }
            }
        }
    }

