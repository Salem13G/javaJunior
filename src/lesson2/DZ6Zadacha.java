package lesson2;

public class DZ6Zadacha {
    public static void main(String[] args) {
        double a = 5; // яблони
        double b = 3; // груши
        double c = 6; // ведер яблок с каждой яблони
        double d = 10; // ведер с каждой груши
        double e = 4; // литра сока с ведра яблок
        double f = 3; // литра с ведра груш
        double g = 2; // количество дней на литр)

        double days = (a * c / e / g) + (b * d / f / g);
        System.out.println(days);
    }
}
