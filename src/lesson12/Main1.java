package lesson12;

import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {


        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(12);
        numbers.add(112);
        numbers.add(122);
        numbers.add(162);
        numbers.add(-12);

        for (Number n:numbers){
            System.out.println(n);
        }
    }

}
