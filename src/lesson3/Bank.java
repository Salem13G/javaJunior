package lesson3;

public class Bank {
    public static void main(String[] args) {
        int year = 20;
        int procent = 7;
        int depo = 10000;

        for (int i =  0; i < year; i++){
            depo = depo + ((depo/100)*7);


        }
        System.out.println(depo); // правильное решение
    }
}
