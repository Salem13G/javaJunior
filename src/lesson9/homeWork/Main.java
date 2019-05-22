package lesson9.homeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        Triangle triangle3 = new Triangle();

        triangle1.setSide1(12);
        triangle1.setSide2(15);
        triangle1.setSide3(18);

        triangle2.setSide1(110);
        triangle2.setSide2(451);
        triangle2.setSide3(541);

        triangle3.setSide1(65);
        triangle3.setSide2(62);
        triangle3.setSide3(66);

        Rhombus rhombus1 = new Rhombus();
        Rhombus rhombus2 = new Rhombus();
        Rhombus rhombus3 = new Rhombus();

        rhombus1.setBase(15);
        rhombus1.setHeight(54);

        rhombus2.setBase(254);
        rhombus2.setHeight(654);

        rhombus3.setBase(3);
        rhombus3.setHeight(6);

        Figure figure = new Figure();

        Figure[] figures = new Figure[6];
        figures[0] = triangle1;
        figures[1] = triangle2;
        figures[2] = triangle3;
        figures[3] = rhombus1;
        figures[4] = rhombus2;
        figures[5] = rhombus3;

        for (Figure f : figures) {
            System.out.println(f); //оставил строку, чтобы можно было видеть данные переменных в консоли
        }

        System.out.println("Выберите нужное: Если площадь - нажмите 1; " +   //Пока не понял как использовать буквы или слова совместно с if
                "Если периметр - нажмите 2");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i == 1) {
            triangle1.printSquare();
            triangle2.printSquare();
            triangle3.printSquare();
            rhombus1.printSquare();
            rhombus2.printSquare();
            rhombus3.printSquare();
        } else if (i == 2) {
            triangle1.printPerimetr();
            triangle2.printPerimetr();
            triangle3.printPerimetr();
            rhombus1.printPerimetr();
            rhombus2.printPerimetr();
            rhombus3.printPerimetr();
        }


    }
}
