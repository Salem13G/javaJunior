package lesson2;

public class DZ7Zadacha {
    public static void main(String[] args) {
        double sum = 10000;
        for (double i = 0; i <= 20; i++) {
            sum = sum + sum * 7 / 100;

        }

        System.out.println(sum);
    }
}
