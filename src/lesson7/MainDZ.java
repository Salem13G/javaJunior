package lesson7;

public class MainDZ {
    public static void main(String[] args) {

        DZCircleNew circle = new DZCircleNew();
        DZCircleNew circle1 = new DZCircleNew();

        circle.setRadius(42.11);
        circle1.setRadius(52.99);

        circle.printInfo();
        circle1.printInfo();

        DZRectangle rectangle = new DZRectangle();
        DZRectangle rectangle11 = new DZRectangle();

        rectangle.setSideA(15.1);
        rectangle.setSideB(22.4);
        rectangle11.setSideA(56.0);
        rectangle11.setSideB(48.3);

        rectangle.printInfo();
        rectangle11.printInfo();

        DZQuadrax quadrax = new DZQuadrax();
        DZQuadrax quadrax1= new DZQuadrax();

        quadrax.setSide(18.9);
        quadrax1.setSide(17.54);

        quadrax.printInfo();
        quadrax1.printInfo();

        DZTriangle triangle = new DZTriangle();
        DZTriangle triangle1 = new DZTriangle();

        triangle.setSideA(12.3);
        triangle.setSideB(11.0);
        triangle.setSideC(41.8);
        triangle1.setSideA(54.9);
        triangle1.setSideB(98.1);
        triangle1.setSideC(78.2);

        triangle.printInfo();
        triangle1.printInfo();

        FractionSimplify drob = new FractionSimplify();



    }
}
