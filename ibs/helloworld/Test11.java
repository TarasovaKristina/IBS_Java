package ibs.helloworld;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = in.nextInt();
        String firstStrNumber = Integer.toString(first);

        System.out.print("Введите второе число: ");
        int second = in.nextInt();

        int maxNumber = Math.max(Integer.parseInt(firstStrNumber), second);
        System.out.println("Большее число: " + maxNumber);


        double minNumber = Math.min(Integer.parseInt(firstStrNumber), second);
        System.out.println("Меньшее число: " + minNumber);
    }
}
