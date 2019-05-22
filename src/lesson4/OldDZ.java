package lesson4;

public class OldDZ {
    public static void main(String[] args) { //DZ
        int[] numbers = {2, 5, 3, 5, 6, 8, 98};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int ostatok = numbers[i] % 2;

            if (ostatok == 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println(sum);
    }
}
