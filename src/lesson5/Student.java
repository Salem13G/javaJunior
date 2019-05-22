package lesson5;

public class Student {

    //1-модификатор доступа (4 вида)
    //2- статичность (частная или гос собственность
    // 3 - возвращаемый тип
    // 4 - название метода
    // 5 - входящие параметры
    public static void printHello() {
        System.out.println("Hello");

    }

    public static int quadraxSquare(int side) {
        return side * side;

    }

    public static int trianglePer(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }

}
