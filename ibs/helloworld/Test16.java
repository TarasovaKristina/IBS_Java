package ibs.helloworld;
import java.util.Arrays;
import java.util.Scanner;

import static java.awt.geom.Path2D.contains;

public class Test16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Пожалуйста, введите строку, длиной 5 символов: ");
        String string = in.nextLine();
        String[] charArr = string.substring(0, 5).split("");
        System.out.println(Arrays.toString(charArr));
        int result = 0;
        for (int i = 0; i < charArr.length; i++) {
                if (charArr[1].equals("-")) {
                    if (charArr[0].equals("x")) {
                        int index4 = Integer.parseInt(charArr[4]);
                        int index2 = Integer.parseInt(charArr[2]);
                        result = index4 + index2;
                    } else if (charArr[2].equals("x")) {
                        int index0 = Integer.parseInt(charArr[0]);
                        int index4 = Integer.parseInt(charArr[4]);
                        result = index0 - index4;
                    } else if (charArr[4].equals("x")) {
                        int index0 = Integer.parseInt(charArr[0]);
                        int index2 = Integer.parseInt(charArr[2]);
                        result = index0 - index2;
                    }
                } else if (charArr[1].equals("+")) {
                    if (charArr[0].equals("x")) {
                        int index4 = Integer.parseInt(charArr[4]);
                        int index2 = Integer.parseInt(charArr[2]);
                        result = index4 - index2;
                    } else if (charArr[2].equals("x")) {
                        int index4 = Integer.parseInt(charArr[4]);
                        int index0 = Integer.parseInt(charArr[0]);
                        result = index4 - index0;

                    } else if (charArr[4].equals("x")) {
                        int index2 = Integer.parseInt(charArr[2]);
                        int index0 = Integer.parseInt(charArr[0]);
                        result = index0 + index2;
                    }
                }
                else {
                    System.out.println("Не правильный ввод");
                    break;
                }
        }
        System.out.println("Вывод:" + result);
    }
}
