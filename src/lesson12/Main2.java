package lesson12;

import lesson11.Coin;

import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5,2,1900);
        Coin coin2 = new Coin(5,3,1900);
        Coin coin3 = new Coin(4,6,1901);
        Coin coin4 = new Coin(7,7,1902);
        Coin coin5 = new Coin(2,8,1903);
        TreeSet<Coin> coins = new TreeSet<>(new SortByDiameter());
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin c:coins){
            System.out.println(c);
    }
}
}
