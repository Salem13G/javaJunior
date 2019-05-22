package lesson4;

public class DZ3 {
    public static void main(String[] args) {
        String text = "London is a capital of the Great Britain";
        char []reverse = text.toCharArray();
        for (int i = text.length()-1; i >=0; i--){
            System.out.print(reverse [i]);
        }

    }
}
