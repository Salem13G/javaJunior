package lesson7;

public class DZRectangle {
    private double sideA;
    private double sideB;

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void printInfo() {
        double square = sideA * sideB;
        double perimetr = (sideA * 2) + (sideB * 2);
        System.out.printf("Прямоугольник: Площадь - %f, Периметр - %f", square, perimetr);
        System.out.println();

    }
}
