package lesson7;

import java.util.Scanner;

public class FractionSimplify {
    public static void main(String[] args) {
        Scanner DrobnoeChislo = new Scanner(System.in);

        int chis = DrobnoeChislo.nextInt();
        int znam = DrobnoeChislo.nextInt();


        for (int i = 1; i < chis; i++) {
            if (chis % i == 0 && znam % i == 0) {
                chis /= i;
                znam /= i;
            } while (chis % 2 == 0 && znam % 2 == 0) {
                chis /= 2;
                znam /= 2;
            }
        }
        System.out.printf("Дробь сократится и станет: %d %d", chis, znam);
        System.out.println();
    }
}



