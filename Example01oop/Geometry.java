package Test.Example01oop;

public class Geometry {
    public static void main (String [] args){
        Rectangle rect = new Rectangle();
        rect.a = 10;
        rect.b = 20;
        int p = rect.perimetr();
        System.out.println("Периметр прямоугольника="+p);
        rect.draw();

        Triangle trian = new Triangle();
        trian.a = 5;
        trian.b = 4;
        trian.c = 6;
        int P = trian.perimetr();
        System.out.println("Периметр треугольника="+P);
        trian.draw();
    }

}

abstract class Shape {
    void draw (){
        System.out.println("Рисуем фигуру");
    }
}

class Rectangle extends Shape {
    int a, b;
    int perimetr() {
        return 2 * (a + b);
    }
}

class Triangle extends Shape {
    int a,b,c;
    int perimetr() {
        return a+b+c;
    }

}