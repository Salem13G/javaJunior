package lesson7;

public class DZQuadrax {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public void printInfo() {
        double square = side * side;
        double perimetr = side * 4;
        System.out.printf("Квадрат: Площадь - %f, Периметр - %f", square, perimetr);
        System.out.println();
    }
}
