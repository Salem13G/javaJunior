package lesson9.Practice;

public class Main {
    public static void main(String[] args) {
        Qiwi qiwi = new Qiwi();
        Apple apple = new Apple();
        Fruit fruit = new Fruit();

        Fruit [] fruits = new Fruit[2];
        fruits [0] = qiwi;
        fruits [1] = apple;

        for (Fruit f:fruits){
            System.out.println(f);
        }
    }
}
