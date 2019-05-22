package lesson3;

public class DZ6_1 {
    public static void main(String[] args) {
        char[] mass1 = {'a', 'b', 'c', 'd'};
        char[] mass2 = {'q', 'w', 'e', 'r'};
        String text = "Are you ready to start studying of programming?";
        for (char i = 0; i < mass1.length; i++) {
            mass1[i] = mass2[i];


        }
        System.out.println(text);
    }
}
