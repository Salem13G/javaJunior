package lesson7;

public class Phone {


    private double diagonal;
    private int battery;
    private String color;
    private String name;

    public void setBattery(int battery) {
        this.battery = battery;


    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.printf("Телефон: диагональ - %f, батарея - %d, цвет - %s, имя - %s", diagonal, battery, color, name);
        System.out.println();
    }
}
