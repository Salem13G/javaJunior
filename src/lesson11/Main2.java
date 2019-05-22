package lesson11;

import java.util.HashSet;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        //чтобы класть инты используем интегер
        //LinkedHashSet<Integer> numbers = new LinkedHashSet<>(); - либо так.
        numbers.add(4);
        numbers.add(34);
        numbers.add(56);
        numbers.add(2);
        numbers.add(67);
        numbers.add(5);
        numbers.add(56);

        for (Iterator <Integer> iter = numbers.iterator(); iter.hasNext();){ //оставляет только уникальные числа
            System.out.println(iter.next());
        }

    }
}
