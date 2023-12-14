package ibs.helloworld;

import java.util.Scanner;

public class Test8 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите любое целое положительное число: ");
            int positiveNumber = in.nextInt();
            int sum = 0;
            int oddNumber = 1;
            while(oddNumber < positiveNumber)
            {
                if (oddNumber % 2 != 0)
                {
                    sum += oddNumber;
                }
                oddNumber++;
            }
            System.out.println("Сумма всех нечетных чисел от 1 до введенного числа составляет: " + sum);
            }
        }
