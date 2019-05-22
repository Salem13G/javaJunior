package lesson13;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(5);
        list.add("первый параметр");
        list.add("второй параметр");
        list.add("третий параметр");
        list.add("четвертый параметр");
        list.add("пятый параметр");

        for (int i = list.size()-1; i<list.size(); i--){
            System.out.println(list.get (i));
        }



    }
}
