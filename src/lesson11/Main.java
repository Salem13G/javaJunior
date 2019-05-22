package lesson11;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>(); //коллекция
        texts.add("fuckingshit");
        texts.add("bhjkbg");
        texts.add("bvc");
        texts.add("mn");
        texts.add(2, "jhlp"); //ставит элемент в ячейку 2
        texts.set(1, "qiso"); //заменяет элементом данные в указанной ячейке


        for (String s : texts) {
            System.out.println(s);
        }
        for (int i = 0; i < texts.size(); i++) {
            System.out.println(texts.get(i));

        }
        // for (Iterator<String>; iter = texts.iterator(); iter.hashNext (); ){
        //   System.out.println(iter.next); еще раз посмотреть

    }

    }

