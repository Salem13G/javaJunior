package lesson7;

public class DZTriangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public void printInfo() {
        double p = (sideA + sideB + sideC) / 2;
        double square = Math.sqrt(p);
        double perimetr = sideA + sideB + sideC;
        System.out.printf("Треугольник: Площадь - %f, Периметр - %f", square, perimetr);
        System.out.println();
    }
}
