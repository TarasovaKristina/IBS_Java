package ibs.helloworld;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите значения!!!" + "\n");

        System.out.println("Курс доллара: ");
        double course = in.nextDouble();

        System.out.println("Количество рублей: ");
        double quantityRubles = in.nextDouble();
        double result = quantityRubles / course;
        String quantityDollars = String.format("%.2f", result);

        System.out.println("Итого: " + quantityDollars + " долларов" );
    }
}
