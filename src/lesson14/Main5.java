package lesson14;

public class Main5 {
    public static void main(String[] args) {
        StringUtilsClass stringUtils = new StringUtilsClass();
        double result = stringUtils.div ("12", "5");

        int[] findWord = stringUtils.findWord("one two java three java four five six java seven", "java");

        System.out.println(result);
        System.out.println(findWord);
    }
}
