package lesson4;

import lesson5.StringUtils;
import lesson5.Student;

public class Main {
    public static void main(String[] args) {
        Student.printHello();
        int res = Student.quadraxSquare(6);
        System.out.println(res);

        int res2 = Student.quadraxSquare(98);
        System.out.println(res2);

        String res3 = StringUtils.textReverse("Lets my people go");
        System.out.println(res3);
        int per = Student.trianglePer(5, 6, 9);
        System.out.println(per);

        String res4 = StringUtils.glasnieFromText("Segodnya or Today");
        System.out.println(res4);
    }
}
