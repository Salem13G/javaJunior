package lesson3;

public class DZ6 {
    public static void main(String[] args) {
        char[] mass1 = {'a', 'b', 'c', 'd'};
        char[] mass2 = {'q', 'w', 'e', 'r'};
        String text = "Are you ready to start studying of programming?";
        for (int i = 0; i < 1; i++) {
            String line = text.replaceAll("A", "Q").replaceAll("a", "q").replaceAll("d", "r");
            System.out.println(line);

        }

    }
}
