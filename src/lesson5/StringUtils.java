package lesson5;

public class StringUtils {
    public static String textReverse(String text) {
        return new StringBuilder(text).reverse().toString();

    }

    public static String glasnieFromText(String text) {
        char[] simbols = text.toCharArray(); // преобразуем в массив
        for (char ch : simbols){
            if (ch == 'a'|| ch == 'e'||ch == 'i'){
                System.out.print(ch);

            }
        }
        System.out.println();

        return text;
    }
}


