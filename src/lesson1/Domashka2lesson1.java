package lesson1;

public class Domashka2lesson1 {
    public static void main(String[] args) {
        double a = 5;
        double b = 7;
        double c = 9;
        double p = (a + b + c) / 2;

        double square = (p * (p - a) * (p - b) * (p - c));
        System.out.println(Math.sqrt(square));
    }
}
