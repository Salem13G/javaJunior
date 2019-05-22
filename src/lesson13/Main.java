package lesson13;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> frig = new HashMap<>();
        frig.put ("apple", 3);
        frig.put ("grusha", 4);
        frig.put ("sliva", 6);

        for (String key:frig.keySet()){
            System.out.println(key + " " + frig.get(key));
        }
    }
}
