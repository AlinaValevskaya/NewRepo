package Test;
import java.util.Scanner;

public class Menu1 {
    public static void main(String args[]) {
        System.out.println("Выберите геометрическую фигуру:");
        System.out.println("1-треугольник");
        System.out.println("2-прямоугольник");
        System.out.println("3-окружность");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        switch (n) {
            case 1:
                System.out.println("Укажите стороны треугольника: ");
                int a = in.nextInt();
                int b = in.nextInt();

                break;
            case 2:
                System.out.println("Укажите стороны прямоугольника: ");
                int c = in.nextInt();
                int d = in.nextInt();
                PR(c, d);

                break;
            case 3:
                System.out.println("Укажите радиус окружности: ");
                int r = in.nextInt();
                Rd(r);

                break;
            default:
                System.out.println("Выбрано неверное значение");

        }
    }

    public static void PR (int a, int b){
        System.out.println("Площадь прямоугольника = "+ a*b);
    }
    public static void Rd (int a){
        System.out.println("Площадь окружности = "+ Math.PI*a*a);
    }


}
