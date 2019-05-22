package lesson7;

public class Main{
    public static void main (String[] args) {


        int a = 9;
        Phone Meizu = new Phone();
        Phone Nokia = new Phone();



        Meizu.setBattery(900);
        Nokia.setBattery(500);

        Meizu.setDiagonal(9);
        Nokia.setDiagonal(8);



        Meizu.printInfo();
        Nokia.printInfo();


    }

}
