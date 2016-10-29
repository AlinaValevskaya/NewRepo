package Test;
import java.util.Scanner;


public class Max2 {
    public static void main(String[] args) {

        int a,b;

        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        max(a,b);
    }

    public static void max (int a,int b) {
        if (a>b){
            System.out.println("Максимальное значение - "+a);
            System.out.println("Минимальное значение - "+b);
        } else if(a<b){
            System.out.println("Максимальное значение - "+b);
            System.out.println("Минимальное значение - "+a);
        }
        else {
            System.out.println("Числа равны");
        }

    }
}


