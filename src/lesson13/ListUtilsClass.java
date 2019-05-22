package lesson13;

import java.util.Arrays;
import java.util.List;

public class ListUtilsClass implements ListUtils {


    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        return Arrays.asList(strings);
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        return data;

    }


}
