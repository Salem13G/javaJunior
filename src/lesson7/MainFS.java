package lesson7;

import java.util.Scanner;

public class MainFS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите числитель: ");
        String c = in.next();
        System.out.print("Введите знаменатель: ");
        String d = in.next();
        Fraction a = new Fraction(c, d);

        System.out.printf("Исходная дробь %d/%d сокращается до %s", c, d, a.simplify().toString());
    }
}


