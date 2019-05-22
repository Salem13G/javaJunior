package lesson3;

public class DZ5 {
    public static void main(String[] args) {
        String text = "У меня все хорошо, замечательно, у меня все - получается!";
        for (int i = 0; i < 1; i++) {

            String line = text.replaceAll(","," ").replaceAll("!"," ").replaceAll("-"," ");
             System.out.println(line);
        }


    }

}
