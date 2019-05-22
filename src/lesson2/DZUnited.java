package lesson2;

public class DZUnited {
    public static void main(String[] args) {
        for (int i = -20; i <= 0; i++) {  // вывод чисел в последовательности от -20 до 0
            System.out.println(i);
        }
        System.out.println("next");
        for (int i = 500; i <= 1000; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                System.out.println(i);
            }

        }
        System.out.println("next");
        for (int i = 50; i <= 1000; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                System.out.println(i);
            }

        }
        System.out.println("next");
        for (int i = 10; i <= 30; i++) {
            if (20 < i && 25 > i) {    // КРОМЕ (взято из лекции слайд18)
                continue;

            }
            System.out.println(i);
        }
        System.out.println("next");
        for (int i = 100; i >= 90; i--) {
            System.out.println(i);

        }
        System.out.println("next");
        for (int i = 1; i <= 20; i++) {
            if (4 < i && 11 > i) {
                continue;
            }
            System.out.println(i);
        }
    }
}


