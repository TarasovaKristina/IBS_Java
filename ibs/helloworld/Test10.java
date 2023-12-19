package ibs.helloworld;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = in.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("Первая строка матрицы, где каждый элемент * 3");
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = matrix[0][i] * 3;
            System.out.print(matrix[0][i] + " ");
        }
    }
}