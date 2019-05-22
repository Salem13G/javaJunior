package lesson3;

public class Main4 {
    public static void main(String[] args) {
        char[] simbols = {'s', 'a', 'g', 'e'}; // вывести гласные на консоль
        for (int i = 0; i < simbols.length; i++ ) {
            if (simbols [i] == 'a' || simbols [i] == 'e'){ //здесь перечисляем все гласные массива
                System.out.println(simbols [i]);
            }
        }

        }
    }
