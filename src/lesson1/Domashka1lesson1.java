package lesson1;

public class Domashka1lesson1 {
    public static void main(String[] args) {
        double lenghtBox = 11.2;
        double widthBox = 5.6;
        double heightBox = 7.3;
        double lenghtQube = 1.1;
        double widhtQube = 0.8;
        double heightQube = 0.9;

        double valueBox = lenghtBox * widthBox * heightBox;
        double valueQube = lenghtQube * widhtQube * heightQube;
        int countTable = (int) (valueBox / valueQube);
        System.out.println(countTable);
    }
}
