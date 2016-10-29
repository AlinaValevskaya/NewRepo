package Test;
import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {

        int a,b,c;

        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        max (a,b,c);
        min (a,b,c);
        sredn (a,b,c);
    }

    public static void max (int a,int b, int c) {
        if (a > b) {

            if (a > c)
                System.out.println("Максимальное значение - " + a);
            else
                System.out.println("Максимальное значение - " + c);

        } else {
            if (b > c)
                System.out.println("Максимальное значение - " + b);
             else
                System.out.println("Максимальное значение - " + c);


        }
    }//вычисление максимального значения из трех

    public static void min (int a,int b, int c) {
        if (a < b) {

            if (a < c)
                System.out.println("Минимальное значение - " + a);
             else
                System.out.println("Минимальное значение - " + c);

        } else {
            if (b < c)
                System.out.println("Минимальное значение - " + b);
             else
                System.out.println("Минимальное значение -" + c);

        }
    }//вычисление минимального значения из трех

    public static void sredn (double a,double b, double c) {
        double s = (a+b+c)/3;
        System.out.println("Среднее значение - " + s);
    }//вычисление среднего значения из трех
}
