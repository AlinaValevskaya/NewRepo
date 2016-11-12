package Test.Example02;
import java.util.Scanner;

public class questions {
    public static void main(String args[]) {
        String [] Q = new String [10];
        Q [0] = "Вопрос 1:";
        System.out.println (Q[0]);

        String [] optsQ1 = new String [10];
        optsQ1 [1] = "1. Вариант 1";
        optsQ1 [2] = "2. Вариант 2";
        optsQ1 [3] = "3. Вариант 3";
        for (int i=1; i<4; i++){
            System.out.println(optsQ1[i]);
        }


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int answ = 0;

        if (optsQ1[x] == optsQ1[3])
            answ++;
        else
            System.out.println("Ответ не верный");

        System.out.println("Количество правильных ответов:" +answ);

    }
}
