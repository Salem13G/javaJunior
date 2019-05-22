package lesson4;

public class DZ1 {
    public static void main(String[] args) {

        String text = "London is a capital of the Great Britain";
        String res = text.replaceAll(" ", "");
        for (int i = 0; i < res.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(res.charAt(i)); //не пойму почему ошибка... Но ответ все равно выдает верный))
            }

        }
    }
}


