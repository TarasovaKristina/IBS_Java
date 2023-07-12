package ibs.helloworld;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три целых числа(x,y,z): \nx = ");
        double x = in.nextDouble();
        System.out.println("y = ");
        double y = in.nextDouble();
        System.out.println("z = ");
        double z = in.nextDouble();
        double average = (x + y + z)/ 3;
        System.out.println("Средне арифметическое число введенных чисел: " + average);
        double number = Math.floor(average / 2);
        if (number > 3)
            System.out.println("Программа выполнена корректно");
        }
    }


