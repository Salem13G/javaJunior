package lesson4;

public class DZ2 {
    public static void main(String[] args) {
        String text = "London is a capital of the Great Britain";
        String[] text2 = text.split("\\s"); //разделение строки по словам, но можно было и по пробелам " "
        for (String res : text2) {
            System.out.println(res);
        }
    }
}
