package lesson4;

public class Main3 {
    public static void main(String[] args) {
        String text = "text to print";

        String text1 = "new day";

        String text2 = text1.replace('w', 'W'); //замена символа
        System.out.println(text2);

        String textUpper = text.toUpperCase(); // замена символов на верхний регистр
        System.out.println(textUpper);

        char ch = text1.charAt(0);
        System.out.println(ch); // выбор любого символа

        String text3 = text.concat(text1); //склеивание 2-х текстов
        System.out.println(text3);

    }
}
