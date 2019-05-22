package lesson14;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input number:");
        String inputNum = scanner.nextLine();
        //Integer.parseInt(inputNum);
        int num = 0;

        try {
             num = Integer.parseInt(inputNum);
        }catch (Exception e) {
            System.out.println("WRONG");

        }finally {
            System.out.println("Fuck you");

        }

        System.out.println(num);
    }
}
