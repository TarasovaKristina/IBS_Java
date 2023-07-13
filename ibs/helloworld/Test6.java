package ibs.helloworld;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int weight = in.nextInt();
        if (weight == 1) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограм, 3 - унция, 4 - фунт");
        }
        if (weight == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        }
        int measurementUnits = in.nextInt();
        System.out.println("Введите количество выбранных единиц измерения: ");
        double numberOfUnits = in.nextDouble();
        if (weight == 1){
            double gram = 0;
            double kilogram = 0;
            double ounce = 0;
            double pound = 0;
            switch (measurementUnits) {
                case 1:
                    gram = numberOfUnits;
                    kilogram = numberOfUnits / 1000;
                    ounce = numberOfUnits  / 28.350;
                    pound = numberOfUnits / 453.592;
                    break;
                case 2:
                    gram = numberOfUnits * 1000;
                    kilogram = numberOfUnits;
                    ounce = numberOfUnits * 35.274;
                    pound = numberOfUnits * 22.046;
                    break;
                case 3:
                    gram = numberOfUnits * 28.349;
                    kilogram = numberOfUnits / 35.274;
                    ounce = numberOfUnits;
                    pound = numberOfUnits / 16;
                    break;
                case 4:
                    gram = numberOfUnits * 453.592;
                    kilogram = numberOfUnits / 2.205;
                    ounce = numberOfUnits * 16;
                    pound = numberOfUnits;
                    break;
            }
            System.out.println("Результат:\nГрамм: " + gram + "\nКилограм: " + kilogram + "\nУнция: " + ounce + "\nФунт: " + pound);
        }
        if (weight == 2) {
            double meter = 0;
            double mile = 0;
            double yard = 0;
            double foot = 0;
            switch (measurementUnits) {
                case 1:
                    meter = numberOfUnits;
                    mile = numberOfUnits / 1609.344;
                    yard = numberOfUnits * 1.094;
                    foot = numberOfUnits * 3.281;
                    break;
                case 2:
                    meter = numberOfUnits * 1609.34;
                    mile = numberOfUnits;
                    yard = numberOfUnits* 1760;
                    foot = numberOfUnits * 5280;
                    break;
                case 3:
                    meter = numberOfUnits / 1.094;
                    mile = numberOfUnits / 1760;
                    yard = numberOfUnits;
                    foot = numberOfUnits * 3;
                    break;
                case 4:
                    meter = numberOfUnits / 3.281;
                    mile = numberOfUnits / 5280;
                    yard = numberOfUnits / 3;
                    foot = numberOfUnits;
                    break;
            }
            System.out.println("Результат:\nМетр: " + meter + "\nМиля: " + mile + "\nЯрд: " + yard + "\nФут: " + foot);
        }
    }
}

