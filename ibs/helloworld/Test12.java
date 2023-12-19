package ibs.helloworld;

public class Test12 {
    public static void main(String[] args) {
        String string = "I like Java!!!";

        String substring = "Java";
        boolean res1 = string.contains(substring);

        String substring1 = "I like";
        boolean res2 = string.startsWith(substring1);

        String substring2 = "!!!";
        boolean res3 = string.endsWith(substring2);

        if ((res1 && res2 && res3) == true) {
            System.out.println("В верхнем регистре: " + string.toUpperCase());
        }

        String replacement = string.replace("a", "o");
        System.out.println("Полученная строка: " + replacement.substring(7, 11));
    }
}


