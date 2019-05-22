package lesson13;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input num: ");
        int num = getNum(scanner);
        System.out.println(num);
    }
    private static int getNum (Scanner scanner){
        int num = 0;
        try{
            num = Integer.parseInt(scanner.nextLine());
        }catch (Exception e) {
            System.out.println("Try again: ");
            return getNum(scanner);
        }

        return num;

    }
}
