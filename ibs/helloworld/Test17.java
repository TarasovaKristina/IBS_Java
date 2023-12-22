package ibs.helloworld;

import java.util.Arrays;
import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int quantityLine = in.nextInt();
        String[] strings = new String[quantityLine];
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Строка: " + (i + 1));
            strings[i] = in2.nextLine();
        }

        int[] countString = new int[quantityLine];
        for (int i = 0; i < strings.length; i++) {
            for (int j = i; j < strings[i].length(); j++) {
                char temp = ' ';
                for (int z = j; z < strings[i].length(); z++) {
                    if (strings[i].charAt(j) != strings[i].charAt(z) & temp != strings[i].charAt(z)) {
                        temp = strings[i].charAt(z);
                        countString[i]++;
                    }
                }
            }
        }
        int max = 0;
        String answer = "";
        for (int i = 0; i < countString.length; i++) {
            if (max <= countString[i]) {
                max = countString[i];
                answer = strings[i];
            }
        }

        System.out.println("Ответ: " + answer);
    }
}