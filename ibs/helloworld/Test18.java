package ibs.helloworld;
import java.util.Scanner;
public class Test18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Отгадайте загадку. Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        String answer;
        boolean correctAnswer;
        int count = 0;
        String advice = "Вирус";

        while (count<3) {
            answer = in.nextLine();
            correctAnswer = answer.equalsIgnoreCase("Заархивированный вирус");
            if (answer.equalsIgnoreCase("Подсказка") & count == 0) {
                System.out.println(advice);
            }else if (correctAnswer) {
                System.out.println("Правильно!");
                break;
            }else if (answer.equalsIgnoreCase("Подсказка") & (count <= 2)) {
                System.out.println("Подсказка уже недоступна");
                count++;
            }
            else if (count < 2){
                System.out.println("Подумай еще");
                count++;
            }else{
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}