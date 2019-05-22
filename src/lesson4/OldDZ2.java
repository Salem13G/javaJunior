package lesson4;

public class OldDZ2 {
    public static void main(String[] args) {
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] qwer = {'q', 'w', 'e', 'r'};
        String text = "Are you ready to start studying of programming";
        text = text.toLowerCase(); //можно поставить стринг вначале но тогда имя переменной задать другое
        String result = text;  //можно так: String result = text.toLowerCase(); тогда предыдущая строка не нужна
        for (int i = 0; i < abcd.length; i++) {
            result = result.replace(abcd[i], qwer[i]);
            System.out.println(result);

        }

    }
}
