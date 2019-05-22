package lesson16.blackJack;

import java.util.Scanner;

public class Human extends Player {
    @Override
    public boolean doAction() {

        System.out.println("ваши действия?");
        System.out.println("любая кнопка - не брать карту");
        System.out.println("1 - взять карту");
        Scanner sc = new Scanner(System.in);
        String humanInput = sc.nextLine();
        if (humanInput.equals("1")){
            return true;

        }
        this.setContinue(false);
        return false;
    }
    @Override
    public String toString() {
        return "Человек " + getPoints();
    }
}
