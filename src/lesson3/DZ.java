package lesson3;

public class DZ {
    public static void main(String[] args) {
        int[] mass = {9, 15, 25, 45, 87, 2};
        for (int i = 0; i < mass.length; i++) {


        }
        System.out.println(mass[0] + mass[1] + mass[2] + mass[3] + mass[4] + mass[5]);
        System.out.println("либо так:");
        {
          int [] mass1 = {9, 15, 25, 45, 87, 2};
          int sum = 0;
          for (int st : mass1){
            sum = sum + st;
        }
            System.out.println(sum);
        }

    }

}
