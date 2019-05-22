package lesson12;

import lesson11.Coin;

import java.util.Comparator;

public class SortByDiameter implements Comparator <Coin> {

    @Override
    public int compare(Coin o1, Coin o2) {


        if (o1.getNominal() != o2.getNominal()){
            return o1.getNominal() - o2.getNominal();
        }
        if (o2.getYear() != o1.getYear()){
            return o2.getYear() - o1.getYear();
        }

        return o1.getDiameter() - o2.getDiameter();

    }
}
