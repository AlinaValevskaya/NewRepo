package Test;
import java.util.Scanner;

public class Hello{
    public static float ABC (float a, float b){
        float P=a*b;//произведение катетов треугольника
        return P;
    }
    public static void Pr (float x,float y){
        float S=ABC(x, y)/2;
        System.out.println("Площадь прямоугольного треугольника ="+S);
    }
    //комментарий
	public static void main(String args[])
	{
        int a,b;//значение катетов в треугольнике

        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        //Hello sp = new Hello();
        //sp.Pr(a,b);
        Pr(a,b);

	}

}