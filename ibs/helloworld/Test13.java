package ibs.helloworld;

import java.util.Arrays;
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Пожалуйста, введите строку, которую вы хотите проверить ...");
        String needDoStr = in.nextLine();
        String[] words = needDoStr.split(" ");
        System.out.println(Arrays.toString(words));
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[a-zA-Z]+")) {
                count++;
                System.out.println("Cлова, состоящие только из латиницы: " + words[i]);
            }
        }
        System.out.println("Количество этих слов: " + count);
    }
}
