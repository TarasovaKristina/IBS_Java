package ibs.helloworld;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите два числа: ");
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println("Введите один из символов ‘+’, ‘-’, ‘*’, ‘/’: ");
            String z = in.next();
            double ans = 0;
            switch (z) {
                case "+" : ans = x + y;
                    break;
                case "-" : ans = x - y;
                    break;
                case "*" : ans = x * y;
                    break;
                case "/": ans = x / y;
                    break;
            }
            System.out.println("Полученное значение: " + ans);
        }
    }
