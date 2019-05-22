package lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int chet = 2;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = chet;
            chet = chet + 2;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
