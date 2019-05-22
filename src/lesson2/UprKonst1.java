package lesson2;

public class UprKonst1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;

        if (a == b && b == c) {
            System.out.println("ravnoctoronnij");

        } else if (a == b || b == c || a == c) {
            System.out.println("ravnobedrennij");
        } else if (a != b && b != c && c != a) {
            System.out.println("raznostoronnij");
        }
    }
}
