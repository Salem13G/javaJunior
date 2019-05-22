package lesson2;

public class DZ4 {
    public static void main(String[] args) {
        for (int i = 10; i <= 30; i++) {
            if (20 < i && 25 > i) {    // КРОМЕ (взято из лекции слайд18
                continue;

            }
            System.out.println(i);
        }

    }
}
